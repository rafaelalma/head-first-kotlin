data class Grocery(
    val name: String, val category: String,
    val unit: String, val unitPrice: Double,
    val quantity: Int
)

fun main() {
    val groceries = listOf(
        Grocery("Tomatoes", "Vegetable", "lb", 3.0, 3),
        Grocery("Mushrooms", "Vegetable", "lb", 4.0, 1),
        Grocery("Bagels", "Bakery", "Pack", 1.5, 2),
        Grocery("Olive Oil", "Pantry", "Bottle", 6.0, 1),
        Grocery("Ice Cream", "Frozen", "Pack", 3.0, 2)
    )

    val highestUnitPrice = groceries.maxByOrNull { it.unitPrice * 5 }
    println("Highest Unit Price: $highestUnitPrice")

    val lowestQuantity = groceries.minByOrNull { it.quantity }
    println("Lowest Quantity: $lowestQuantity")

    val sumQuantity = groceries.sumBy { it.quantity }
    println("Sum Quantity: $sumQuantity")

    val totalPrice = groceries.sumByDouble { it.quantity * it.unitPrice }
    println("Total Price: $totalPrice")

    val vegetables = groceries.filter { it.category == "Vegetable" }
    println("Vegetables: $vegetables")

    val notFrozen = groceries.filterNot { it.category == "Frozen" }
    println("Not Frozen : $notFrozen")

    val groceryNames = groceries.map { it.name }
    println("Grocery Names: $groceryNames")

    val halfUnitPrice = groceries.map { it.unitPrice * 0.5 }
    println("Half Unit Price: $halfUnitPrice")

    val newPrices = groceries.filter { it.unitPrice > 3.0 }.map { it.unitPrice * 2 }
    println("New Prices: $newPrices")

    println("Grocery names: ")
    groceries.forEach { println(it.name) }

    println("Groceries with unitPrice > 3.0: ")
    groceries.filter { it.unitPrice > 3.0 }.forEach { println(it.name) }

    // Closure
    var itemNames = ""
    groceries.forEach { itemNames += "${it.name} " }
    println("Item names: $itemNames")

    groceries.groupBy { it.category }.forEach {
        println(it.key)
        it.value.forEach { println("    ${it.name}") }
    }

    val ints = listOf(1, 2, 3)

    val sumOfInts = ints.fold(0) { runningSum, item -> runningSum + item }
    println("Sum of ints: $sumOfInts")

    val productOfInts = ints.fold(1) { runningProduct, item -> runningProduct * item }
    println("Product of ints: $productOfInts")

    val names = groceries.fold("") { string, item -> string + " ${item.name}" }
    println("Names: $names")

    val changeFrom50 = groceries.fold(50.0) { change, item -> change - item.unitPrice * item.quantity }
    println("Change from 50: $changeFrom50")
}