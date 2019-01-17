package com.readlearnclimb.kotlin

fun main(args: Array<String>) {

    // useful functions modify & transfer info --> 'RETURN' tells the program what info to transfer

    fun addTwoNumbers(number1 : Int, number2: Int) : Int {
        // note the return type (Int) — what does 'return' mean, intuitively?

        val total = number1 + number2   // ANY name variable could have been used
        return total

        // return number1 + number2
    }

    //println

    var newNumber = addTwoNumbers(5, 7)
    //println(newNumber)

    fun dogInfo(name: String, age: Int): String {       // note the return type (String)
        return "My dog's name is $name and he is $age years old"
    }

    val sentence = dogInfo("Coder", 30)
    //println(sentence)

}