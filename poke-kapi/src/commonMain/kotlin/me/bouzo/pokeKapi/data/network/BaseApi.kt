package me.bouzo.pokeKapi.data.network

import io.ktor.client.HttpClient
import io.ktor.client.call.body
import io.ktor.client.request.get
import io.ktor.http.ContentType
import io.ktor.http.contentType
import kotlinx.coroutines.withContext
import me.bouzo.pokeKapi.Errors
import me.bouzo.pokeKapi.koin.BASE_URL_QUALIFIER
import me.bouzo.pokeKapi.koin.NETWORK_COROUTINE_CONTEXT
import me.bouzo.pokeKapi.koin.PokeKapiKoinComponent
import org.koin.core.component.inject
import org.koin.core.qualifier.named
import kotlin.coroutines.CoroutineContext


internal class BaseApi : PokeKapiKoinComponent() {
    private val httpClient: HttpClient by inject()
    private val coroutineContext: CoroutineContext by inject(named(NETWORK_COROUTINE_CONTEXT))
    private val baseUrl: String by inject(named(BASE_URL_QUALIFIER))

    suspend inline fun <reified T> fetch(endpoint: String): Result<T> =
        withContext(coroutineContext) {
            try {
                val response = httpClient.get("$baseUrl$endpoint") {
                    contentType(ContentType.Application.Json)
                }
                val data: T = response.body()
                Result.success(data)
            } catch (ex: Exception) {
                Result.failure(Errors.Network(ex))
            }
        }

    suspend inline fun <reified T> fetchPagination(
        endpoint: String, limit: Int, offset: Int
    ): Result<T> = fetch("$endpoint?limit=$limit&offset=$offset")

    companion object {
        const val ROOT_ENDPOINT = "https://pokeapi.co/api/v2"
    }
}