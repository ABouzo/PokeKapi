package me.bouzo.pokeKapi.data.models.items.item

import kotlinx.serialization.Serializable
import me.bouzo.pokeKapi.data.models.utility.NamedAPIResource

@Serializable
data class ItemHolderPokemonVersionDetail(
    val rarity: Int,
    val version: NamedAPIResource
)