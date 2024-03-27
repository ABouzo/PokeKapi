package me.bouzo.pokeKapi.data.models.utility

import kotlinx.serialization.Serializable

/**
 * @property id The identifier for this resource.
 * @property name The name for this resource.
 * @property official Whether or not the games are published in this language.
 * @property iso639 The two-letter code of the country where this language is spoken. Note that it is not unique.
 * @property iso3166 The two-letter code of the language. Note that it is not unique.
 * @property names The name of this resource listed in different languages.
 */
@Serializable
data class Language(
    val id: Int,
    val name: String,
    val official: Boolean,
    val iso639: String,
    val iso3166: String,
    val names: List<Name>
)