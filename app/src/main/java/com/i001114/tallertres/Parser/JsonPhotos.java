package com.i001114.tallertres.Parser;

import com.i001114.tallertres.Models.Photos;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by CAMILO on 4/10/2017.
 */

public class JsonPhotos {

    public static List<Photos> getData(String content) throws JSONException {
        JSONArray jsonArray = new JSONArray(content);
        List<Photos> photosList = new ArrayList<>();
        for (int i = 0; i < jsonArray.length(); i++){
            JSONObject item = jsonArray.getJSONObject(i);
            Photos photos = new Photos();
            photos.setTitle(item.getString("title"));
            photos.setFotosUrl(item.getString("url"));

            photosList.add(photos);
        }
        return photosList;
    }

}
