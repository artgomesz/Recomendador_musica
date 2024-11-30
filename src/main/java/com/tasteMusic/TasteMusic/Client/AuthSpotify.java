package com.tasteMusic.TasteMusic.Client;


import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@FeignClient(
    name = "AuthSpotifyClient",
    url = "https://accounts.spotify.com"
)

public interface AuthSpotify {

    @PostMapping(value = "/api/token", consumes = MediaType.APPLICATION_FORM_URLENCODED_VALUE )
    LoginResponse login(@RequestBody LoginRequest loginRequest);
}