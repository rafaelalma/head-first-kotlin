data class Recipe(var name: String)

fun main() {
    var mShoppingList = mutableListOf("Tea", "Eggs", "Milk")
    println("mShoppingList original: $mShoppingList")

    val extraShopping = listOf("Cookies", "Sugar", "Eggs")
    mShoppingList.addAll(extraShopping)
    println("mShoppingList items added: $mShoppingList")

    if (mShoppingList.contains("Tea")) {
        mShoppingList.set(mShoppingList.indexOf("Tea"), "Coffee")
    }

    mShoppingList.sort()
    println("mShoppingList sorted: $mShoppingList")

    mShoppingList.reverse()
    println("mShoppingList reversed: $mShoppingList")

    val mShoppingSet = mShoppingList.toMutableSet()
    println("mShoppingSet: $mShoppingSet")

    val moreShopping = setOf("Chives", "Spinach", "Milk")
    mShoppingSet.addAll(moreShopping)
    println("mShoppingSet items added: $mShoppingSet")

    mShoppingList = mShoppingSet.toMutableList()
    println("mShoppingList new version: $mShoppingList")

    val r1 = Recipe("Chicken soup")
    val r2 = Recipe("Quinoa salad")
    val r3 = Recipe("Thai curry")
    val r4 = Recipe("Jambalaya")
    val r5 = Recipe("Sausage rolls")
    val mRecipeMap = mutableMapOf(
        "Recipe1" to r1,
        "Recipe2" to r2,
        "Recipe3" to r3,
        "Recipe4" to r4,
        "Recipe5" to r5
    )
    println("mRecipeMap original: $mRecipeMap")

    val r6 = Recipe("Tuna salad")
    val r7 = Recipe("Handmade bread")
    val recipesToAdd = mapOf("Recipe6" to r6, "Recipe7" to r7)
    mRecipeMap.putAll(recipesToAdd)
    println("mRecipeMap updated: $mRecipeMap")

    if (mRecipeMap.containsKey("Recipe1")) {
        println("Recipe 1 is: ${mRecipeMap.getValue("Recipe1")}")
    }
}