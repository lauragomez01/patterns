package patternExample.abstractFactory.factory

import patternExample.abstractFactory.checkbox.Checkbox
import patternExample.abstractFactory.checkbox.LightCheckbox
import patternExample.abstractFactory.inputs.Input
import patternExample.abstractFactory.inputs.LightInput
import patternExample.factoryMethod.buttons.Button

class LightUIFactory : UIFactory {
    override fun createInput(): Input = LightInput()

    override fun createCheckbox(): Checkbox = LightCheckbox()
}