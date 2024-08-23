package com.learning.kotlinbasic

class dog (val name:String,val breed:String ,var age:Int){

    init {
        bark(name)
    }

    fun bark(name:String){
        println("$name says bark! bark!")
    }
}