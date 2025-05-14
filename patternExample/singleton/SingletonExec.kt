package patternExample.singleton

import patternExample.template.PatternMenu

/**
 * Singleton Pattern ------------------------------------------------------
 * The Abstract Factory design pattern is used to create families of related or
 * dependent objects without specifying their concrete classes.
 * -------------------------------------------------------------------------------
 */

class SingletonExec : PatternMenu() {
    override fun customMessage(): String = "5. Logger (Singleton pattern)"

    override fun process(): String {
        println("Write the log type")
        val type = readln()
        println("Write the log content")
        val content = readln()
        Logger.log(type, content)

        val s1 = MySingleton.getInstance()
        val s2 = MySingleton.getInstance()

        return "Is the same instance ${s1 === s2}"
    }
}