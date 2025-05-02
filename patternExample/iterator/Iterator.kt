package patternExample.iterator

interface Iterator<T> {
    fun hasNext(): Boolean
    fun next(): T
}