package com.tasteMusic.TasteMusic.Client;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Album {
    
    @JsonProperty("name")
    private String name;

    @JsonProperty("images")
    private List<Images> images;

    
    
    
    
    public Album() {
    }

    public Album(String name, List<Images> images) {
        this.name = name;
        this.images = images;
        
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Images> getImages() {
        return images;
    }

    public void setImages(List<Images> images) {
        this.images = images;
    }

   

    
    
    
    
    
    
}
