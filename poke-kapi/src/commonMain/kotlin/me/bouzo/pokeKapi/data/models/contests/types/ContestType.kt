package me.bouzo.pokeKapi.data.models.contests.types

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import me.bouzo.pokeKapi.data.models.utility.NamedAPIResource

/**
 * Contest types are categories judges used to weigh a Pokémon's condition in Pokémon contests. Check out [Bulbapedia](https://bulbapedia.bulbagarden.net/wiki/Contest_condition) for greater detail.
 * See [PokeApi documentation](https://pokeapi.co/docs/v2#contest-types)
 *
 * @property id The identifier for this resource.
 * @property name The name for this resource.
 * @property berryFlavor The berry flavor that correlates with this contest type.
 * @property names The name of this contest type listed in different languages.
 */
@Serializable
data class ContestType(
    val id: Int,
    val name: String,
    @SerialName("berry_flavor") val berryFlavor: NamedAPIResource,
    val names: List<ContestName>
)