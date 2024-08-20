package me.bouzo.pokeKapi.data.models.berries.flavors

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import me.bouzo.pokeKapi.data.models.utility.Name
import me.bouzo.pokeKapi.data.models.utility.NamedAPIResource

/**
 * Flavors determine whether a Pokémon will benefit or suffer from eating a berry based on their nature. Check out [Bulbapedia](https://bulbapedia.bulbagarden.net/wiki/Flavor) for greater detail.
 * See [PokeApi documentation](https://pokeapi.co/docs/v2#berry-flavors)
 *
 * @property id The identifier for this resource.
 * @property name The name for this resource.
 * @property berries A list of the berries with this flavor.
 * @property contestType The contest type that correlates with this berry flavor.
 * @property names The name of this resource listed in different languages.
 */
@Serializable
data class BerryFlavor(
    val id: Int,
    val name: String,
    val berries: List<FlavorBerryMap>,
    @SerialName("contest_type") val contestType: NamedAPIResource,
    val names: List<Name>
)