package me.bouzo.pokeKapi.data.models.contests.superEffects

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import me.bouzo.pokeKapi.data.models.utility.FlavorText
import me.bouzo.pokeKapi.data.models.utility.NamedAPIResource

/**
 * Super contest effects refer to the effects of moves when used in super contests.
 * See [PokeApi documentation](https://pokeapi.co/docs/v2#super-contest-effects)
 *
 * @property id The identifier for this resource.
 * @property appeal The level of appeal this super contest effect has.
 * @property flavorTextEntries The flavor text of this super contest effect listed in different languages.
 * @property moves A list of moves that have the effect when used in super contests.
 */
@Serializable
data class SuperContestEffect(
    val id: Int,
    val appeal: Int,
    @SerialName("flavor_text_entries") val flavorTextEntries: List<FlavorText>,
    val moves: List<NamedAPIResource>
)