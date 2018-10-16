package com.imooc.user.response;

/**
 * Created by nnkwrik
 * 18/08/29 21:32
 */
public class LoginResponse extends Response {


    private String token;

    public LoginResponse(String token) {
        this.token = token;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }
}
