/**
 * 著書「Kotlinスタートブック」
 * 　第3章 P35~
 */
class RationalP35(n: Int, d: Int) {
    init {
        require(d != 0, {"denominator must not be zero"})
    }

    private val g by lazy { gcd(Math.abs(n), Math.abs(d)) }
    val numerator: Int by lazy { n / g}		// 遅延初期化
    val denominator: Int by lazy { d / g}
    
    //クラス同士の足し算
    operator fun plus(that: RationalP35): RationalP35 =
    	RationalP35(
        	numerator * that.denominator + that.numerator * denominator,
        	denominator * that.denominator
        )
    //クラス同士の引き算
    operator fun minus(that: RationalP35): RationalP35 =
    	RationalP35(
        	numerator * that.denominator - that.numerator * denominator,
        	denominator * that.denominator
        )
    
    override fun toString() = "${numerator} / ${denominator}"

    // tailrec:末尾再帰最適化
    tailrec private fun gcd(a: Int, b: Int): Int = 
    	if (b == 0) a else gcd(b, a % b)
}

fun main(args: Array<String>) {
 
    val half = RationalP35(2, 340)
    println(half)
    println(half.denominator)

    val half2 = RationalP35(1,4).plus(RationalP35(1,2))
    println(half2)
    val half3 = RationalP35(1,4) + RationalP35(1,2)
    println(half3)

    val half4 = RationalP35(1,2) - RationalP35(1,6)
    println(half4)


}