package com.tasteMusic.TasteMusic.controller;




import java.util.Scanner;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.tasteMusic.TasteMusic.Client.Album;
import com.tasteMusic.TasteMusic.Client.AlbumForEmotion;
import com.tasteMusic.TasteMusic.Client.AlbumResponse;
import com.tasteMusic.TasteMusic.Client.AuthSpotify;
import com.tasteMusic.TasteMusic.Client.LoginRequest;
import com.tasteMusic.TasteMusic.credentials.Credentials;


@RestController
@RequestMapping("/spotify")
public class musicController {

    private final AuthSpotify authSpotify;
    private final AlbumResponse albumResponse;
    private final AlbumForEmotion albumEmotion;
    private final Credentials credentials;
   


    public musicController(AuthSpotify authSpotify,AlbumResponse albumResponse,AlbumForEmotion albumEmotion,Credentials credentials) {
        this.authSpotify = authSpotify;
        this.albumResponse = albumResponse;
        this.albumEmotion = albumEmotion;
        this.credentials = credentials;
       
    }

   
    

    @GetMapping("/artist")
    public ResponseEntity <Album> getAlbumForEmotion(){
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("How you feeling today?");
        String emotion = scanner.nextLine();
        
        
        var request = new LoginRequest(
            "client_credentials",
            credentials.CLIENT_ID.toString(),
            credentials.CLIENT_SECRET.toString()
        );
       var token= authSpotify.login(request).getAcessToken();

       String albumId = albumEmotion.getAlbumforEmotion(emotion);

       Album album = albumResponse.getAlbumyId(albumId,"Bearer " + token);

       return ResponseEntity.ok(album);

    }
}
