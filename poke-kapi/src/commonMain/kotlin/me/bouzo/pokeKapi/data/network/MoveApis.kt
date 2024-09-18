package me.bouzo.pokeKapi.data.network

import me.bouzo.pokeKapi.data.models.Identifier
import me.bouzo.pokeKapi.data.models.moves.ailments.MoveAilment
import me.bouzo.pokeKapi.data.models.moves.battleStyles.MoveBattleStyle
import me.bouzo.pokeKapi.data.models.moves.categories.MoveCategory
import me.bouzo.pokeKapi.data.models.moves.damageClasses.MoveDamageClass
import me.bouzo.pokeKapi.data.models.moves.learnMethods.MoveLearnMethod
import me.bouzo.pokeKapi.data.models.moves.move.Move
import me.bouzo.pokeKapi.data.models.moves.targets.MoveTarget
import me.bouzo.pokeKapi.data.models.utility.NamedAPIResourceList

/**
 * Interface encapsulating all the endpoints within the Move Group on
 * PokeApi's API
 * See [PokeApi](https://pokeapi.co/docs/v2#moves-section)
 */
interface MoveApis {
    suspend fun getMove(id: Identifier): Result<Move>
    suspend fun getMoveAilment(id: Identifier): Result<MoveAilment>
    suspend fun getMoveBattleStyle(id: Identifier): Result<MoveBattleStyle>
    suspend fun getMoveCategory(id: Identifier): Result<MoveCategory>
    suspend fun getMoveDamageClass(id: Identifier): Result<MoveDamageClass>
    suspend fun getMoveLearnMethod(id: Identifier): Result<MoveLearnMethod>
    suspend fun getMoveTarget(id: Identifier): Result<MoveTarget>
    suspend fun getMoves(limit: Int = 20, offset: Int = 0): Result<NamedAPIResourceList>
    suspend fun getMoveAilments(limit: Int = 20, offset: Int = 0): Result<NamedAPIResourceList>
    suspend fun getMoveBattleStyles(limit: Int = 20, offset: Int = 0): Result<NamedAPIResourceList>
    suspend fun getMoveCategories(limit: Int = 20, offset: Int = 0): Result<NamedAPIResourceList>
    suspend fun getMoveDamageClasses(limit: Int = 20, offset: Int = 0): Result<NamedAPIResourceList>
    suspend fun getMoveLearnMethods(limit: Int = 20, offset: Int = 0): Result<NamedAPIResourceList>
    suspend fun getMoveTargets(limit: Int = 20, offset: Int = 0): Result<NamedAPIResourceList>

    companion object
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


    override suspend fun getMoves(limit: Int, offset: Int): Result<NamedAPIResourceList> =
        baseApi.fetchPagination("/move", limit, offset)

    override suspend fun getMoveAilments(limit: Int, offset: Int): Result<NamedAPIResourceList> =
        baseApi.fetchPagination("/move-ailment", limit, offset)

    override suspend fun getMoveBattleStyles(
        limit: Int, offset: Int
    ): Result<NamedAPIResourceList> = baseApi.fetchPagination("/move-battle-style", limit, offset)

    override suspend fun getMoveCategories(limit: Int, offset: Int): Result<NamedAPIResourceList> =
        baseApi.fetchPagination("/move-category", limit, offset)

    override suspend fun getMoveDamageClasses(
        limit: Int, offset: Int
    ): Result<NamedAPIResourceList> = baseApi.fetchPagination("/move-damage-class", limit, offset)

    override suspend fun getMoveLearnMethods(
        limit: Int, offset: Int
    ): Result<NamedAPIResourceList> = baseApi.fetchPagination("/move-learn-method", limit, offset)

    override suspend fun getMoveTargets(limit: Int, offset: Int): Result<NamedAPIResourceList> =
        baseApi.fetchPagination("/move-target", limit, offset)
}

