package com.dma.tamim.Helper;

import com.dma.tamim.Retrofit.IMenuRequest;
import com.dma.tamim.Retrofit.RetrofitClient;

public class Common {
    public static IMenuRequest getMenuRequest(){
        return RetrofitClient.getClient("https://api.androidhive.info/").create(IMenuRequest.class);
    }
}
