// Kotlin uses null values when something is missing or not yet set

// Kotlin has null safety
// It detects potential problems with null values at compile time
// - Explicitly declare when nulls are allowed in the program
// - Check for null values
// - Use safe calls to properties or functions that may contain null
// - Declare actions to take if null values are detected
fun main() {
	// By default, a type is not allowed to accept null
    var neverNull: String = "This can't be null"
    
    // Throws a compiler error
//     neverNull = null
    println(neverNull)
    
    // Nullable types are declared adding ?
    var nullable: String? = "You can keep a null here"
    
    nullable = null
    println(nullable)
    
    // Doesn't accept null
    fun strLen(notNull: String): Int {
        return notNull.length
	}
    
    println(strLen(neverNull))
//     println(strLen(nullable)) // Throws a compiler error


	// Check for null values
    if (neverNull != null) {
        println("<$neverNull> is ok")

    } else {
        println("Null!!!!")
    }
    if (nullable != null) {
        println("<$nullable> is ok")
    } else {
        println("Null!!!!")
    }
    
    
    // Use the safe call operator
//     println(nullable.length) // Throws an error
	println(nullable?.length)
    
    // Use the Elvis operator to provide a default value
    println(nullable?.length ?: 0)
}
