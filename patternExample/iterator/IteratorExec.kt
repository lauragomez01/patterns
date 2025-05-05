package patternExample.iterator

import patternExample.template.PatternMenu

/**
 * Iterator Pattern --------------------------------------------------------------
 * The Iterator design pattern is used to traverse elements of
 * a collection (like a list, set, or map) without exposing its
 * underlying structure.
 * -------------------------------------------------------------------------------
 */

class IteratorExec : PatternMenu() {
    override fun customMessage(): String = "7. Names (Iterator pattern)"

    override fun process(): String {
        println("Choose the quantity of names to iterate: ")
        val quantity = readln().toInt()

        val names = ArrayList<String>()

        for (i in 1..quantity) {
            println("Write the name ($i) --> ")
            names.add(readln())
        }

        val result = StringBuilder()
        val iterator = RandomCollection(names).iterator()

        while (iterator.hasNext()) {
            result.append("${iterator.next()} ")
        }

        return result.toString()
    }

}