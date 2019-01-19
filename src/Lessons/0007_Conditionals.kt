package Lessons

fun main(args: Array<String>) {

    fun canYouVote(age: Int, citizenship: Boolean) {
        if (age >= 18 && citizenship) {
            println("I can vote!")
        } else {
            println("I cannot vote!")
        }
    }

    canYouVote(21, true)

    val haveGreenCard = false
    val haveCitizenship = false

    if (haveGreenCard || haveCitizenship) {
        println("I can live in the US permanently.")
    } else {
        println("I cannot live in the US permanently.")
    }
}