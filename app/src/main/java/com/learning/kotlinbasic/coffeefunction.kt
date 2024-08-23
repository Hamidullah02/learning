package com.learning.kotlinbasic


 data class coffeedetails(
     val sugarcount:Int,
     val name: String ,
     val size:String,
     val creameamount:Int
 )


fun main() {
    val denis = coffeedetails(0,"denis","large", 2)
    makecoffee(denis)
}

fun askcoffeedetail(){
    println("for who?")
    var name =readln()
    println("how much sugar ?")
    var sugarcount= readln().toLong()
   // makecoffee(sugarcount,name)
}


fun makecoffee(coffeedetails:coffeedetails){
    if(coffeedetails.sugarcount<1) println("coffee with no sugar for ${coffeedetails.name}")
    else if(coffeedetails.sugarcount == 1){
        println("1 cube of sugar for ${coffeedetails.name}")
    }
    else println("${coffeedetails.sugarcount} cubes of sugar for ${coffeedetails.name}")
}