package me.bouzo.pokeKapi.koin

import org.koin.core.Koin
import org.koin.core.component.KoinComponent
import org.koin.core.module.Module
import org.koin.dsl.koinApplication

internal object PokeKapiKoinContext {
    val koinApp = koinApplication {
        modules(networkModule)
    }

    val koin: Koin = koinApp.koin
}

internal abstract class PokeKapiKoinComponent : KoinComponent {
    override fun getKoin(): Koin = PokeKapiKoinContext.koin
}