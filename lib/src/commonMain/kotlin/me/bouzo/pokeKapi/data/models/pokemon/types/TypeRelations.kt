package me.bouzo.pokeKapi.data.models.pokemon.types

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import me.bouzo.pokeKapi.data.models.utility.NamedApiResource

/**
 * @property noDamageTo A list of types this type has no effect on.
 * @property halfDamageTo A list of types this type is not very effect against.
 * @property doubleDamageTo A list of types this type is very effect against.
 * @property noDamageFrom A list of types that have no effect on this type.
 * @property halfDamageFrom A list of types that are not very effective against this type.
 * @property doubleDamageFrom A list of types that are very effective against this type.
 */
@Serializable
data class TypeRelations(
    @SerialName("no_damage_to") val noDamageTo: List<NamedApiResource>,
    @SerialName("half_damage_to") val halfDamageTo: List<NamedApiResource>,
    @SerialName("double_damage_to") val doubleDamageTo: List<NamedApiResource>,
    @SerialName("no_damage_from") val noDamageFrom: List<NamedApiResource>,
    @SerialName("half_damage_from") val halfDamageFrom: List<NamedApiResource>,
    @SerialName("double_damage_from") val doubleDamageFrom: List<NamedApiResource>
)