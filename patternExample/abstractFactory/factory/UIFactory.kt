package patternExample.abstractFactory.factory

import patternExample.abstractFactory.checkbox.Checkbox
import patternExample.abstractFactory.inputs.Input

interface UIFactory {
    fun createInput(): Input
    fun createCheckbox(): Checkbox
}