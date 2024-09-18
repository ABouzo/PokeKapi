package me.bouzo.pokeKapi.data.models.pokemon.growth

import kotlinx.serialization.Serializable

/**
 * @property level The level gained.
 * @property experience The amount of experience required to reach the referenced level.
 */
@Serializable
data class GrowthRateExperienceLevel(
    val level: Int,
    val experience: Int
)