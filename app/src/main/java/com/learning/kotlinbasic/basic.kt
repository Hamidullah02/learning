package com.learning.kotlinbasic

fun main() {
    for(i in 1..10) {
        println("press 1-3 to play")
        var opt = arrayOf("ROCK", "PAPER", "SISSORs")
        println("1.ROCK \n2.PAPER \n3.SISSORs")
        var user = readln().toInt()
        var computer = (1..3).random()
        println("user : ${opt[user - 1]}")
        println("computer : ${opt[computer - 1]}")


        val winner= when{
            user == computer ->"tie"
            user == 1 && computer == 3 -> "player"
            user == 2 && computer == 1 -> "player"
            user == 3 && computer == 2 -> "player"
            else ->"computer"
        }

//        if (user == computer) println("draw")
//        else if (user == 1 && computer == 2)  println("you lose")
//        else if (user == 2 && computer == 3) println("you lose")
//        else if (user == 3 && computer == 1) println("you lose")
//        else println("you won")
    }
}