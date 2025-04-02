fun main() {
    // Kotlin has 3 collection types
    
    // Lists
    // Ordered collections of items
    val shapes = listOf("square", "triangle", "circle")
    var mutableShapes = mutableListOf("square")
    println(shapes)
    println(mutableShapes)
    mutableShapes.add("ellipse")
    mutableShapes.add("rectangle")
    mutableShapes.add("circle")
    mutableShapes.add("triangle")
    println(mutableShapes)
    
    println("${mutableShapes[1]} ${mutableShapes.first()} ${mutableShapes.last()}")
    println("number of shapes: ${mutableShapes.count()}")
    println("is there a circle? ${"circle" in mutableShapes}")
    
    mutableShapes.remove("circle")
    println("is there a circle? ${"circle" in mutableShapes}")
    
    // Sets
    // Unique unordered collections of items
    val fruits = setOf("apple", "banana", "cherry", "cherry")
    println(fruits)
    
    var mutableFruits = mutableSetOf("apple")
    mutableFruits.add("banana")
    mutableFruits.add("cherry")
    mutableFruits.add("cherry")
    println(mutableFruits)
    
    mutableFruits.remove("apple")
    println("apple? ${"apple" in mutableFruits} count? ${mutableFruits.count()}")
    
    
    // Maps
    // Sets of key-value pairs where keys are unique and map to only one value
    val menu = mapOf("apple" to 100, "kiwi" to 190, "orange" to 200)
    println(menu)
    println(menu["kiwi"])
    println(menu["dragonfruit"])
    
    var mutableMenu = mutableMapOf("apple" to 99)
    mutableMenu["dragonfruit"] = 770
    mutableMenu["kiwi"] = 140
    mutableMenu["orange"] = 80
    mutableMenu.remove("apple")
    println(mutableMenu)
    println("${mutableMenu.count()} ${mutableMenu.containsKey("kiwi")}")
    
    println(mutableMenu.keys)
    println(mutableMenu.values)
    
    println("${"kiwi" in mutableMenu} ${99 in mutableMenu.values}")
}
