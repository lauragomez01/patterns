package patternExample.bridge.tvs

class SonyTV : TV {
    override fun on() = "Sony TV is ON"

    override fun off() = "Sony TV is OFF"

    override fun setChannel(channel: Int) = "Sony TV: Channel $channel"
}