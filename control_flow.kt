fun main() {
    // if you have to choose between 'if' and 'when', 'when' is recommended
    
    // if
    val d: Int
    val check = true
    
    if (check) {
        d = 1
    } else {
        d = 0
    }
    
    println(d)
    
    println(if (check) "yes" else "no")
    
    // when
    val obj = "hi"
    
    when (obj) {
        "hello" -> println("Hello!")
        "hola" -> println("Hola muchacho")
        "hi" -> println("Just hi!")
        else -> println("Greetings?")
    }
    
    val result = when (obj) {
        "hello" -> "HELLO"
        "hola" -> "HOLA"
        "hi" -> "HI HI"
        else -> "HEY???"
    }
    println(result)
    
    val trafficLight = "Green"
    val action = when {
        trafficLight == "Green" -> "Go!"
        trafficLight == "Yellow" -> "Slow down"
        trafficLight == "Red" -> "Stop"
        else -> "Good luck! lol"
    }
    println(action)
}
