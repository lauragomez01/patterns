package patternExample.flyweight

import patternExample.flyweight.GlyphFactory.getGlyph
import patternExample.template.PatternMenu

/**
 * Flyweight Pattern --------------------------------------------------------------
 * The Flyweight pattern is a structural design pattern used to reduce memory
 * usage by sharing common objects instead of creating many identical ones.
 * Its main objective is to avoid creating many duplicate objects by reusing
 * shared instances of immutable data.
 * -------------------------------------------------------------------------------
 */

class FlyweightExec : PatternMenu() {
    override fun customMessage(): String = "11. Names (Flyweight pattern)"

    override fun process(): String {
        val a1 = getGlyph('a')
        val a2 = getGlyph('a')

        a1.draw(0, 0)
        a2.draw(1, 0)

        return "Is the same instance ${a1 === a2}"
    }
}