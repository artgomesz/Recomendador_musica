package com.tasteMusic.TasteMusic.controller;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tasteMusic.TasteMusic.Client.Album;
import com.tasteMusic.TasteMusic.Client.AlbumSpotify;
import com.tasteMusic.TasteMusic.Client.AuthSpotify;
import com.tasteMusic.TasteMusic.Client.LoginRequest;

@RestController
@RequestMapping("/spotify")
public class musicController {

    private final AuthSpotify authSpotify;
    private final AlbumSpotify albumSpotify;


    public musicController(AuthSpotify authSpotify, AlbumSpotify albumSpotify) {
        this.authSpotify = authSpotify;
        this.albumSpotify = albumSpotify;
    }

    @GetMapping("/artist")
    public ResponseEntity <List<Album>>helloWord(){
        var request = new LoginRequest(
            "client_credentials",
            "b3ac16c381eb49058b8e7f6202eb78c7",
            "bf5b8f40514146d294b5400f7f8c2419"
        );
       var token= authSpotify.login(request).getAcessToken();

       var response = albumSpotify.getReleases("Bearer" + token);

        return ResponseEntity.ok(response.getAlbums().getItems());

    }
}
