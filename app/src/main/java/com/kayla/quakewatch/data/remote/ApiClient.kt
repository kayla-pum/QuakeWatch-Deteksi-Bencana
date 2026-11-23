package com.kayla.quakewatch.data.remote

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

/**
 * Singleton objek untuk menginisialisasi instance Retrofit.
 * Menggunakan Base URL resmi BMKG.
 */
object ApiClient {
    private const val BASE_URL = "https://data.bmkg.go.id/DataMKG/TEWS/"

    val apiService: BmkgApiService by lazy {
        Retrofit.Builder()
            .baseUrl(BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
            .create(BmkgApiService::class.java)
    }
}
