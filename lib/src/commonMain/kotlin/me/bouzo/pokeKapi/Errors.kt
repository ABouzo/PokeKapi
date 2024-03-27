package me.bouzo.pokeKapi

sealed class Errors(cause: Throwable) : Throwable(cause = cause) {
    class Network internal constructor(cause: Throwable) : Errors(cause)
}