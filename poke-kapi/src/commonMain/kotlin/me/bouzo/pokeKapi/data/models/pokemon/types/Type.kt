package me.bouzo.pokeKapi.data.models.pokemon.types

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import me.bouzo.pokeKapi.data.models.utility.GenerationGameIndex
import me.bouzo.pokeKapi.data.models.utility.Name
import me.bouzo.pokeKapi.data.models.utility.NamedAPIResource

/**
 * Types are properties for Pokémon and their moves. Each type has three properties: which types of
 * Pokémon it is super effective against, which types of Pokémon it is not very effective against,
 * and which types of Pokémon it is completely ineffective against.
 * @property id The identifier for this resource.
 * @property name The name for this resource.
 * @property damageRelations A detail of how effective this type is toward others and vice versa.
 * @property pastDamageRelations A list of details of how effective this type was toward others and vice versa in previous generations
 * @property gameIndices A list of game indices relevent to this item by generation.
 * @property generation The generation this type was introduced in.
 * @property moveDamageClass The class of damage inflicted by this type.
 * @property names The name of this resource listed in different languages.
 * @property pokemon A list of details of Pokémon that have this type.
 * @property moves A list of moves that have this type.
 */
@Serializable
data class Type(
    val id: Int,
    val name: String,
    @SerialName("damage_relations") val damageRelations: TypeRelations,
    @SerialName("past_damage_relations") val pastDamageRelations: List<TypeRelationsPast>,
    @SerialName("game_indices") val gameIndices: List<GenerationGameIndex>,
    val generation: NamedAPIResource,
    @SerialName("move_damage_class") val moveDamageClass: NamedAPIResource,
    val names: List<Name>,
    val pokemon: List<TypePokemon>,
    val moves: List<NamedAPIResource>
)