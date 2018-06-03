package com.example.bartek.astroweather.data;

import org.json.JSONException;
import org.json.JSONObject;

/**
 * Created by Bartek on 2018-06-03.
 */

public class Location implements JSONPopulator {
    private String city;

    public String getCity() {
        return city;
    }

    @Override
    public void populate(JSONObject data) {
        city = data.optString("city");
    }

    @Override
    public JSONObject toJSON() {
        JSONObject data= new JSONObject();
        try {
            data.put("city",city);
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return data;
    }
}
