package patternExample.factoryMethod

import patternExample.factoryMethod.dialogs.MacDialog
import patternExample.factoryMethod.dialogs.WindowsDialog
import patternExample.template.PatternMenu

/**
 * Factory Method Pattern --------------------------------------------------------
 * The Factory Method design pattern is used to delegate the instantiation of
 * objects to subclasses. Instead of creating objects directly using new, a
 * class defines a method (the factory method) that subclasses override to
 * instantiate the desired object.
 * -------------------------------------------------------------------------------
 */

class FactoryMethodExec : PatternMenu() {
    override fun customMessage(): String = "5. OS (Factory Method pattern)"

    override fun process(): String {
        val osName = System.getProperty("os.name").lowercase()

        val dialog: Dialog = if ("mac" in osName) {
            MacDialog()
        } else {
            WindowsDialog()
        }

        return dialog.renderDialog()
    }
}