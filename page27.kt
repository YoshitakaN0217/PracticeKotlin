/**
 * 著書「Kotlinスタートブック」
 * 　第3章 P27~
 */
class RationalP27(val numerator: Int, val denominator: Int) {
    override fun toString() = "${numerator} / ${denominator}"	// 型推論
//    override fun toString(): String = "${numerator} / ${denominator}"
//    override fun toString(): String = Integer.toString(numerator) + "/" + Integer.toString(denominator)
}

fun main(args: Array<String>) {
 
	println("Hello world!!")
    
    // 分数
    val half = RationalP27(5, 10)
    println(half.denominator)
    println(half)
}