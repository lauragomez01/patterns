package patternExample.factoryMethod.dialogs

import patternExample.factoryMethod.Button
import patternExample.factoryMethod.Dialog
import patternExample.factoryMethod.buttons.MacButton

class MacDialog : Dialog() {
    override fun createButton(): Button = MacButton()
}