package patternExample.adapter.plugAdapters

import patternExample.adapter.plugs.AmericanPlug
import patternExample.adapter.plugs.EuropeanPlug
import patternExample.singleton.Logger

class PlugEuropeanAdapter(
    private val europeanPlug: EuropeanPlug
) : AmericanPlug {
    override fun connectToAmericanSocket(): String {
        Logger.log("Info", "Using adapter to convert European plug to American socket")
        return europeanPlug.connectToEuropeanSocket()
    }
}