package com.tasteMusic.TasteMusic.Client;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Images {

    @JsonProperty("url")
    private String url;

    @JsonProperty("width")
    private int width;

    @JsonProperty("height")
    private int height;
    
    
    
    public Images() {
    }

    public Images(String url, int width, int height) {
        this.url = url;
        this.width = width;
        this.height = height;
    }
    
    public String getUrl() {
        return url;
    }
    public void setUrl(String url) {
        this.url = url;
    }
    public int getWidth() {
        return width;
    }
    public void setWidth(int width) {
        this.width = width;
    }
    public int getHeight() {
        return height;
    }
    public void setHeight(int height) {
        this.height = height;
    }

    
}
