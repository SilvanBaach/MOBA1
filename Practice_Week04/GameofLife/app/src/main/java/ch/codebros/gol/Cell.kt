package ch.codebros.gol

import kotlin.random.Random

class Cell constructor(var alive: Int? = null) {
    init {
        alive = Random.nextInt(0, 2)
    }
}

