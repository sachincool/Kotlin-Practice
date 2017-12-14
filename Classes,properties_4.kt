//Class implementation
// We don't need  Getter/Setter  and No constructors
class Person(var name: String, var age: Int, var gender: Boolean)


fun main(args: Array<String>) {

    var person1 = Person("Harshit", 20, true)  //initialized the object without the "new" Keyword
    // Before Change
    println("Person name : ${person1.name}")
    println("Person age : ${person1.age}")
    println("Person Gender Male : ${person1.gender}")

    // After Change
    person1.age = 25


    val rect = Rect(4, 4)
    println("Is it a Square ? : ${rect.isSquare}")

}

class Rect(val Height: Int, val Width: Int) {
    // Custom Accessor


    // The property isSquare doesn't need a field to store it's value, it only has a Custom getter with the implementation provided
    // The property is computed every time the property is accessed
    val isSquare: Boolean
        get() = Height == Width

}
