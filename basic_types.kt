fun main() {
    // Kotlin is statically typed
    // Types can be infered
    var customers = 10
    customers = customers + 3
    customers -= 20
    
    println("customers $customers")
    
    val a: Int = 10
    val b: UInt = 100u
    val c: Float = 24.5f
    val d: Double = 25.5
    val f: Boolean = true
    val g: Char = 'h'
    val h: String = "hello"
    
    println("$a $b $c $d $f $g $h")
    
    // variable declared without initialization
    val x: Boolean
    
    x = false
    println(x)
}
