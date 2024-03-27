package me.bouzo.pokeKapi.data.models.pokemon.growth

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import me.bouzo.pokeKapi.data.models.utility.Description
import me.bouzo.pokeKapi.data.models.utility.NamedApiResource

/**
 * Growth rates are the speed with which Pokémon gain levels through experience.
 * @property id The identifier for this resource.
 * @property name The name for this resource.
 * @property formula The formula used to calculate the rate at which the Pokémon species gains level.
 * @property descriptions The descriptions of this characteristic listed in different languages.
 * @property levels A list of levels and the amount of experienced needed to attain them based on this growth rate.
 * @property pokemonSpecies A list of Pokémon species that gain levels at this growth rate.
 */
@Serializable
data class GrowthRate(
    val id: Int,
    val name: String,
    val formula: String,
    val descriptions: List<Description>,
    @SerialName("levels") val levels: List<GrowthRateExperienceLevel>,
    @SerialName("pokemon_species") val pokemonSpecies: List<NamedApiResource>
)