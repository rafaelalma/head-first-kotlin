fun main() {
    val options = arrayOf("rock", "paper", "scissors")
    val gameChoice = getGameChoice(options)
}

fun getGameChoice(optionsParam: Array<String>) = optionsParam[(Math.random() * optionsParam.size).toInt()]