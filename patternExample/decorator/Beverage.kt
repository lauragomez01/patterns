package patternExample.decorator

interface Beverage {
    fun cost(): Double
    fun description(): Map<String, Int>

    fun summary(): String = description().entries.joinToString(", ") { (k, v) -> "$k x$v"
    }
}