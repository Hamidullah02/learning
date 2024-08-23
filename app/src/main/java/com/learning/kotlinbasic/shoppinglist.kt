package com.learning.kotlinbasic

fun main() {
    val shoppintlist= mutableListOf("processor", "ram", "gpu", "ssd")
    shoppintlist.add("fancy cooler")
    println(shoppintlist)
    shoppintlist[2]="rx 78000xt"
    shoppintlist.remove("iojkoik")
    println(shoppintlist)

}