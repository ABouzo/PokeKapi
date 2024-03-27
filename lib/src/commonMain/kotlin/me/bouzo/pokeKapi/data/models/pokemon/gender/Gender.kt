package me.bouzo.pokeKapi.data.models.pokemon.gender

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import me.bouzo.pokeKapi.data.models.utility.NamedApiResource

/**
 * Genders were introduced in Generation II for the purposes of breeding Pokémon but can also result
 * in visual differences or even different evolutionary lines.
 * @property id The identifier for this resource.
 * @property name The name for this resource.
 * @property pokemonSpeciesDetails A list of Pokémon species that can be this gender and how likely it is that they will be.
 * @property requiredForEvolution A list of Pokémon species that required this gender in order for a Pokémon to evolve into them.
 */
@Serializable
data class Gender(
    val id: Int,
    val name: String,
    @SerialName("pokemon_species_details") val pokemonSpeciesDetails: List<PokemonSpeciesGender>,
    @SerialName("required_for_evolution") val requiredForEvolution: List<NamedApiResource>
)