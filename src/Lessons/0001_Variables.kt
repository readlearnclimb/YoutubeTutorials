package com.readlearnclimb.kotlin // do not copy & paste this line --> you already have this

fun main(args:Array<String>) {

// basic variable types - String, Int, Double, Boolean

    var name : String = "The Kotlin King"

    var age: Int = 34
    //age = "Kotlin" // <-- once declared a certain type, cannot change the type (e.g. can't go from Int to String)

    var weight :Double = 136.45
    var canCode : Boolean = true //true or false
    val wife : String = "Miss Kotlin King"

    println(name)
    println(age)
    age = 35 //mutability
    println(age)
    println(weight)
    println(canCode)
    println(wife)
    print(name)
    print(canCode)
}
