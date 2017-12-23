fun max2Numbers(a: Int,b: Int): Int { 
return if(a>b)a else b
}  //This is  Block-type function or statement type function

// We could also write
// fun max2Numbers(a:Int,b:Int) = if(a>b) a else b
// This is expression type function Note:- we dont have return type
fun main(args: Array<String>){ 
        println("Max 2 numbers : ${max2Numbers(10,100) } ")
}


