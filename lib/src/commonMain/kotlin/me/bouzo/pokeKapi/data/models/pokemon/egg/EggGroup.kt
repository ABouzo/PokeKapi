package me.bouzo.pokeKapi.data.models.pokemon.egg

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import me.bouzo.pokeKapi.data.models.utility.Name
import me.bouzo.pokeKapi.data.models.utility.NamedAPIResource

/**
 * Egg Groups are categories which determine which Pokémon are able to interbreed. Pokémon may
 * belong to either one or two Egg Groups.
 * @property id The identifier for this resource.
 * @property name The name for this resource.
 * @property names The name of this resource listed in different languages.
 * @property pokemonSpecies A list of all Pokémon species that are members of this egg group.
 */
@Serializable
data class EggGroup(
    val id: Int,
    val name: String,
    val names: List<Name>,
    @SerialName("pokemon_species") val pokemonSpecies: List<NamedAPIResource>
)