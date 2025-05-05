package patternExample.bridge.remote

import patternExample.bridge.tvs.TV

abstract class RemoteControl(protected val tv: TV) {
    abstract fun turnOn(): String
    abstract fun turnOff(): String
    abstract fun setChannel(channel: Int): String
}