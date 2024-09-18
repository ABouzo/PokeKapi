package me.bouzo.pokeKapi.data.models.items.item

import kotlinx.serialization.Serializable
import me.bouzo.pokeKapi.data.models.utility.NamedAPIResource

/**
 * The details for the version that this item is held in by the Pokémon.
 *
 * @property rarity How often this Pokémon holds this item in this version.
 * @property version The version that this item is held in by the Pokémon.
 */
@Serializable
data class ItemHolderPokemonVersionDetail(
    val rarity: Int,
    val version: NamedAPIResource
)