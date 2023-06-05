package com.emmanuel_rono.harry_potter_api

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object ApiClient {
    private val base_Url="https://hp-api.onrender.com/api"
 //creating Retrofit
    private val retrofit: Retrofit by lazy {
        Retrofit.Builder()
            .baseUrl(base_Url)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
    }
    //
    val chaApiService:ApiService by lazy {
        retrofit.create(ApiService::class.java)
    }

}