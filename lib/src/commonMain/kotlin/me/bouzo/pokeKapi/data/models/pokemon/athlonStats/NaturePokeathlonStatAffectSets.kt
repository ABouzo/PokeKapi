package me.bouzo.pokeKapi.data.models.pokemon.athlonStats

import kotlinx.serialization.Serializable

/**
 * @property increase A list of natures and how they change the referenced Pokéathlon stat.
 * @property decrease A list of natures and how they change the referenced Pokéathlon stat.
 */
@Serializable
data class NaturePokeathlonStatAffectSets(
    val increase: List<NaturePokeathlonStatAffect>,
    val decrease: List<NaturePokeathlonStatAffect>
)