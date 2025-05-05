package patternExample.adapter.plugAdapters

import patternExample.adapter.plugs.AmericanPlug
import patternExample.adapter.plugs.AsianPlug
import patternExample.singleton.Logger

class PlugAsianAdapter(
    private val asianPlug: AsianPlug
) : AmericanPlug {
    override fun connectToAmericanSocket(): String {
        Logger.log("Info", "Using adapter to convert Asian plug to American socket")
        return asianPlug.connectToAsianSocket()
    }
}