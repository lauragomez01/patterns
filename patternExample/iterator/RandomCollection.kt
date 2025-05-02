package patternExample.iterator

class RandomCollection(
    var names: ArrayList<String>
) {
    fun iterator(): Iterator<String> = RandomIterator()

    private inner class RandomIterator : Iterator<String> {
        var index = 0

        override fun hasNext(): Boolean = index < names.size

        override fun next(): String = names[index++]
    }
}
