package patternExample.decorator

import patternExample.template.PatternMenu

/**
 * Decorator Pattern -------------------------------------------------------------
 * This pattern allows one to modify the behavior of a class without modifying
 * its base code or creating different subclasses with different combinations
 * of behaviors. This pattern wraps the class and adds new functionalities.
 * -------------------------------------------------------------------------------
 */

class DecoratorExec : PatternMenu() {
    override fun customMessage(): String = "6. Cafe (Decorator pattern)"

    override fun process(): String {
        println("Welcome to the cafe store, choose the additions for your cafe:")
        val additions = """
            (1) Milk
            (2) Sugar
            (3) Fruit
            (0) Exit
        """.trimIndent()
        println(additions)
        var option = readln().toInt()

        var coffee: Beverage = SimpleCoffee()

        while (option in 1..3) {
            coffee = when (option) {
                1 -> MilkDecorator(coffee)
                2 -> SugarDecorator(coffee)
                3 -> FruitDecorator(coffee)
                else -> SimpleCoffee()
            }
            println("Want to add more additions, choose the one: \n$additions")
            option = readln().toInt()
        }
        return """
            You coffee contains: ${coffee.summary()} and its price is $ ${coffee.cost()}
        """.trimIndent()
    }
}