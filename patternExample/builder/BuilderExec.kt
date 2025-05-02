package patternExample.builder

import patternExample.template.PatternMenu

/**
 * Builder Pattern ---------------------------------------------------------------
 * This pattern lets you construct complex objects step by step. The pattern
 * allows you to produce different types and representations of an object using
 * the same construction code.
 * -------------------------------------------------------------------------------
 */

class BuilderExec : PatternMenu() {
    private val doughs = mapOf(
        1 to "Basic",
        2 to "With cheese",
    )

    private val sauces = mapOf(
        1 to "Pineapple",
        2 to "Tomato",
    )

    private val toppings = mapOf(
        1 to "Cheese",
        2 to "Pepperoni",
        3 to "Pineapple",
        4 to "Mushrooms",
        5 to "Corn",
    )

    override fun customMessage(): String = "2. Pizzeria (Builder pattern)"

    override fun process(): String {
        println("Welcome to the Pizzeria")
        //Dough
        println("Choose the dough \n ${doughs.entries.joinToString("\n ") { (k, v) -> "($k) x$v" }}")
        val selectedDough = readln().toInt()
        // Sauce
        println("Choose the sauce \n ${sauces.entries.joinToString("\n ") { (k, v) -> "($k) x$v" }}")
        val selectedSauce = readln().toInt()
        // Toppings
        println("Choose the toppings \n ${toppings.entries.joinToString("\n ") { (k, v) -> "($k) x$v" }}")
        val selectedToppings = readln().toInt()

        // Pizza construction
        val pizza = Pizza.Builder()
            .setDough(doughs[selectedDough] ?: "Basic")
            .setSauce(sauces[selectedSauce] ?: "Tomato")
            .addTopping(toppings[selectedToppings] ?: "")
            .build()

        return pizza.toString()
    }
}