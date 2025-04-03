// val properties are read-only
class Customer(val id: Int, var email: String = "user@gmail.com")

class Car(val brand: String, val maxvel: Int, var color: String) {
    // This is a member function
	fun run() {
        println("running at $maxvel km/h")
    }
}

// Data classes come automatically with additional member functions
// that allow us to easuly print the instance to a readable output
data class Person(val name: String, var age: Int)

fun main() {
	// Kotlin automatically creates a constructor with the parameters
    // declared in the class header
    val user = Customer(1, "joel@gmail.com")
    println(user.id)
    println(user.email)
    
    user.email = "eljoel@gmail.com"
    println(user.email)
    
    val mustang = Car("Ford", 200, "white")
    mustang.run()
    
    val jon = Person("Jon Snow", 27)
    // MEMBER FUNCTIONS OF DATA CLASSES
    println(jon.toString())
    println(jon) // this uses toString() automatically
    
    val julian = Person("Julian Cruz", 55)
    val jony = Person("Jon Snow", 27)
    // == uses the equals() function 
    println(jon == julian)
    println(jon == jony)
    
    // Creates an exact copy of the instance
    println(julian.copy())
    // Creates a copy with a replacement
    println(julian.copy(age=16))
}
