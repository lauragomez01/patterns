package patternExample.template

abstract class PatternMenu {
    fun execute() {
        printHeader(customMessage())
        println("Result --------------\n ${process()} \n ---------------------")
        printFooter(customMessage())
    }

    private fun printHeader(message: String) {
        println("""
            ===================================================
            $message
            ===================================================
        """.trimIndent())
    }

    private fun printFooter(message: String) {
        println("""
            ===================================================
            $message - FINISHED
            ===================================================
        """.trimIndent())
    }

    abstract fun process(): String

    open fun customMessage() = this::class.simpleName ?: "Option"
}