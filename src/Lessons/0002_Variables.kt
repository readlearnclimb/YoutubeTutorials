
fun main(args: Array<String>) {
    // Strings
    var name = "The Kotlin King"
    var age = 34

    //String concatenation
    var str1 = "My name is " + name + ", and I am " + age + " years old."
    var str2 = "My name is ${name}, and I am ${age} years old."
    println(str1)
    println(str2)

    var command = "i am code."

    println(command.contentEquals("i am code."))
    println(command.toUpperCase())

}