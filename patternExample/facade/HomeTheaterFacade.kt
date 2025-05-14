package patternExample.facade

class HomeTheaterFacade(
    private val amp: Amplifier,
    private val dvd: DVDPlayer,
    private val projector: Projector
) {
    fun watchMovie(movie: String?) =
        "1. ${amp.on()} \n2. ${projector.on()} \n3. ${dvd.play(movie)}"
}