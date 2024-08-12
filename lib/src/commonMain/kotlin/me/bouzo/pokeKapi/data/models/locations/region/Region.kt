package me.bouzo.pokeKapi.data.models.locations.region

import kotlinx.serialization.SerialName
import me.bouzo.pokeKapi.data.models.utility.Name
import me.bouzo.pokeKapi.data.models.utility.NamedAPIResource

data class Region(
    val id: Int,
    val locations: List<NamedAPIResource>,
    val name: String,
    val names: List<Name>,
    @SerialName("main_generation") val mainGeneration: NamedAPIResource,
    val pokedexes: List<NamedAPIResource>,
    @SerialName("version_groups") val versionGroups: List<NamedAPIResource>
)