package patternExample.decorator

const val MILK_ADDITION = "Milk"
const val SUGAR_ADDITION = "Sugar"
const val FRUIT_ADDITION = "Fruit"

class MilkDecorator(private val beverage: Beverage) : Beverage {
    override fun cost() = beverage.cost() + 0.5
    override fun description(): Map<String, Int> = addValue(MILK_ADDITION, beverage)
}

class SugarDecorator(private val beverage: Beverage) : Beverage {
    override fun cost() = beverage.cost() + 0.2
    override fun description(): Map<String, Int> = addValue(SUGAR_ADDITION, beverage)
}

class FruitDecorator(private val beverage: Beverage) : Beverage {
    override fun cost() = beverage.cost() + 0.6
    override fun description(): Map<String, Int> = addValue(FRUIT_ADDITION, beverage)
}

private fun addValue(addition: String, beverage: Beverage): Map<String, Int> {
    val base = beverage.description().toMutableMap()
    base[addition] = (base[addition] ?: 0) + 1
    return base
}