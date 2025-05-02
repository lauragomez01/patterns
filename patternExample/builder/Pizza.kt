package patternExample.builder

data class Pizza (
    val dough: String?,
    val sauce: String?,
    val toppings: List<String>
) {
    override fun toString(): String {
        return "Pizza(dough=$dough, sauce=$sauce, toppings=$toppings)"
    }

    class Builder {
        private var dough: String? = null
        private var sauce: String? = null
        private val toppings = mutableListOf<String>()

        fun setDough(dough: String) = apply { this.dough = dough }
        fun setSauce(sauce: String) = apply { this.sauce = sauce }
        fun addTopping(topping: String) = apply { this.toppings.add(topping) }

        fun build(): Pizza {
            return Pizza(dough, sauce, toppings)
        }
    }
}