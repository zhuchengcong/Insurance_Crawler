package com.radinfo.safe.manager;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.radinfo.safe.domain.http.CertiListData;
import com.radinfo.safe.mapper.PolicyInputMapper;
import com.radinfo.safe.request.CertiListRequset;
import com.radinfo.safe.request.LoginRequest;
import okhttp3.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.List;
import java.util.concurrent.TimeUnit;

@Component
public class Safemanager {
    private Logger logger= LoggerFactory.getLogger(this.getClass());
    public  static Safemanager Safemanager;
    @Autowired
    private PolicyInputMapper policyInputMapper;

    @Value("${radinfo.other.safe.url}")
    private  String safeUrl;

    @PostConstruct
    public void init(){
        Safemanager=this;
        Safemanager.logger=this.logger;
        Safemanager.policyInputMapper=this.policyInputMapper;
        Safemanager.safeUrl=this.safeUrl;
    }

    public static  synchronized  int SearchCopyCertiList(String carNumber){
        Safemanager.logger.info("App-safe SearchCopyCertiList .start：" + carNumber);
        CertiListRequset certiListRequset=new CertiListRequset();
        CertiListRequset.Querydata querydata=new CertiListRequset().new Querydata();
        CertiListRequset.Pager pager=new CertiListRequset().new Pager();
        querydata.setLicenseNo(carNumber);//车牌号
        certiListRequset.setQueryData(querydata);
        certiListRequset.setPager(pager);
        Safemanager.logger.info("App-safe SearchCopyCertiList .certiListRequset：" + JSON.toJSONString(certiListRequset));
        try {
            OkHttpClient client = new OkHttpClient().newBuilder()
                    .connectTimeout(10000, TimeUnit.SECONDS)
                    .readTimeout(20000, TimeUnit.SECONDS)
                    .build();
            MediaType mediaType = MediaType.parse("application/json");
            RequestBody body = RequestBody.create(mediaType, JSON.toJSONString(certiListRequset));
            Request request = new Request.Builder()
                    .url(Safemanager.safeUrl+"/carDomainApi/proposal/main/search/copy/certiList")
                    .method("POST", body)
                    .addHeader("AUTHOR-TOKEN", CacheManager.AUTHOR_TOKEN)
                    .addHeader("Content-Type", "application/json")
                    .build();
            Response response = client.newCall(request).execute();
            String jsonStr = response.body().string();
            Safemanager.logger.info("SyncDataToSafe Login：" + jsonStr);
            JSONObject jsonObject = JSONObject.parseObject(jsonStr.trim());
            jsonStr = jsonObject.getString("data");
            int responseCode=jsonObject.getInteger("status");
            if (responseCode==0){
                Safemanager.logger.info("App-safe SearchCopyCertiList.success:"+certiListRequset.getQueryData().getLicenseNo());
                jsonObject = JSONObject.parseObject(jsonStr.trim());
                jsonStr = jsonObject.getString("data");
                List<CertiListData> list=JSONObject.parseArray(jsonStr, CertiListData.class);
                Safemanager.logger.info("App-safe SearchCopyCertiList:"+JSON.toJSONString(list));
                for (CertiListData item:list){
                    checkProposal(item.getCertiNo());
                }
            }else {
                Safemanager.logger.info("App-safe SearchCopyCertiList.false:"+certiListRequset.getQueryData().getLicenseNo());
                return -1;
            }
        }catch (Exception e){
            Safemanager.logger.error("App-safe SearchCopyCertiList.error:"+e.getMessage());
            e.printStackTrace();
            return -1;
        }
        return 0;
    }

    //https://prd.urtrust.com.cn/carDomainApi/proposal/main/check/proposal/901032123101890086691
    public static String checkProposal(String certiNo){//是否将车辆加入501032113100660000760协议下？
        Safemanager.logger.info("checkProposal start:"+certiNo);
        String jsonStr="";
        try {
            OkHttpClient client = new OkHttpClient().newBuilder()
                    .build();
            MediaType mediaType = MediaType.parse("text/plain");
            RequestBody body = RequestBody.create(mediaType, "");
            Request request = new Request.Builder()
                    .url(Safemanager.safeUrl+"/carDomainApi/proposal/main/check/proposal/"+certiNo)
                    .method("POST", body)
                    .addHeader("AUTHOR-TOKEN", CacheManager.AUTHOR_TOKEN)
                    .build();
            Response response = client.newCall(request).execute();
            jsonStr = response.body().string();
            Safemanager.logger.info("checkProposal ：" + jsonStr);
//            JSONObject jsonObject = JSONObject.parseObject(jsonStr.trim());
//            jsonStr = jsonObject.getString("data");
            proposalBICI(certiNo);
        }catch (Exception e){
            Safemanager.logger.error("checkProposal error:"+e.getMessage());
            e.printStackTrace();
            return null;
        }
        return jsonStr;
    }
    // https://prd.urtrust.com.cn/carDomainApi/proposal/main/search/proposalBICI/901032123101890086691
    public  static  String proposalBICI(String certiNo){//加载保单详情数据
        Safemanager.logger.info("proposalBICI start:"+certiNo);
        String jsonStr="";
        try{
            OkHttpClient client = new OkHttpClient().newBuilder()
                    .build();
            MediaType mediaType = MediaType.parse("text/plain");
            RequestBody body = RequestBody.create(mediaType, "");
            Request request = new Request.Builder()
                    .url(Safemanager.safeUrl+"/carDomainApi/proposal/main/search/proposalBICI/"+certiNo)
                    .method("POST", body)
                    .addHeader("AUTHOR-TOKEN", CacheManager.AUTHOR_TOKEN)
                    .build();
            Response response = client.newCall(request).execute();
            jsonStr = response.body().string();
            Safemanager.logger.info("proposalBICI ：" + jsonStr);
            JSONObject jsonObject = JSONObject.parseObject(jsonStr.trim());
            jsonStr = jsonObject.getString("data");
        }catch (Exception e){
            Safemanager.logger.error("proposalBICI error:"+e.getMessage());
            e.printStackTrace();
        }
        return jsonStr;
    }

    public static  synchronized  int login(LoginRequest loginRequest){
        Safemanager.logger.info(" App-safe login .start：" + loginRequest.getUserCode());
        try {
            OkHttpClient client = new OkHttpClient().newBuilder()
                    .build();
            MediaType mediaType = MediaType.parse("application/json");
            RequestBody body = RequestBody.create(mediaType, JSON.toJSONString(loginRequest));
            Request request = new Request.Builder()
                    .url( Safemanager.safeUrl+"/carDomainApi/authorize/login")
                    .method("POST", body)
                    .addHeader("Content-Type", "application/json")
//                    .addHeader("Cookie", "SESSION=9627e1c0-c30c-4ed9-9f86-cb352c5df917")
                    .build();
            Response response = client.newCall(request).execute();
            String jsonStr = response.body().string();
            Safemanager.logger.info("App-safe Login：" + jsonStr);
            JSONObject jsonObject = JSONObject.parseObject(jsonStr.trim());
            jsonStr = jsonObject.getString("data");
            int responseCode=jsonObject.getInteger("status");
            if (responseCode==0){
                Safemanager.logger.info("App-safe Login.success:"+loginRequest.getUserCode());
            }else {
                Safemanager.logger.info("App-safe Login.false:"+loginRequest.getUserCode());
                return -1;
            }
        }catch (Exception e){
            Safemanager.logger.error("App-safe Login.error:"+e.getMessage());
            e.printStackTrace();
            return -1;
        }
        return 0;
    }
}
