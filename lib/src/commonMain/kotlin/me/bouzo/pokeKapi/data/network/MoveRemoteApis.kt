package me.bouzo.pokeKapi.data.network

import me.bouzo.pokeKapi.data.models.Identifier
import me.bouzo.pokeKapi.data.models.moves.ailments.MoveAilment
import me.bouzo.pokeKapi.data.models.moves.battleStyles.MoveBattleStyle
import me.bouzo.pokeKapi.data.models.moves.categories.MoveCategory
import me.bouzo.pokeKapi.data.models.moves.damageClasses.MoveDamageClass
import me.bouzo.pokeKapi.data.models.moves.learnMethods.MoveLearnMethod
import me.bouzo.pokeKapi.data.models.moves.move.Move
import me.bouzo.pokeKapi.data.models.moves.targets.MoveTarget

interface MoveApis {
    suspend fun getMove(id: Identifier): Result<Move>
    suspend fun getMoveAilment(id: Identifier): Result<MoveAilment>
    suspend fun getMoveBattleStyle(id: Identifier): Result<MoveBattleStyle>
    suspend fun getMoveCategory(id: Identifier): Result<MoveCategory>
    suspend fun getMoveDamageClass(id: Identifier): Result<MoveDamageClass>
    suspend fun getMoveLearnMethod(id: Identifier): Result<MoveLearnMethod>
    suspend fun getMoveTarget(id: Identifier): Result<MoveTarget>
}

internal class MoveRemoteApis(private val baseApi: BaseApi) : MoveApis {

    override suspend fun getMove(id: Identifier): Result<Move> = baseApi.fetch("/move/$id")
    override suspend fun getMoveAilment(id: Identifier): Result<MoveAilment> =
        baseApi.fetch("/move-ailment/$id")

    override suspend fun getMoveBattleStyle(id: Identifier): Result<MoveBattleStyle> =
        baseApi.fetch("/move-battle-style/$id")

    override suspend fun getMoveCategory(id: Identifier): Result<MoveCategory> =
        baseApi.fetch("/move-category/$id")

    override suspend fun getMoveDamageClass(id: Identifier): Result<MoveDamageClass> =
        baseApi.fetch("/move-damage-class/$id")

    override suspend fun getMoveLearnMethod(id: Identifier): Result<MoveLearnMethod> =
        baseApi.fetch("/move-learn-method/$id")

    override suspend fun getMoveTarget(id: Identifier): Result<MoveTarget> =
        baseApi.fetch("/move-target/$id")
}