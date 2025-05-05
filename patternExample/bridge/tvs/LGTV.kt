package patternExample.bridge.tvs

class LGTV : TV {
    override fun on() = "LG TV is ON"

    override fun off() = "LG TV is OFF"

    override fun setChannel(channel: Int) = "LG TV: Channel $channel"
}