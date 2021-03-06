fun main() {
    val options = arrayOf("rock", "paper", "scissors")
    val gameChoice = getGameChoice(options)
    val userChoice = getUserChoice(options)
    printResult(userChoice, gameChoice)
}

fun getGameChoice(optionsParam: Array<String>) = optionsParam[(Math.random() * optionsParam.size).toInt()]

fun getUserChoice(optionsParam: Array<String>): String {
    var isValidChoice = false
    var userChoice = ""

    while (!isValidChoice) {
        println("Please enter one of the following:")
        for (item in optionsParam) print(" $item \n")

        val userInput: String? = readLine()

        if (userInput != null && userInput in optionsParam) {
            isValidChoice = true
            userChoice = userInput
        } else {
            println("You must enter a valid choice:")
        }
    }

    return userChoice
}

fun printResult(userChoice: String, gameChoice: String) {

    val result: String = if (userChoice == gameChoice) "Tie!"
    else if ((userChoice == "rock" && gameChoice == "scissors") ||
        (userChoice == "paper" && gameChoice == "rock") ||
        (userChoice == "scissors" && gameChoice == "paper")
    ) "You win!"
    else "I win!"

    println("You chose $userChoice. I chose $gameChoice. $result")
}