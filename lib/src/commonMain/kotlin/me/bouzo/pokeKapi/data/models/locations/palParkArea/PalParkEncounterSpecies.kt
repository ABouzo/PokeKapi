package me.bouzo.pokeKapi.data.models.locations.palParkArea

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import me.bouzo.pokeKapi.data.models.utility.NamedApiResource

/**
 * @property baseScore The base score given to the player when this Pokémon is caught during a pal park run.
 * @property rate The base rate for encountering this Pokémon in this pal park area.
 * @property pokemonSpecies The Pokémon species being encountered.
 */
@Serializable
data class PalParkEncounterSpecies(
    @SerialName("base_score") val baseScore: Int,
    val rate: Int,
    @SerialName("pokemon_species") val pokemonSpecies: NamedApiResource
)