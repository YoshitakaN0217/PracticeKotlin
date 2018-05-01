/**
 * 著書「Kotlinスタートブック」
 * 　第3章 P37~
 */
class RationalP37(n: Int, d: Int) {
    init {
        require(d != 0, {"denominator must not be zero"})
    }

    private val g by lazy { gcd(Math.abs(n), Math.abs(d)) }
    val numerator: Int by lazy { n / g}		// 遅延初期化
    val denominator: Int by lazy { d / g}
    
    //クラス同士の足し算
    operator fun plus(that: RationalP37): RationalP37 =
    	RationalP37(
        	numerator * that.denominator + that.numerator * denominator,
        	denominator * that.denominator
        )
	operator fun plus(n: Int): RationalP37 =
    	RationalP37(numerator + n * denominator, denominator)
    
    //クラス同士の引き算
    operator fun minus(that: RationalP37): RationalP37 =
    	RationalP37(
        	numerator * that.denominator - that.numerator * denominator,
        	denominator * that.denominator
        )
    operator fun minus(n: Int): RationalP37 =
    	RationalP37(numerator - n * denominator, denominator)
    
    override fun toString() = "${numerator} / ${denominator}"

    // tailrec:末尾再帰最適化
    tailrec private fun gcd(a: Int, b: Int): Int = 
    	if (b == 0) a else gcd(b, a % b)
}

fun main(args: Array<String>) {
 
    val half = RationalP37(4,4) + 1
    println(half)

    val half2 = RationalP37(1,4) - 1
    println(half2)


}