package me.bouzo.pokeKapi.data.models.moves.move

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * @property normalCombo A detail of moves this move can be used before or after, granting additional appeal points in contests.
 * @property superCombo A detail of moves this move can be used before or after, granting additional appeal points in super contests.
 */
@Serializable
data class ContestComboSets(
    @SerialName("normal") val normalCombo: ContestComboDetail,
    @SerialName("super") val superCombo: ContestComboDetail
)