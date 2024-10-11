package me.bouzo.pokeKapi.data.models.pokemon.natures

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import me.bouzo.pokeKapi.data.models.pokemon.athlonStats.PokeathlonStat
import me.bouzo.pokeKapi.data.models.utility.NamedAPIResource

/**
 * @property maxChange The amount of change.
 * @property pokeathlonStat The stat being affected.
 */
@Serializable
data class NatureStatChange(
    @SerialName("max_change") val maxChange: Int,
    @SerialName("pokeathlon_stat") val pokeathlonStat: NamedAPIResource
)