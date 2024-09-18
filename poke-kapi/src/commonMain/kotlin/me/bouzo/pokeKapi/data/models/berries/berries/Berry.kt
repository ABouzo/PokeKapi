package me.bouzo.pokeKapi.data.models.berries.berries

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import me.bouzo.pokeKapi.data.models.utility.NamedAPIResource

/**
 * Berries are small fruits that can provide HP and status condition restoration, stat enhancement, and even damage negation when eaten by Pokémon.
 * See [PokeApi documentation](https://pokeapi.co/docs/v2#berries)
 *
 * @property id The identifier for this resource.
 * @property name The name for this resource.
 * @property growthTime Time it takes the tree to grow one stage, in hours. Berry trees go through four of these growth stages before they can be picked.
 * @property maxHarvest The maximum number of these berries that can grow on one tree in Generation IV.
 * @property naturalGiftPower The power of the move "Natural Gift" when used with this Berry.
 * @property size The size of this Berry, in millimeters.
 * @property smoothness The smoothness of this Berry, used in making Pokéblocks or Poffins.
 * @property soilDryness The speed at which this Berry dries out the soil as it grows. A higher rate means the soil dries more quickly.
 * @property firmness The firmness of this berry, used in making Pokéblocks or Poffins.
 * @property flavors A list of references to each flavor a berry can have and the potency of each of those flavors in regard to this berry.
 * @property item Berries are actually items. This is a reference to the item specific data for this berry.
 * @property naturalGiftType The type inherited by "Natural Gift" when used with this Berry.
 */
@Serializable
data class Berry(
    val id: Int,
    val name: String,
    @SerialName("growth_time") val growthTime: Int,
    @SerialName("max_harvest") val maxHarvest: Int,
    @SerialName("natural_gift_power") val naturalGiftPower: Int,
    val size: Int,
    val smoothness: Int,
    @SerialName("soil_dryness") val soilDryness: Int,
    val firmness: NamedAPIResource,
    val flavors: List<BerryFlavorMap>,
    val item: NamedAPIResource,
    @SerialName("natural_gift_type") val naturalGiftType: NamedAPIResource
)

