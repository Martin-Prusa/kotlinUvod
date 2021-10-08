import java.util.*

fun main() {
    val sc = Scanner(System.`in`)

    val m: Float = sc.nextFloat()
    val n: Float = sc.nextFloat()
    val a: Float = sc.nextFloat()

    println((kotlin.math.ceil(m/a)*kotlin.math.ceil(n/a)).toInt())
}