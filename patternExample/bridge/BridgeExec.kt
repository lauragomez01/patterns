package patternExample.bridge

import patternExample.bridge.remote.BasicRemote
import patternExample.bridge.tvs.LGTV
import patternExample.bridge.tvs.SonyTV
import patternExample.template.PatternMenu

/**
 * Bridge Pattern ----------------------------------------------------------------
 * The Bridge Pattern is used to decouple an abstraction (what to do) from its
 * implementation (how to do), so that both can vary independently.
 * -------------------------------------------------------------------------------
 */

class BridgeExec : PatternMenu() {
    override fun customMessage(): String = "8. TV (Bridge pattern)"

    override fun process(): String {
        val innerMenu = """
            Choose the TV you want to use
            1. Sony
            2. LG
        """.trimIndent()
        println(innerMenu)
        val option = readln().toInt()

        return when (option) {
            1 -> {
                val sonyRemote = BasicRemote(SonyTV())
                "${sonyRemote.turnOn()} - ${sonyRemote.setChannel(5)} - ${sonyRemote.turnOff()}"
            }
            else -> {
                val lgRemote = BasicRemote(LGTV())
                "${lgRemote.turnOn()} - ${lgRemote.setChannel(5)} - ${lgRemote.turnOff()}"
            }
        }
    }
}