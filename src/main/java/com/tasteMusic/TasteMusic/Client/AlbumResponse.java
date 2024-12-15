package com.tasteMusic.TasteMusic.Client;



import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestHeader;


@FeignClient(
    name = "ResponseAlbum",
    url = "https://api.spotify.com"
)

public interface AlbumResponse {

   @GetMapping("v1/albums/{id}")
   Album getAlbumyId(
    @PathVariable("id")String albumId,@RequestHeader("Authorization")String token
   );
}
