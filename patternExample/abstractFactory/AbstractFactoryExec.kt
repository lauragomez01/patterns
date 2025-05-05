package patternExample.abstractFactory

import patternExample.abstractFactory.factory.DarkUIFactory
import patternExample.abstractFactory.factory.LightUIFactory
import patternExample.abstractFactory.factory.UIFactory
import patternExample.template.PatternMenu

/**
 * Abstract Factory Pattern ------------------------------------------------------
 * The Abstract Factory design pattern is used to create families of related or
 * dependent objects without specifying their concrete classes.
 * -------------------------------------------------------------------------------
 */

class AbstractFactoryExec : PatternMenu() {
    override fun customMessage(): String = "4. Dark/Light mode (Abstract factory pattern)"

    override fun process(): String {
        val isDarkMode = true

        val factory: UIFactory = if (isDarkMode) DarkUIFactory() else LightUIFactory()
        val app = renderUI(factory)
        return app
    }

    private fun renderUI(factory: UIFactory) = factory.createInput().render() + factory.createCheckbox().render()
}