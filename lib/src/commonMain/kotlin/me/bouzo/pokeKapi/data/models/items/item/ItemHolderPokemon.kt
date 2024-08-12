package me.bouzo.pokeKapi.data.models.items.item

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import me.bouzo.pokeKapi.data.models.utility.NamedAPIResource

@Serializable
data class ItemHolderPokemon(
    val pokemon: NamedAPIResource,
    @SerialName("version_details") val versionDetails: List<ItemHolderPokemonVersionDetail>
)