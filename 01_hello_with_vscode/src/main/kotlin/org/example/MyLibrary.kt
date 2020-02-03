package org.example

/**
 * The Language type defines a programing language with name and hotness score.
 * 
 * @property name The name of language.
 * @property hotness A score from 1 to 10 of user enthusiam. 10 = so hot right now.
 */
data class Language(val name: String, val hotness: Int)

class MyLibrary {
    /**
     * @return data relating to the Kotlin
     */
    fun kotlinLanguage() = Language("Kotlin", 10)
}