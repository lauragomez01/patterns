package patternExample.composite

import patternExample.template.PatternMenu

/**
 * Composite Pattern -------------------------------------------------------------
 * The Bridge Pattern is used to decouple an abstraction (what to do) from its
 * implementation (how to do), so that both can vary independently.
 * -------------------------------------------------------------------------------
 */

class CompositeExec : PatternMenu() {
    override fun customMessage(): String = "8. TV (Bridge pattern)"

    override fun process(): String {
        val root = Folder("root")
        val documents = Folder("documents")
        val pictures = Folder("pictures")

        documents.add(File("resume.pdf"))
        documents.add(File("budget.xlsx"))

        pictures.add(File("photo1.jpg"))
        pictures.add(File("photo2.png"))

        root.add(documents)
        root.add(pictures)
        root.add(File("readme.txt"))

        root.display()
        return ""
    }
}