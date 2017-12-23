fun main(args: Array<String>) {
   /*
    var a = 100L
    if (a is Long)       // To check for a variable Type  we use " is "  or " !is "
        println("a is Long")
    else println("a is not Long")
*/

    /*
    var b = "20"
    var a = "10"
    var result = a.toInt() + b.toInt()        //Explicit casting use  toInt()  toByte()  toFloat() toDouble() toChar()

    print("sum is $result")
*/

    /*
    var a = 100.0f               //Implicit Cast  (automatically)
    print("a data type  ${a.javaClass.kotlin.qualifiedName}")
*/

/*
    Safe Conversion Small data type to Big
    var a: Int = 10
    var b: Long = a.toLong()
    print("b data type ${b.javaClass.kotlin.qualifiedName}")
*/
/*
    Unsafe Conversion Big data type to Small
    var a: Float = 20.1f
    var b: Int = a.toInt()
    println(b)
    // we lost 0.1f
*/
}
