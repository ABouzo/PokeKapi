package me.bouzo.pokeKapi.data.models.utility

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * @property version The game version this encounter happens in.
 * @property maxChance The total percentage of all encounter potential.
 * @property encounterDetails A list of encounters and their specifics.
 */
@Serializable
data class VersionEncounterDetail(
    val version: NamedAPIResource,
    @SerialName("max_chance") val maxChance: Int,
    @SerialName("encounter_details") val encounterDetails: List<Encounter>,
)