fun main(args: Array<String>) {
    println("Please enter a number A")

    var a = Integer.parseInt(readLine())
    println("Please enter a number B")
    var b = Integer.parseInt(readLine())

    var max: Int = if (a > b) a else b
    print("Max is " + max)


}

