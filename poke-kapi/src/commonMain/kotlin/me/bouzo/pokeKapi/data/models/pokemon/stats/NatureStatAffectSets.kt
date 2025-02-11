package me.bouzo.pokeKapi.data.models.pokemon.stats

import kotlinx.serialization.Serializable
import me.bouzo.pokeKapi.data.models.utility.NamedAPIResource

/**
 * @property increase A list of natures and how they change the referenced stat.
 * @property decrease A list of nature sand how they change the referenced stat.
 */
@Serializable
data class NatureStatAffectSets(
    val increase: List<NamedAPIResource>,
    val decrease: List<NamedAPIResource>,
)