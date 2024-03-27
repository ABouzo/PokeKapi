package me.bouzo.pokeKapi.data.models.moves.learnMethods

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import me.bouzo.pokeKapi.data.models.utility.Description
import me.bouzo.pokeKapi.data.models.utility.Name
import me.bouzo.pokeKapi.data.models.utility.NamedApiResource

/**
 * Methods by which Pokémon can learn moves.
 * @property id The identifier for this resource.
 * @property name The name for this resource.
 * @property descriptions The description of this resource listed in different languages.
 * @property names The name of this resource listed in different languages.
 * @property versionGroups A list of version groups where moves can be learned through this method.
 */
@Serializable
data class MoveLearnMethod(
    val id: Int,
    val name: String,
    val descriptions: List<Description>,
    val names: List<Name>,
    @SerialName("version_groups") val versionGroups: List<NamedApiResource>
)