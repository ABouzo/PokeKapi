package me.bouzo.pokeKapi.data.models.utility

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * @property minLevel The lowest level the Pokémon could be encountered at.
 * @property maxLevel The highest level the Pokémon could be encountered at.
 * @property conditionValues A list of condition values that must be in effect for this encounter to occur.
 * @property chance Percent chance that this encounter will occur.
 * @property method The method by which this encounter happens.
 */
@Serializable
data class Encounter(
    @SerialName("min_level") val minLevel: Int,
    @SerialName("max_level") val maxLevel: Int,
    @SerialName("condition_values") val conditionValues: List<NamedAPIResource>,
    val chance: Int,
    val method: NamedAPIResource
)