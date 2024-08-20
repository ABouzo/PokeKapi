package me.bouzo.pokeKapi.data.models

import kotlin.jvm.JvmInline

sealed interface Identifier {

    @JvmInline
    value class Id(val id: Int) : Identifier {
        override fun toString(): String = id.toString()
    }

    @JvmInline
    value class Name(val name: String) : Identifier {
        override fun toString(): String = name
    }
}

val String.name: Identifier
    get() = Identifier.Name(this)

val Int.id: Identifier
    get() = Identifier.Id(this)