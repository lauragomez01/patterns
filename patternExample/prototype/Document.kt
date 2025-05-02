package patternExample.prototype

class Document (
    var title: String,
    var content: String,
    var author: String,
) : Prototype<Document> {

    override fun clone(): Document {
        return Document(title, content, author)
    }

    override fun toString(): String {
        return "Document(title='$title', content='$content', author='$author')"
    }
}