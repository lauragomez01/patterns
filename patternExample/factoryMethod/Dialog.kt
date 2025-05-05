package patternExample.factoryMethod

abstract class Dialog {
    abstract fun createButton(): Button

    fun renderDialog() = createButton().render()
}