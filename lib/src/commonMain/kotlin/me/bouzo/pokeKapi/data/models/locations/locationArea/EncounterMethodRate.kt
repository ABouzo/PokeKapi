package me.bouzo.pokeKapi.data.models.locations.locationArea

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import me.bouzo.pokeKapi.data.models.utility.NamedApiResource

/**
 * @property encounterMethod The method in which Pokémon may be encountered in an area.
 * @property versionDetails The chance of the encounter to occur on a version of the game.
 */
@Serializable
data class EncounterMethodRate(
    @SerialName("encounter_method")
    val encounterMethod: NamedApiResource,

    @SerialName("version_details")
    val versionDetails: List<EncounterVersionDetails>
)