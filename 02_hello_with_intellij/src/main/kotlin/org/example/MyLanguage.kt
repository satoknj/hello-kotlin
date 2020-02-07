package org.example

/**
 * The `Language` type defines a programming language with a name and hotness score.
 *
 * @property name The name of the language.
 * @property hotness A score from 1 to 10 of user enthusiasm. 10 = so hot right now
 */
data class Language(val name: String, val hotness: Int)

class MyLibrary {
    /**
     * @return data relating to the Kotlin {@code Language}.
     */
    fun kotlinLanguage(): Language = Language("Kotlin", 10)
}

// インデントを崩したりするために不要なコードを追加
class Temp {
    fun myMessage(): String {
        val contents = listOf(
            "abc",
            "def"
        )
       var ret = contents.joinToString("-")
        return "$ret-z"
    }
}
