package patternExample.factoryMethod.dialogs

import patternExample.factoryMethod.buttons.Button
import patternExample.factoryMethod.buttons.WindowsButton

class WindowsDialog : Dialog() {
    override fun createButton(): Button = WindowsButton()
}