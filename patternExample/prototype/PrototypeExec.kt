package patternExample.prototype

import patternExample.template.PatternMenu

/**
 * Prototype Pattern -------------------------------------------------------------
 * The Prototype Pattern is used to create new objects by copying an existing
 * instance (the "prototype") instead of creating new ones from scratch using new.
 * -------------------------------------------------------------------------------
 */

class PrototypeExec : PatternMenu() {
    override fun customMessage(): String = "4. Copying files (Prototype pattern)"

    override fun process(): String {
        val document = Document("Test file", "This is a test file", "Andrea")
        println("The original document contains the following data \n${document}\n\n" +
                "Do you want to make a copy" +
                "\n1. Yes" +
                "\n2. No")
        val option = readln().toInt()
        var clone: Document? = null

        if (option == 1) {
            clone = document.clone()
            clone.title = "Test file - Copy"
        }

        val result = """
            Original document: $document
            Document copied: ${clone?: "No copies made"}
        """.trimIndent()

        return result
    }
}