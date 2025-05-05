package patternExample.factoryMethod.dialogs

import patternExample.factoryMethod.buttons.Button

abstract class Dialog {
    abstract fun createButton(): Button

    fun renderDialog() = createButton().render()
}