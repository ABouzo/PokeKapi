package me.bouzo.pokeKapi.data.network

import io.ktor.client.HttpClient
import io.ktor.client.plugins.contentnegotiation.ContentNegotiation
import io.ktor.serialization.kotlinx.json.json
import kotlinx.serialization.json.Json

fun createHttpClient(jsonConfig: Json) = HttpClient {
    install(ContentNegotiation) {
        json(jsonConfig)
    }
}