package me.bouzo.pokeKapi.data.models.locations.locationArea

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import me.bouzo.pokeKapi.data.models.utility.NamedApiResource
import me.bouzo.pokeKapi.data.models.utility.VersionEncounterDetail

/**
 * @property pokemon The Pokémon being encountered.
 * @property versionDetails A list of versions and encounters with Pokémon that might happen in the referenced location area.
 */
@Serializable
data class PokemonEncounter(
    val pokemon: NamedApiResource,

    @SerialName("version_details")
    val versionDetails: List<VersionEncounterDetail>
)