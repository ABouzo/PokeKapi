package me.bouzo.pokeKapi.data.models.pokemon.athlonStats

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import me.bouzo.pokeKapi.data.models.utility.Name


/**
 * Pokeathlon Stats are different attributes of a Pokémon's performance in Pokéathlons.
 * In Pokéathlons, competitions happen on different courses; one for each of the different
 * Pokéathlon stats.
 * @property id The identifier for this resource.
 * @property name The name for this resource.
 * @property names The name of this resource listed in different languages.
 * @property affectingNatures A detail of natures which affect this Pokéathlon stat positively or negatively.
 */
@Serializable
data class PokeathlonStat(
    val id: Int,
    val name: String,
    val names: List<Name>,
    @SerialName("affecting_natures") val affectingNatures: NaturePokeathlonStatAffectSets
)
