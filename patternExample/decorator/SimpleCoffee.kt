package patternExample.decorator

class SimpleCoffee : Beverage {
    override fun cost() = 2.0
    override fun description(): Map<String, Int> = mapOf("Coffee" to 1)
}