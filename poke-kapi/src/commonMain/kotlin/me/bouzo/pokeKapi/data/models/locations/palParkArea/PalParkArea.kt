package me.bouzo.pokeKapi.data.models.locations.palParkArea

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import me.bouzo.pokeKapi.data.models.utility.Name

/**
 * Areas used for grouping Pokémon encounters in Pal Park. They're like habitats that are specific
 * to Pal Park.
 * see [PokeApi documentation](https://pokeapi.co/docs/v2#pal-park-areas)
 * @property id The identifier for this resource.
 * @property name The name for this resource.
 * @property names The name of this resource listed in different languages.
 * @property pokemonEncounters A list of Pokémon encountered in this pal park area along with details.
 */
@Serializable
data class PalParkArea(
    val id: Int,
    val name: String,
    val names: List<Name>,
    @SerialName("pokemon_encounters") val pokemonEncounters: List<PalParkEncounterSpecies>
)