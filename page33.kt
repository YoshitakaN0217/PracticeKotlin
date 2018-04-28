/**
 * 著書「Kotlinスタートブック」
 * 　第3章 P33~
 */
class RationalP33(n: Int, d: Int) {
    init {
        require(d != 0, {"denominator must not be zero"})
    }

	// 約分
	private val g = gcd(Math.abs(n), Math.abs(d))
    val numerator: Int = n / g
    val denominator: Int = d / g
    override fun toString() = "${numerator} / ${denominator}"

    // tailrec:末尾再帰最適化
    tailrec private fun gcd(a: Int, b: Int): Int = 
    	if (b == 0) a else gcd(b, a % b)
}

fun main(args: Array<String>) {
 
    // 分数
    val half = RationalP33(2, 340)
    println(half)
    println(half.denominator)
//    println(half.g)
//	println(half.gcd(2,340))
    
}