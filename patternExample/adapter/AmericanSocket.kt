package patternExample.adapter

import patternExample.adapter.plugs.AmericanPlug

class AmericanSocket {
    fun plugIn(plug: AmericanPlug) = plug.connectToAmericanSocket()
}