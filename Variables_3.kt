

    var a = 100L // #1 Long Implicitly defined data typed (compiler gets the datatype from the value

    val b = 0.1F // #2 Float Implicitly   defined data typed (compiler gets the datatype from the value

    /*
        Both var & val are used to define Values without explicitly defining datatype
        difference between var and val is  val = Immutable reference  means  it can't be reassigned after it's initialised (kinda like final in Java)
        var is mutable reference    could  also be called regular (non-final) like Java

     */

    var c:Int = 0 // Integer Explicitly defined data type

    var d:Char = 'a'

    var e:String = "This is single line"

    var f:String = """

        tHis Is MultiLine
        String
        HoweVer You Can ForMat It
        Awsome right ?
        Kinda like python.

         """
    var integerArray:IntArray = intArrayOf(1,2,3,4,5,6)
    var longArray: LongArray = longArrayOf(1000L,2000L,3000L)
    var floatArray:FloatArray = floatArrayOf(0.1f,0.2f,0.3f)
    var doubleArray:DoubleArray = doubleArrayOf(0.11,0.22,0.33)



    fun main(args:Array<String>){
        for(val i='a'; i<='f'; i++)
        println("Variable $i")
    }
