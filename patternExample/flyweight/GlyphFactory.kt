package patternExample.flyweight

object GlyphFactory {
    private val cache: MutableMap<Char, CharacterGlyph> = HashMap()

    fun getGlyph(symbol: Char): CharacterGlyph {
        return cache.computeIfAbsent(symbol) { CharacterGlyph() }
    }
}