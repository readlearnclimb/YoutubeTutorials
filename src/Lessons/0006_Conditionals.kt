package Lessons

fun main(args: Array<String>) {

    var myAge: Int = 15

    var smokingAge: Int = 18
    var drinkingAge: Int = 21

    if (myAge >= smokingAge) {    // age > smokingAge returns a Boolean value (true or false, yes or no)
        println("I can buy cigarettes, but not alcohol in the US.")
    } else if (myAge >= drinkingAge) {
        println("I can buy cigarettes AND alcohol in the US.")
    } else {
        println("I cannot buy.")
    }


    fun canYouBuyCigarettes(age: Int) {
        if (age >= 18) {
            println("I am $age, so I can buy cigarettes")
        } else {
            println("I am $age, so I cannot buy cigarettes.")
        }
    }

    //canYouBuyCigarettes(17)
}


