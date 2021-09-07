package com.radinfo.safe.request;

import java.io.Serializable;

public class LoginRequest  implements Serializable {

    private static final long serialVersionUID = 3285917667173415461L;

    private String userCode;
    private String password;
    private String randomCode;

    public String getUserCode() {
        return userCode;
    }

    public void setUserCode(String userCode) {
        this.userCode = userCode;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getRandomCode() {
        return randomCode;
    }

    public void setRandomCode(String randomCode) {
        this.randomCode = randomCode;
    }
}
