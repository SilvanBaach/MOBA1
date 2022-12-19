package ch.codebros.gol

fun main(args: Array<String>) {
    val rows = 24
    val columns = 24

    val gameboard: Gameboard = Gameboard(rows, columns)
    val printer = Printer(gameboard)

    for (iter in 1..50) {
        println("iteration $iter:")
        printer.printGameboard()
        gameboard.determineFate()
        Thread.sleep(350)
    }
}