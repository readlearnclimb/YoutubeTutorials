package Lessons

fun main(args: Array<String>) {

    val myAge = 17
    val smokingAge = 18
    val drinkingAge = 21

    if (myAge >= smokingAge && myAge < drinkingAge) {
        println("I can buy cigarettes, but not alcohol in the US.")
    } else if (myAge >= drinkingAge) {
        println("I can buy cigarettes AND alcohol in the US.")
    } else {
        println("I cannot buy either.")
    }

    fun canYouBuyCigarettes(age: Int) {
        if (age >= 18) {
            println("I am $age, so I can buy cigarettes")
        } else {
            println("I am $age, so I cannot buy cigarettes.")
        }
    }

    canYouBuyCigarettes(19)


}


