package me.bouzo.pokeKapi.data.models.pokemon.location

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import me.bouzo.pokeKapi.data.models.utility.NamedApiResource
import me.bouzo.pokeKapi.data.models.utility.VersionEncounterDetail

/**
 * Pokémon Location Areas are ares where Pokémon can be found.
 * @property locationArea The location area the referenced Pokémon can be encountered in.
 * @property versionDetails A list of versions and encounters with the referenced Pokémon that might happen.
 */
@Serializable
data class LocationAreaEncounter(
    @SerialName("location_area")
    val locationArea: NamedApiResource,

    @SerialName("version_details")
    val versionDetails: List<VersionEncounterDetail>
)