package com.example.appnewyorktimes

import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Url

interface APIService {
@GET
suspend fun getReponse(@Url url: String): Response<Respuesta>
}