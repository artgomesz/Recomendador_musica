package com.tasteMusic.TasteMusic.Client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;

@FeignClient(
    name = "albumSpotifyClient",
    url = "https://api.spotify.com"
)
public interface AlbumSpotify {

    @GetMapping(value = "/v1/albums/4aawyAB9vmqN3uQ7FjRGTy")
    ResponseAlbum getReleases(@RequestHeader("Authorization") String authorization);
}
