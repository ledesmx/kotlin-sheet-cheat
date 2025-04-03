// Example of function
fun hello() {
    println("Hello")
}

// Function with parameters and a return
fun sum(x: Int, y: Int): Int {
    return x + y
}

fun messageWithPrefixAndSuffix(message: String, prefix: String, suffix: String) {
	println("<$prefix> $message - $suffix")
}

// Default parameter value
fun hiUser(user: String = "user") {
    println("Hello $user")
}

// Single-expression function
fun mul(x: Int, y: Int): Int = x * y

fun main() {
	hello()
    println(sum(99, 77))
    
    // We can pass named arguments
    messageWithPrefixAndSuffix(prefix = "Log", message = "Hello", suffix = "10.10.10")
    messageWithPrefixAndSuffix(suffix = "123", prefix = "Log", message = "Hola papa!")

	hiUser("Oscar")
	hiUser()
    
    // functinos without a return value return Unit
    // Unit is a type with only one value - Unit
    println(hello())
    
    println(mul(7, 9))
    
    // Lambda expressions
    val div = { x: Int, y: Int -> x / y }
    println(div(10, 5))
    
    // Example of lambda usecase
    val numbers = listOf(-4, 3, -6, 7, 8, -5, 2, 5, -9, -1)
    val positives = numbers.filter({ x: Int -> x > 0 })
    println(positives)
}
