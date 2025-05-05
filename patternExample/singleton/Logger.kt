package patternExample.singleton

// Objects uses singleton pattern automatically, there's no possibilities to create more than one instance on Logger type
object Logger {
    fun log(type: String, message: String) {
        println("$type : $message")
    }
}