package me.bouzo.pokeKapi.data.models.pokemon.stats

import kotlinx.serialization.Serializable

/**
 * @property increase A list of moves and how they change the referenced stat.
 * @property decrease A list of moves and how they change the referenced stat.
 */
@Serializable
data class MoveStatAffectSets(
    val increase: List<MoveStatAffect>,
    val decrease: List<MoveStatAffect>,
)