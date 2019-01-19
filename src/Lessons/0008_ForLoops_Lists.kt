package Lessons

fun main(args: Array<String>) {

    for (x in 0..100) {
        println(x)
    }

    val variableList = listOf( "michael", 100, true, 3.14 )

    println(variableList)

    //println(variableList[0]) //index, 0 based counting
    //println(variableList[1])
    //println(variableList[2])
    //println(variableList[3])


    for (x in variableList)
        //println (x)


    for (index in 0..3) {
        //println(variableList[index])
    }

    //println(variableList.size)
    //println(variableList.count()


    for (index in 0..variableList.size-1) {
        //println(variableList[index])
    }


}