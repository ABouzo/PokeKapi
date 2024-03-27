package me.bouzo.pokeKapi.data.models.utility

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * @property gameIndex The internal id of an API resource within game data.
 * @property version The version relevent to this game index.
 */
@Serializable
data class VersionGameIndex(
    @SerialName("game_index") val gameIndex: Int,
    val version: NamedApiResource,
)