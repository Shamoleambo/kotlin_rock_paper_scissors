package com.example.rockpaperscissors

fun main() {
    var computerChoice = ""
    var playerChoice = ""

    println("Rock, paper or scissors? Enter your choice: ")
    playerChoice = readln()

    val random = (1..3).random()

    when (random) {
        1 -> computerChoice = "Rock"
        2 -> computerChoice = "Paper"
        3 -> computerChoice = "Scissors"
    }

    println("The computer choice is: $computerChoice")
}