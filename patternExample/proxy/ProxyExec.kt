package patternExample.proxy

import patternExample.template.PatternMenu

/**
 * Proxy Pattern -----------------------------------------------------------------
 * The Iterator design pattern is used to traverse elements of
 * a collection (like a list, set, or map) without exposing its
 * underlying structure.
 * -------------------------------------------------------------------------------
 */

class ProxyExec : PatternMenu() {
    override fun customMessage(): String = "12. Names (Proxy pattern)"

    override fun process(): String {
        TODO("Not yet implemented")
    }
}