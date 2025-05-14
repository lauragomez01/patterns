package patternExample.singleton

class MySingleton private constructor() { // This allows to not create new objects of this class
    init {
        println("MySingleton instance created")
    }

    fun doSomething() {
        println("Doing something")
    }

    companion object { // Static container
        @Volatile // thread safety
        private var instance: MySingleton? = null

        fun getInstance(): MySingleton {
            return instance ?: synchronized(this) { // lazy initialization
                instance ?: MySingleton().also { instance = it }
            }
        }
    }
}