package patternExample.proxy

open class RealClient {
    open fun request() =
        "RealClient: Handling random request"
}