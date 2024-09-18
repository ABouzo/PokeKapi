package me.bouzo.pokeKapi.data.models.berries.flavors

import kotlinx.serialization.Serializable
import me.bouzo.pokeKapi.data.models.utility.NamedAPIResource

/**
 * Flavor Berry Map
 *
 * @property potency How powerful the referenced flavor is for this berry.
 * @property berry The berry with the referenced flavor.
 */
@Serializable
data class FlavorBerryMap(
    val potency: Int,
    val berry: NamedAPIResource
)