package me.bouzo.pokeKapi.data.models.locations.locationArea

import kotlinx.serialization.Serializable
import me.bouzo.pokeKapi.data.models.utility.NamedApiResource

/**
 * @property rate The chance of an encounter to occur.
 * @property version The version of the game in which the encounter can occur with the given chance.
 */
@Serializable
data class EncounterVersionDetails(
    val rate: Int,
    val version: NamedApiResource
)