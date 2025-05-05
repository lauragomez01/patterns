package patternExample.factoryMethod.dialogs

import patternExample.factoryMethod.Button
import patternExample.factoryMethod.Dialog
import patternExample.factoryMethod.buttons.WindowsButton

class WindowsDialog : Dialog() {
    override fun createButton(): Button = WindowsButton()
}