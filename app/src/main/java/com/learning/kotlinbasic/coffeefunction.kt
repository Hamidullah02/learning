package com.learning.kotlinbasic

fun main() {
    var n=3
    repeat(n) {
        var (sugarcounts ,name)= readln()!!.split(" ")
        var sugarcount=sugarcounts.toLong()
        makecoffee(sugarcount , name)
    }
}


fun makecoffee(sugar:Long,name:String){
    if(sugar<1) println("coffee with no sugar for $name")
    else if(sugar == 1.toLong()){
        println("1 cube of sugar for $name")
    }
    else println("$sugar cubes of sugar for $name")
}