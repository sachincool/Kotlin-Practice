fun main(args: Array<String>) {

    // readLine() is used to take input  and returns a string which can be null
    /*
    print("Enter your name")
    var name=readLine()
    print("Hello your name is $name")
*/
    print("True?")
    var value = readLine()
    if (value?.toBoolean() == true)

        println("Variable 1")
    var a = readLine()?.toInt()
    println("Variable 2")
    var b = readLine()?.toInt()
    println("Sum of $a and $b is ${a?.plus(b!!)}")


}
