package com.radinfo.safe.controller;

import com.radinfo.safe.request.LoginRequest;
import com.radinfo.safe.service.Safeservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

@RestController
public class SafeController {

//test rad update 11
    @Autowired
    private Safeservice safeservice;

//    @UserLoginToken
    @RequestMapping(value = "login", produces = "application/json;charset=utf-8",method = RequestMethod.POST,consumes = MediaType.APPLICATION_JSON_UTF8_VALUE )
    public int login(@RequestBody LoginRequest loginRequest) {
//
        return safeservice.SafeLogin(loginRequest);
    }

    @RequestMapping(value = "/search/certiList", produces = "application/json;charset=utf-8",method = RequestMethod.GET,consumes = MediaType.APPLICATION_JSON_UTF8_VALUE )
    public int searchCertiList(@RequestParam(value = "carNumber", required = false) String carNumber,
                               @RequestParam(value = "proposalNo", required = false) String proposalNo) {
        return safeservice.SearchCopyCertiList(carNumber,proposalNo);
    }

}
