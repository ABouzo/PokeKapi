package me.bouzo.pokeKapi.data.network

import me.bouzo.pokeKapi.data.models.Identifier
import me.bouzo.pokeKapi.data.models.items.attributes.ItemAttribute
import me.bouzo.pokeKapi.data.models.items.categories.ItemCategory
import me.bouzo.pokeKapi.data.models.items.flingEffects.ItemFlingEffect
import me.bouzo.pokeKapi.data.models.items.item.Item
import me.bouzo.pokeKapi.data.models.items.pockets.ItemPocket

interface ItemsApis {
    suspend fun getItem(id: Identifier): Result<Item>
    suspend fun getItemAttribute(id: Identifier): Result<ItemAttribute>
    suspend fun getItemCategory(id: Identifier): Result<ItemCategory>
    suspend fun getItemFlingEffect(id: Identifier): Result<ItemFlingEffect>
    suspend fun getItemPocket(id: Identifier): Result<ItemPocket>
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
}