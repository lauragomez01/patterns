package patternExample.flyweight

class CharacterGlyph {
    private var symbol = 0.toChar() // intrinsic (shared)

    fun CharacterGlyph(symbol: Char) {
        this.symbol = symbol
    }

    // extrinsic (position-specific)
    fun draw(x: Int, y: Int) =
        "Drawing '$symbol' at ($x, $y)"
}