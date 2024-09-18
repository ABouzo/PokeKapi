package me.bouzo.pokeKapi.data.models.items.item

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import me.bouzo.pokeKapi.data.models.utility.NamedAPIResource

/**
 * Pokémon that might be found in the wild holding this item.
 *
 * @property pokemon The Pokémon that holds this item.
 * @property versionDetails The details for the version that this item is held in by the Pokémon.
 */
@Serializable
data class ItemHolderPokemon(
    val pokemon: NamedAPIResource,
    @SerialName("version_details") val versionDetails: List<ItemHolderPokemonVersionDetail>
)