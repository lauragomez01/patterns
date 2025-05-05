package patternExample.bridge.tvs

interface TV {
    fun on(): String
    fun off(): String
    fun setChannel(channel: Int): String
}