package com.tasteMusic.TasteMusic.Client;

import com.fasterxml.jackson.annotation.JsonProperty;

public class LoginResponse {

    @JsonProperty("access_token")
    private String accessToken;

    public LoginResponse() {
    }

    public LoginResponse(String acessToken) {
        this.accessToken = acessToken;
    }

    public String getAcessToken() {
        return accessToken;
    }

    public void setAcessToken(String acessToken) {
        this.accessToken = acessToken;
    }
}
