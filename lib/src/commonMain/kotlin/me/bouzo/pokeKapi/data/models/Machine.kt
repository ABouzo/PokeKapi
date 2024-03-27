package me.bouzo.pokeKapi.data.models

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import me.bouzo.pokeKapi.data.models.utility.NamedApiResource

/**
 * Machines are the representation of items that teach moves to Pokémon. They vary from version to
 * version, so it is not certain that one specific TM or HM corresponds to a single Machine.
 * See [PokeApi documentation](https://pokeapi.co/docs/v2#machines)
 * @property id The identifier for this resource.
 * @property item The TM or HM item that corresponds to this machine.
 * @property move The move that is taught by this machine.
 * @property versionGroup The version group that this machine applies to.
 */
@Serializable
data class Machine(
    val id: Int,
    val item: NamedApiResource,
    val move: NamedApiResource,
    @SerialName("version_group")
    val versionGroup: NamedApiResource
)