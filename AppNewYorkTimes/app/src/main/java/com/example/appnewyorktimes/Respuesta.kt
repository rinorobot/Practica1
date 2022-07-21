package com.example.appnewyorktimes

data class Respuesta(var status: String, var copyright: String, var num_results: Int, var resultados: List<Resultado>)
