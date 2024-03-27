package me.bouzo.pokeKapi.data.models.pokemon.form

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * @property frontDefault The default depiction of this Pokémon form from the front in battle.
 * @property frontShiny The shiny depiction of this Pokémon form from the front in battle.
 * @property backDefault The default depiction of this Pokémon form from the back in battle.
 * @property backShiny The shiny depiction of this Pokémon form from the back in battle.
 */
@Serializable
data class PokemonFormSprites(
    @SerialName("front_default") val frontDefault: String? = null,
    @SerialName("front_shiny") val frontShiny: String? = null,
    @SerialName("back_default") val backDefault: String? = null,
    @SerialName("back_shiny") val backShiny: String? = null,
)