package me.bouzo.pokeKapi.data.models.pokemon.abilities

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import me.bouzo.pokeKapi.data.models.utility.Effect
import me.bouzo.pokeKapi.data.models.utility.NamedApiResource

/**
 * @property effectEntries The previous effect of this ability listed in different languages.
 * @property versionGroup The version group in which the previous effect of this ability originated.
 */
@Serializable
data class AbilityEffectChange(
    @SerialName("effect_entries") val effectEntries: List<Effect>,
    @SerialName("version_group") val versionGroup: NamedApiResource
)