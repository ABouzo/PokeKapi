package me.bouzo.pokeKapi.data.models.utility

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * @property gameIndex The internal id of an API resource within game data.
 * @property generation The generation relevent to this game index.
 */
@Serializable
data class GenerationGameIndex(
    @SerialName("game_index") val gameIndex: Int,
    val generation: NamedAPIResource,
)