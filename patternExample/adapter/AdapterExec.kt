package patternExample.adapter

import patternExample.adapter.plugAdapters.PlugAsianAdapter
import patternExample.adapter.plugAdapters.PlugEuropeanAdapter
import patternExample.adapter.plugs.AmericanPlug
import patternExample.adapter.plugs.AsianPlug
import patternExample.adapter.plugs.EuropeanPlug
import patternExample.template.PatternMenu

/**
 * Adaptor Pattern ---------------------------------------------------------------
 * The Iterator design pattern is used to traverse elements of
 * a collection (like a list, set, or map) without exposing its
 * underlying structure.
 * -------------------------------------------------------------------------------
 */

class AdapterExec : PatternMenu() {
    override fun customMessage(): String = "7. Plug adapter (Adapter pattern)"

    override fun process(): String {
        val innerMenu = """
            Choose one option to convert to American plug
            1. European plug 
            2. Asian plug 
        """.trimIndent()
        println(innerMenu)
        val option = readln().toInt()
        val adapter: AmericanPlug = if (option == 1) PlugEuropeanAdapter(EuropeanPlug()) else PlugAsianAdapter(AsianPlug())
        return AmericanSocket().plugIn(adapter)
    }
}