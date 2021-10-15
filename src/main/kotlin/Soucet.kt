fun main () {
    val input: String = readLine()!!
    var output: Int = 0
    for (c in input.toCharArray()) {
        if(c.isDigit()) output += c.digitToInt()
    }
    print(output)
}
