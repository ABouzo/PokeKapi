package me.bouzo.pokeKapi.data.models

import java.nio.file.Files
import java.nio.file.Paths

internal fun fromFile(folder: String, block: (String) -> Unit) {
    val dirs = Paths.get("").toAbsolutePath().toString()
    val resourcesPath = Paths.get(dirs, "/src/jvmTest/resources/$folder")
    Files.walk(resourcesPath).filter { Files.isRegularFile(it) }
        .filter { it.toString().endsWith(".json") }.forEach {
            val json = Files.readString(it)
            block(json)
        }
}