package me.bouzo.pokeKapi.data.models.utility

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * @property machine The machine that teaches a move from an item.
 * @property versionGroup The version group of this specific machine.
 */
@Serializable
data class MachineVersionDetail(
    val machine: APIResource, @SerialName("version_group") val versionGroup: NamedAPIResource
)