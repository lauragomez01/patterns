import patternExample.builder.BuilderExec
import patternExample.decorator.DecoratorExec
import patternExample.iterator.IteratorExec
import patternExample.prototype.PrototypeExec

fun main() {
    val menu = """
        *************************************************
        PATTERNS MENU
        *************************************************
        
        Choose one option
        
        1. Decorator
        2. Builder
        3. Iterator
        4. Prototype
        0. Exit
        
        Your option to
    """.trimIndent()

    println(menu)
    var choice = readln().toInt()

    while (choice in 1..4) {
        val options = mapOf(
            1 to DecoratorExec(),
            2 to BuilderExec(),
            3 to IteratorExec(),
            4 to PrototypeExec(),
        )

        options[choice]?.execute() ?: "Invalid option"
        println(menu)
        choice = readln().toInt()
    }
}