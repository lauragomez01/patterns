package patternExample.bridge.remote

import patternExample.bridge.tvs.TV

class BasicRemote(
    tv: TV
) : RemoteControl(tv) {
    override fun turnOn() = tv.on()

    override fun turnOff() = tv.off()

    override fun setChannel(channel: Int) = tv.setChannel(channel)
}