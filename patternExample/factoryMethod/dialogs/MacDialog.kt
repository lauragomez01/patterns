package patternExample.factoryMethod.dialogs

import patternExample.factoryMethod.buttons.Button
import patternExample.factoryMethod.buttons.MacButton

class MacDialog : Dialog() {
    override fun createButton(): Button = MacButton()
}