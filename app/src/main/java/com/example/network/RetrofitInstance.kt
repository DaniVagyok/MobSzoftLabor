package com.example.network

import retrofit2.Retrofit
import com.example.network.NetworkConfig.Companion.BASE_URL
import io.swagger.client.api.PostsApi
import retrofit2.converter.gson.GsonConverterFactory

object RetrofitInstance {

    private val retrofit by lazy{
        Retrofit.Builder()
                .baseUrl(BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build()
                .create(PostsApi::class.java)
    }


}