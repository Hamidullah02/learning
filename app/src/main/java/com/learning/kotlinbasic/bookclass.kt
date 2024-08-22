package com.learning.kotlinbasic

class book(val title: String="Unknown", val author: String="Anonymous", val yearPublished: Int=2024 ){

    init {
        prnt()
    }
    fun prnt(){
        println(title)
        println(author)
        println(yearPublished)
    }

}