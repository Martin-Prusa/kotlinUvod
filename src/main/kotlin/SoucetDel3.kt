import java.util.*

fun main() {
    val sc: Scanner = Scanner(System.`in`)
    var position: Int = 1
    var output: Int = 0
    while(sc.hasNext()) {
        val input: Int = sc.nextInt()
        if(input % 3 == 0 && position % 2 == 0)
            output += input
        position++
    }
    println(output)
}