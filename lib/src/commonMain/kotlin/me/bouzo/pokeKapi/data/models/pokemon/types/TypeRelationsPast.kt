package me.bouzo.pokeKapi.data.models.pokemon.types

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import me.bouzo.pokeKapi.data.models.utility.NamedApiResource

/**
 * @property generation The last generation in which the referenced type had the listed damage relations
 * @property damageRelations The damage relations the referenced type had up to and including the listed generation
 */
@Serializable
data class TypeRelationsPast(
    val generation: NamedApiResource,
    @SerialName("damage_relations") val damageRelations: TypeRelations
)