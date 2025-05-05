package patternExample.composite

class File(private val name: String) : FileSystemItem {
    override fun display(indent: String) {
        println("$indent-> File: $name")
    }
}