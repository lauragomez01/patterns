package patternExample.abstractFactory.factory

import patternExample.abstractFactory.checkbox.Checkbox
import patternExample.abstractFactory.checkbox.DarkCheckbox
import patternExample.abstractFactory.inputs.DarkInput
import patternExample.abstractFactory.inputs.Input

class DarkUIFactory : UIFactory {
    override fun createInput(): Input = DarkInput()

    override fun createCheckbox(): Checkbox = DarkCheckbox()
}