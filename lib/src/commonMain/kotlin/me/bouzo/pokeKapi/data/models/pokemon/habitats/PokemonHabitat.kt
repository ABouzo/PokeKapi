package me.bouzo.pokeKapi.data.models.pokemon.habitats

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import me.bouzo.pokeKapi.data.models.utility.Name
import me.bouzo.pokeKapi.data.models.utility.NamedApiResource

/**
 * Habitats are generally different terrain Pokémon can be found in but can also be areas designated for rare or legendary Pokémon.
 * @property id The identifier for this resource.
 * @property name The name for this resource.
 * @property names The name of this resource listed in different languages.
 * @property pokemonSpecies A list of the Pokémon species that can be found in this habitat.
 */
@Serializable
data class PokemonHabitat(
    val id: Int,
    val name: String,
    val names: List<Name>,
    @SerialName("pokemon_species") val pokemonSpecies: List<NamedApiResource>,
)