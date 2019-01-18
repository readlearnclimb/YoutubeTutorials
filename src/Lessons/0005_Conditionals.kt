
fun main(args: Array<String>) {
    // Operators | Conditionals & Control Flow

    var isItDoneCalculating : Boolean = true //yes
    var doesItHaveTheData : Boolean = false //no

    println(1 == 1) // true
    println(1 != 2) // true
    println(2 > 1)  // true
    println(1 >= 1) // true
    println(1 < 2)  // true
    println(2 <= 2) // true

    println("kotlin" == "kotlin") // true

    // discuss the importance of Booleans / Conditionals.
    // computer's way to make decisions and DO useful things

    var isTheTaskFinished : Boolean = true

    if (isTheTaskFinished) {
        println("On to the next task")
    } else {
        println("Let's wait until it is finished")
    }

}