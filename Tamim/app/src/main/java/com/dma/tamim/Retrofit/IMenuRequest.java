package com.dma.tamim.Retrofit;

import com.dma.tamim.Model.Item;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Url;

public interface IMenuRequest {
    @GET("json/menu.json")
    Call<List<Item>> getMenuList();
}
