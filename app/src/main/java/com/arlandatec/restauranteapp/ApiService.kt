package com.arlandatec.restauranteapp

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.http.GET

interface ApiService {
    @GET("productos")
    suspend fun getProductos(): List<Producto>
}

object RetrofitClient {
    private const val BASE_URL = "http://10.0.0.2:8080/api/"

    val apiService: ApiService by lazy {
        Retrofit.Builder()
            .baseUrl(BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
            .create(ApiService::class.java)
    }
}