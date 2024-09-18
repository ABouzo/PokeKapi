package me.bouzo.pokeKapi.data.models.berries.berries

import kotlinx.serialization.Serializable
import me.bouzo.pokeKapi.data.models.utility.NamedAPIResource

/**
 * Berry Flavor Map
 *
 * @property potency How powerful the referenced flavor is for this berry.
 * @property flavor The referenced berry flavor.
 */
@Serializable
data class BerryFlavorMap(
    val potency: Int,
    val flavor: NamedAPIResource
)