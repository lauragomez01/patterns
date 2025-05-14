package patternExample.facade

import patternExample.template.PatternMenu

/**
 * Facade Pattern --------------------------------------------------------------
 * The Facade pattern provides a simple and unified interface to a complex system
 * of classes, libraries, or subsystems. It hides the complexity and exposes only
 * what the client needs to interact with.
 * -------------------------------------------------------------------------------
 */

class FacadeExec : PatternMenu() {
    override fun customMessage(): String = "10. What movie (Facade pattern)"

    override fun process(): String {
        println("Write the movie to watch")
        val movie = readln()

        val home = HomeTheaterFacade(
            Amplifier(),
            DVDPlayer(),
            Projector()
        )
        return home.watchMovie(movie)
    }
}