package me.bouzo.pokeKapi.data.models.contests.effects

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import me.bouzo.pokeKapi.data.models.utility.Effect
import me.bouzo.pokeKapi.data.models.utility.FlavorText

/**
 * Contest effects refer to the effects of moves when used in contests.
 * See [PokeApi documentation](https://pokeapi.co/docs/v2#contest-effects)
 *
 * @property id The identifier for this resource.
 * @property appeal The base number of hearts the user of this move gets.
 * @property jam The base number of hearts the user's opponent loses.
 * @property effectEntries The result of this contest effect listed in different languages.
 * @property flavorTextEntries The flavor text of this contest effect listed in different languages.
 */
@Serializable
data class ContestEffect(
    val id: Int,
    val appeal: Int,
    val jam: Int,
    @SerialName("effect_entries") val effectEntries: List<Effect>,
    @SerialName("flavor_text_entries") val flavorTextEntries: List<FlavorText>
)