package com.radinfo.safe.manager;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.radinfo.safe.mapper.PolicyInputMapper;
import com.radinfo.safe.request.LoginRequest;
import okhttp3.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.io.File;

@Component
public class CacheManager {

    public static String token = "";
    public static String userCode = "";
    public static String comCode = "";
    public static String AUTHOR_TOKEN="";
    private Logger logger= LoggerFactory.getLogger(this.getClass());
    public  static CacheManager cacheManager;

    @Autowired
    private PolicyInputMapper policyInputMapper;

    @Value("${radinfo.safe.usercode}")
    private  String loginCode;

    @Value("${radinfo.safe.password}")
    private  String passWord;

    @Value("${radinfo.other.safe.url}")
    private  String safeUrl;

    @PostConstruct
    public void init(){
        cacheManager=this;
        cacheManager.logger=this.logger;
        cacheManager.policyInputMapper=this.policyInputMapper;
        cacheManager.loginCode=this.loginCode;
        cacheManager.passWord=this.passWord;
        cacheManager.safeUrl=this.safeUrl;
    }

    @Scheduled(fixedDelayString="${radinfo.safe.login.usetime}")
    public void cacheLogin() {
        //每30分钟执行一次缓存
        cacheManager.logger.info("login .start：" + cacheManager.loginCode);
        try {
            LoginRequest loginRequest=new LoginRequest();
            loginRequest.setUserCode(cacheManager.loginCode);
            loginRequest.setPassword(cacheManager.passWord);
            loginRequest.setRandomCode("");
            OkHttpClient client = new OkHttpClient().newBuilder()
                    .build();
            MediaType mediaType = MediaType.parse("application/json");
            RequestBody body = RequestBody.create(mediaType, JSON.toJSONString(loginRequest));
            Request request = new Request.Builder()
                    .url( cacheManager.safeUrl+"/carDomainApi/authorize/login")
                    .method("POST", body)
                    .addHeader("Content-Type", "application/json")
                    .build();
            Response response = client.newCall(request).execute();
            String jsonStr = response.body().string();
            cacheManager.logger.info("SyncDataToSafe Login：" + jsonStr);
            JSONObject jsonObject = JSONObject.parseObject(jsonStr.trim());
            jsonStr = jsonObject.getString("data");
            int responseCode=jsonObject.getInteger("status");
            if (responseCode==0){
                cacheManager.logger.info("App-safe Login.success:"+loginRequest.getUserCode());
                jsonObject = JSONObject.parseObject(jsonStr.trim());
                userCode = jsonObject.getString("userCode");
                comCode=jsonObject.getString("comCode");
                token=jsonObject.getString("token");
                AUTHOR_TOKEN=userCode+"_"+comCode+"_"+token;
                cacheManager.logger.info("AUTHOR_TOKEN:"+AUTHOR_TOKEN);
            }else {
                cacheManager.logger.info("App-safe Login.false:"+loginRequest.getUserCode());
            }
        }catch (Exception e){
            cacheManager.logger.error("App-safe Login.error:"+e.getMessage());
            e.printStackTrace();
        }
    }

}
