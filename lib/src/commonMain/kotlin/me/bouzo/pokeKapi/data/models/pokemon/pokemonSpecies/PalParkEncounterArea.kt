package me.bouzo.pokeKapi.data.models.pokemon.pokemonSpecies

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import me.bouzo.pokeKapi.data.models.utility.NamedApiResource

/**
 * @property baseScore The base score given to the player when the referenced Pokémon is caught during a pal park run.
 * @property rate The base rate for encountering the referenced Pokémon in this pal park area.
 * @property area The pal park area where this encounter happens.
 */
@Serializable
data class PalParkEncounterArea(
    @SerialName("base_score") val baseScore: Int,
    val rate: Int,
    val area: NamedApiResource,
)