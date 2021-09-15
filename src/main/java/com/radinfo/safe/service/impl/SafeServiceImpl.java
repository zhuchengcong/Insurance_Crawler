package com.radinfo.safe.service.impl;

import com.radinfo.safe.manager.Safemanager;
import com.radinfo.safe.request.LoginRequest;
import com.radinfo.safe.service.Safeservice;
import org.springframework.stereotype.Service;

@Service
public class SafeServiceImpl implements Safeservice {
    private Safemanager safemanager;
    @Override
    public int SyncDataToSafe(String CarNumber) {
        return 0;
    }

    @Override
    public int SafeLogin(LoginRequest loginRequest) {
        return safemanager.login(loginRequest);
    }

    @Override
    public int SearchCopyCertiList(String CarNumber,String proposalNo) {
        return safemanager.SearchCopyCertiList(CarNumber,proposalNo);
    }
}
