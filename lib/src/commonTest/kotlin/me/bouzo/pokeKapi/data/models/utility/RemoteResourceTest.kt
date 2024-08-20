package me.bouzo.pokeKapi.data.models.utility

import com.benasher44.uuid.uuid4
import kotlin.random.Random
import kotlin.test.Test
import kotlin.test.assertEquals

class RemoteResourceTest {

    @Test
    fun given_RemoteResource_with_url_THEN_return_id() {
        createExpected().forEach { (id, category) ->
            val remoteResource = APIResource(id, category)
            assertEquals(id, remoteResource.id)
        }
    }

    @Test
    fun given_RemoteResource_with_url_THEN_return_category() {
        createExpected().forEach { (id, category) ->
            val remoteResource = APIResource(id, category)
            assertEquals(id, remoteResource.id)
        }
    }

    private fun createExpected(): List<Pair<Int, String>> = (1..10).map {
        Pair(Random.nextInt(), uuid4().toString())
    }
}