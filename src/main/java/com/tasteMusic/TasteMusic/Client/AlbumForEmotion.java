package com.tasteMusic.TasteMusic.Client;


import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Component;

@Component
public class AlbumForEmotion {


    public static Map<String,List<String>> forEmotion = new HashMap<>();

    

    static{

        forEmotion.put("happy", Arrays.asList("2nkto6YNI4rUYTLqEwWJ3o","6QPkyl04rXwTGlGlcYaRoW","6oxVabMIqCMJRYN1GqR3Vf","2if1gb3t6IkhiKzrtS9Glc","4bTjdxhRRUiWfwj200f9Kl"));
        forEmotion.put("angry", Arrays.asList("7kW0cpKgSVsEqcc8xgbSb0","6PFPjumGRpZnBzqnDci6qJ","1GjjBpY2iDwSQs5bykQI5e","7o4UsmV37Sg5It2Eb7vHzu","3HCCUaRSjHSFOe4fqE0BiP"));
        forEmotion.put("chill", Arrays.asList("7aJuG4TFXa2hmE4z1yxc3n","07w0rG5TETcyihsEIZR3qG","2sij95QgjmgrhNv33achzn","1jzqEyjugAp9iLtRsj9LZg","6m5qlaMzLtNsQDj3DQY5ji"));
        forEmotion.put("sad",Arrays.asList("0tzfI6NFJqcJkWb23R3lRZ","4FCoFSNIFhK36holxHWCnc","0YjOnBY0FRufcmNBTzWTgX","2Cn1d2KgbkAqbZCJ1RzdkA","10WzRaNWnFUQNrW2FpqQSQ"));
        forEmotion.put("confident",Arrays.asList("5G5rgQHzdQnw32SI0WjIo5","78iX7tMceN0FsnmabAtlOC","2HTbQ0RHwukKVXAlTmCZP2","5IFOummNcGXY3qCBWRchqP","3soSRzbPLtJEstj20sQTnK"));
        forEmotion.put("nostalgic", Arrays.asList("1Gjf9WFBefwPqt7PxGH1n2","1FvdZ1oizXwF9bxogujoF0","2ANVost0y2y52ema1E9xAZ","7JK7Rh9KcZCZJZXztRXHGK","5FDIw0ifQrQp63uhTelMVJ"));
        forEmotion.put("thoughtful",Arrays.asList("30RaVhHvR6uyl4UclRv45Z","2BlL4Gv2DLPu8p58Wcmlm9","01OPbIdmt1ziRmDLiUwWoK","4JAvwK4APPArjIsOdGoJXX","5ra51AaWF3iVebyhlZ1aqq"));
    }

    public String getAlbumforEmotion(String emotion){
        
        String normalizated = emotion.toLowerCase();

        List<String> album = forEmotion.get(normalizated);

        if (album != null && !album.isEmpty()) {
            
            int randomIndex = (int) (Math.random() * album.size());

            return album.get(randomIndex);
        }

        return null;
        
        
    }

   
}
