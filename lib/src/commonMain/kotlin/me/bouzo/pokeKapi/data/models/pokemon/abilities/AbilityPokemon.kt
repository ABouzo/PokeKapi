package me.bouzo.pokeKapi.data.models.pokemon.abilities

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import me.bouzo.pokeKapi.data.models.utility.NamedApiResource

/**
 * @property isHidden Whether or not this a hidden ability for the referenced Pokémon.
 * @property slot Pokémon have 3 ability 'slots' which hold references to possible abilities they could have. This is the slot of this ability for the referenced pokemon.
 * @property pokemon The Pokémon this ability could belong to.
 */
@Serializable
data class AbilityPokemon(
    @SerialName("is_hidden") val isHidden: Boolean,
    val slot: Int,
    val pokemon: NamedApiResource,
)