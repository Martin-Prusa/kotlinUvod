import java.util.*

fun main() {
    val sc: Scanner = Scanner(System.`in`)
    var min: Int = Int.MAX_VALUE
    var max: Int = Int.MIN_VALUE
    while (sc.hasNext()) {
        val input = sc.nextInt();
        if(input < min)
            min = input
        if(input > max)
            max = input
    }
    println("Min: $min Max: $max")
}