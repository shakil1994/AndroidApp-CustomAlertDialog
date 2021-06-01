package com.blackbirds.shakil.kotlinswipetodelete.Common

import com.blackbirds.shakil.kotlinswipetodelete.Retrofit.IMenuRequest
import com.blackbirds.shakil.kotlinswipetodelete.Retrofit.RetrofitClient.getClient

object Common {
    val menuRequest: IMenuRequest
        get() = getClient("https://api.androidhive.info/")!!.create(
                IMenuRequest::class.java
        )
}