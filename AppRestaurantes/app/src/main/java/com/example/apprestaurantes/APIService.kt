package com.example.apprestaurantes

import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Url

interface APIService {
   @GET
   suspend fun getRestaurantes(@Url url:String):Response<DataRestaurantes>

   @GET
   suspend fun getUsuarios(@Url url:String):Response<DataUsers>
}