package patternExample.composite

class Folder(private val name: String) : FileSystemItem {
    private val children = mutableListOf<FileSystemItem>()

    fun add(item: FileSystemItem) {
        children.add(item)
    }

    override fun display(indent: String) {
        println("$indent-> Folder: $name")
        for (child in children) {
            child.display("$indent   ")
        }
    }
}