import patternExample.abstractFactory.AbstractFactoryExec
import patternExample.builder.BuilderExec
import patternExample.decorator.DecoratorExec
import patternExample.factoryMethod.FactoryMethodExec
import patternExample.iterator.IteratorExec
import patternExample.prototype.PrototypeExec
import patternExample.singleton.SingletonExec

fun main() {
    val menu = """
        *************************************************
        PATTERNS MENU
        *************************************************
        
        Choose one option
        
        CREATIONAL PATTERNS
        1. Builder (Creational)
        2. Prototype (Creational)
        3. Factory Method (Creational)
        4. Abstract Factory (Creational)
        5. Singleton (Creational)
        
        STRUCTURAL PATTERNS
        6. Decorator (Structural)
        
        BEHAVIORAL PATTERNS
        7. Iterator (Behavioral)
        
        0. Exit
        
        Your option to
    """.trimIndent()

    println(menu)
    var choice = readln().toInt()

    while (choice in 1..5) {
        val options = mapOf(
            1 to BuilderExec(),
            2 to PrototypeExec(),
            3 to FactoryMethodExec(),
            4 to AbstractFactoryExec(),
            5 to SingletonExec(),
            6 to DecoratorExec(),
            7 to IteratorExec(),
        )

        options[choice]?.execute() ?: "Invalid option"
        println(menu)
        choice = readln().toInt()
    }
}