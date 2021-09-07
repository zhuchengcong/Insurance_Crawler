package com.radinfo.safe.controller;

import com.radinfo.safe.request.LoginRequest;
import com.radinfo.safe.service.Safeservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SafeController {


    @Autowired
    private Safeservice safeservice;

//    @UserLoginToken
    @RequestMapping(value = "login", produces = "application/json;charset=utf-8",method = RequestMethod.POST,consumes = MediaType.APPLICATION_JSON_UTF8_VALUE )
    public int login(@RequestBody LoginRequest loginRequest) {
//
        return safeservice.SafeLogin(loginRequest);
    }

    @RequestMapping(value = "/search/certiList", produces = "application/json;charset=utf-8",method = RequestMethod.GET,consumes = MediaType.APPLICATION_JSON_UTF8_VALUE )
    public int searchCertiList(String carNumber) {
        return safeservice.SearchCopyCertiList(carNumber);
    }

}
