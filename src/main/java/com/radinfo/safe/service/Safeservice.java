package com.radinfo.safe.service;

import com.radinfo.safe.request.LoginRequest;

public interface Safeservice {
    int SyncDataToSafe(String CarNumber);// 模块一 同步数据到保单系统记录相关参数
    int SafeLogin(LoginRequest loginRequest);
    int SearchCopyCertiList(String CarNumber,String proposalNo);//模块一 通过车牌号查询投保单
}
