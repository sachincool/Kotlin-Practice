fun main(args: Array<String>) {
    var a = -7
    var b = 5
    println("${++a}" + " OR " + a.inc())
    println("${--a}" + " OR " + a.dec())
    println("${+a}" + " OR " + a.unaryPlus())
    println("${-a}" + " OR " + a.unaryMinus())
    println("${a + b}" + " OR " + a.plus(b))
    println("${a - b}" + " OR " + a.minus(b))
    println("${a / b}" + " OR " + a.div(b))
    println("${a * b}" + " OR " + a.times(b))
    println("${a % b}" + " OR " + a.rem(b))

    var intArray = arrayOf(1, 2, 3, 4, 5, 6)  //  "in" operator use to check if it contains an element
    if (1 in intArray)
        println("1 is in the array")

    if (11 !in intArray)
        println("11 is not in int array")

    // Int ranges
    var s = 3.rangeTo(10)
    var d = 3..10
    println(s)
    println(d)

    // Assign Operators
    var g = 3
    g += 5
    println(g)

    // other Operators  && || == and !=  Are same as any other language 

}
