package me.bouzo.pokeKapi.data.models.items.flingEffects

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import me.bouzo.pokeKapi.data.models.utility.Effect
import me.bouzo.pokeKapi.data.models.utility.NamedAPIResource

/**
 * The various effects of the move "Fling" when used with different items.
 * See [PokeApi documentation](https://pokeapi.co/docs/v2#item-fling-effects)
 *
 * @property id The identifier for this resource.
 * @property name The name for this resource.
 * @property effectEntries The result of this fling effect listed in different languages.
 * @property items A list of items that have this fling effect.
 */
@Serializable
data class ItemFlingEffect(
    val id: Int,
    val name: String,
    @SerialName("effect_entries") val effectEntries: List<Effect>,
    val items: List<NamedAPIResource>
)