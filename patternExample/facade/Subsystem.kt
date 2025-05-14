package patternExample.facade

class Amplifier {
    fun on() = "Amplifier is On"
}

class DVDPlayer {
    fun play(movie: String?) = "Playing movie $movie"
}

class Projector {
    fun on() = "Projector is On"
}