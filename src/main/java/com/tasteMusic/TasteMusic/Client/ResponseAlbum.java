package com.tasteMusic.TasteMusic.Client;

public class ResponseAlbum {

    private AlbumWrapper albums;

    public AlbumWrapper getAlbums() {
        return albums;
    }

    public void setAlbums(AlbumWrapper albums) {
        this.albums = albums;
    }

    public ResponseAlbum() {
    }

    public ResponseAlbum(AlbumWrapper albums) {
        this.albums = albums;
    }

    

    

}
