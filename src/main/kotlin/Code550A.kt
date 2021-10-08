fun main() {
    val input: String = readLine()!!.lowercase()
    var valid = false;
    for (i in 2..input.length) {
        val substring1: String = input.substring(0,i)
        val substring2: String = input.substring(i)
        if((substring1.contains("ab") && substring2.contains("ba")) || (substring1.contains("ba") && substring2.contains("ab"))) {
            valid = true
            break
        }
    }

    if(valid) {
        println("YES")
    } else {
        println("NO")
    }
}