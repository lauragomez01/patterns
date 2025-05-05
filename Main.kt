import patternExample.abstractFactory.AbstractFactoryExec
import patternExample.adapter.AdapterExec
import patternExample.bridge.BridgeExec
import patternExample.builder.BuilderExec
import patternExample.composite.CompositeExec
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
        1. Builder 
        2. Prototype 
        3. Factory Method 
        4. Abstract Factory 
        5. Singleton 
        
        STRUCTURAL PATTERNS
        6. Decorator 
        7. Adapter
        8. Bridge
        9. Composite
        
        BEHAVIORAL PATTERNS
        13. Iterator
        
        0. Exit
        
        Your option to
    """.trimIndent()

    println(menu)
    var choice = readln().toInt()

    while (choice in 1..21) {
        val options = mapOf(
            1 to BuilderExec(),
            2 to PrototypeExec(),
            3 to FactoryMethodExec(),
            4 to AbstractFactoryExec(),
            5 to SingletonExec(),
            6 to DecoratorExec(),
            7 to AdapterExec(),
            8 to BridgeExec(),
            9 to CompositeExec(),
            13 to IteratorExec(),
        )

        options[choice]?.execute() ?: "Invalid option"
        println(menu)
        choice = readln().toInt()
    }
}