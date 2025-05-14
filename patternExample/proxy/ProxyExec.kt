package patternExample.proxy

import patternExample.template.PatternMenu

/**
 * Proxy Pattern -----------------------------------------------------------------
 * The Proxy pattern is a structural design pattern that provides a surrogate or
 * placeholder for another object, allowing you to control access to it. The
 * proxy object acts as an intermediary that can manage or enhance the
 * interactions with the real object. The primary goal is to control access to
 * an object, which may include delaying its creation, protecting it, or adding
 * extra functionality such as caching, logging, or security checks.
 * -------------------------------------------------------------------------------
 */

class ProxyExec : PatternMenu() {
    override fun customMessage(): String = "12. Query the real client (Proxy pattern)"

    override fun process(): String {
        val subject: RealClient = Proxy()
        return subject.request()
    }
}