package me.bouzo.pokeKapi.koin

import kotlinx.coroutines.Dispatchers
import me.bouzo.pokeKapi.data.createJsonConfig
import me.bouzo.pokeKapi.data.network.createHttpClient
import org.koin.core.qualifier.named
import org.koin.dsl.module
import kotlin.coroutines.CoroutineContext

internal val networkModule = module {
    single {
        createHttpClient(get())
    }
    single {
        createJsonConfig()
    }

    single<CoroutineContext>(named(NETWORK_COROUTINE_CONTEXT)) {
        Dispatchers.Default
    }

    single(named(BASE_URL_QUALIFIER)) {
        "https://pokeapi.co/api/v2"
    }
}

internal const val BASE_URL_QUALIFIER = "PokeApiBaseUrl"
internal const val NETWORK_COROUTINE_CONTEXT = "NetworkCoroutineContext"