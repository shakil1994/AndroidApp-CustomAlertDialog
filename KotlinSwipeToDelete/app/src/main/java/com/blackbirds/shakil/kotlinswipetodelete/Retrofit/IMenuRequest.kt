package com.blackbirds.shakil.kotlinswipetodelete.Retrofit

import com.blackbirds.shakil.kotlinswipetodelete.Model.Item
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Url

interface IMenuRequest {
    @GET("json/menu.json")
    fun getMenuList(): Call<MutableList<Item>>
}