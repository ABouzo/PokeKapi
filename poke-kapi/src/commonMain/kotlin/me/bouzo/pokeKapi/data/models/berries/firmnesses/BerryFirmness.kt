package me.bouzo.pokeKapi.data.models.berries.firmnesses

import kotlinx.serialization.Serializable
import me.bouzo.pokeKapi.data.models.utility.Name
import me.bouzo.pokeKapi.data.models.utility.NamedAPIResource

/**
 * Berries can be soft or hard. Check out [Bulbapedia](https://bulbapedia.bulbagarden.net/wiki/Category:Berries_by_firmness) for greater detail.
 * See [PokeApi documentation](https://pokeapi.co/docs/v2#berry-firmnesses)
 *
 * @property id The identifier for this resource.
 * @property name The name for this resource.
 * @property berries A list of the berries with this firmness.
 * @property names The name of this resource listed in different languages.
 */
@Serializable
data class BerryFirmness(
    val id: Int,
    val name: String,
    val berries: List<NamedAPIResource>,
    val names: List<Name>
)