package com.emmanuel_rono.harry_potter_api

import retrofit2.http.GET

interface ApiService {
    @GET("/characters")
    suspend fun getCharcters():List<CharactersItem>
}