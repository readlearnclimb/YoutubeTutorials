package Lessons

fun main(args: Array<String>) {
    // && and || Operators

    var myAge : Int = 19
    var citizen : Boolean = true

    if (myAge >= 18 && citizen == true) {
        println("I can vote in the US")  //I know this isn't ALWAYS true... but work with me here...
    } else {
        println("I cannot vote in the US")
    }

    fun canVote (age: Int, citizenship : Boolean) {
        if (age >= 18 && citizenship == true) {
            println("I can vote!")
        } else {
            println("I cannot vote!")
        }
    }

    canVote(21, false)

    var a = true
    var b = 20

    var answer = (a == true || b > 10)

    println(answer)


}