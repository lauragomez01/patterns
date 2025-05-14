package patternExample.proxy

class Proxy : RealClient() {
    private var realSubject: RealClient? = null

    override fun request(): String {
        if (realSubject == null) {
            realSubject = RealClient() // Create real object only when needed
        }
        println("Proxy: Delegating request to RealSubject")
        return realSubject!!.request() // Delegate the request
    }
}