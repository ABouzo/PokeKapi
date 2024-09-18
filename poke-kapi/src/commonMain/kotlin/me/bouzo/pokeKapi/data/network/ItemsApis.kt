package me.bouzo.pokeKapi.data.network

import me.bouzo.pokeKapi.data.models.Identifier
import me.bouzo.pokeKapi.data.models.items.attributes.ItemAttribute
import me.bouzo.pokeKapi.data.models.items.categories.ItemCategory
import me.bouzo.pokeKapi.data.models.items.flingEffects.ItemFlingEffect
import me.bouzo.pokeKapi.data.models.items.item.Item
import me.bouzo.pokeKapi.data.models.items.pockets.ItemPocket
import me.bouzo.pokeKapi.data.models.utility.NamedAPIResourceList

/**
 * Interface encapsulating all the endpoints within the Item Group on
 * PokeApi's API
 * See [PokeApi](https://pokeapi.co/docs/v2#items-section)
 */
interface ItemsApis {
    suspend fun getItem(id: Identifier): Result<Item>
    suspend fun getItemAttribute(id: Identifier): Result<ItemAttribute>
    suspend fun getItemCategory(id: Identifier): Result<ItemCategory>
    suspend fun getItemFlingEffect(id: Identifier): Result<ItemFlingEffect>
    suspend fun getItemPocket(id: Identifier): Result<ItemPocket>

    suspend fun getItems(limit: Int = 20, offset: Int = 0): Result<NamedAPIResourceList>
    suspend fun getItemAttributes(limit: Int = 20, offset: Int = 0): Result<NamedAPIResourceList>
    suspend fun getItemCategories(limit: Int = 20, offset: Int = 0): Result<NamedAPIResourceList>
    suspend fun getItemFlingEffects(limit: Int = 20, offset: Int = 0): Result<NamedAPIResourceList>
    suspend fun getItemPockets(limit: Int = 20, offset: Int = 0): Result<NamedAPIResourceList>
}

internal class ItemsRemoteApis(private val baseApi: BaseApi) : ItemsApis {
    override suspend fun getItem(id: Identifier): Result<Item> = baseApi.fetch("/item/$id")
    override suspend fun getItemAttribute(id: Identifier): Result<ItemAttribute> =
        baseApi.fetch("/item-attribute/$id")

    override suspend fun getItemCategory(id: Identifier): Result<ItemCategory> =
        baseApi.fetch("/item-category/$id")

    override suspend fun getItemFlingEffect(id: Identifier): Result<ItemFlingEffect> =
        baseApi.fetch("/item-fling-effect/$id")

    override suspend fun getItemPocket(id: Identifier): Result<ItemPocket> =
        baseApi.fetch("/item-pocket/$id")

    override suspend fun getItems(limit: Int, offset: Int): Result<NamedAPIResourceList> =
        baseApi.fetchPagination("/item", limit, offset)

    override suspend fun getItemAttributes(limit: Int, offset: Int): Result<NamedAPIResourceList> =
        baseApi.fetchPagination("/item-attribute", limit, offset)

    override suspend fun getItemCategories(limit: Int, offset: Int): Result<NamedAPIResourceList> =
        baseApi.fetchPagination("/item-category", limit, offset)

    override suspend fun getItemFlingEffects(
        limit: Int,
        offset: Int
    ): Result<NamedAPIResourceList> =
        baseApi.fetchPagination("/item-fling-effect", limit, offset)

    override suspend fun getItemPockets(limit: Int, offset: Int): Result<NamedAPIResourceList> =
        baseApi.fetchPagination("/item-pocket", limit, offset)
}