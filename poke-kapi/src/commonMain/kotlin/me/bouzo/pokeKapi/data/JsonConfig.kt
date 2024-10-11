package me.bouzo.pokeKapi.data

import kotlinx.serialization.json.Json

fun createJsonConfig(): Json = Json {
    ignoreUnknownKeys = true
    explicitNulls = false
}