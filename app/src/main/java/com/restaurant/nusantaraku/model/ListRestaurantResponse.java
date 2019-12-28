package com.restaurant.nusantaraku.model;

import com.google.gson.annotations.SerializedName;
import com.restaurant.nusantaraku.model.RestaurantItem;

import java.util.List;

public class ListRestaurantResponse{
    @SerializedName("data")
    private List<RestaurantItem> data;
    @SerializedName("status")
    private String status;
    public void setData(List<RestaurantItem> data){
        this.data = data;
    }
    public List<RestaurantItem> getData(){
        return data;
    }
    public void setStatus(String status){
        this.status = status;
    }
    public String getStatus(){
        return status;
    }
}
