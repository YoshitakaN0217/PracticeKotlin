/**
 * 著書「Kotlinスタートブック」
 * 　第3章 P38~
 */
class RationalP38(n: Int, d: Int) {
    init {
        require(d != 0, {"denominator must not be zero"})
    }

    private val g by lazy { gcd(Math.abs(n), Math.abs(d)) }
    val numerator: Int by lazy { n / g}		// 遅延初期化
    val denominator: Int by lazy { d / g}
    
    //クラス同士の足し算
    operator fun plus(that: RationalP38): RationalP38 =
    	RationalP38(
        	numerator * that.denominator + that.numerator * denominator,
        	denominator * that.denominator
        )
	operator fun plus(n: Int): RationalP38 =
    	RationalP38(numerator + n * denominator, denominator)
    
    //クラス同士の引き算
    operator fun minus(that: RationalP38): RationalP38 =
    	RationalP38(
        	numerator * that.denominator - that.numerator * denominator,
        	denominator * that.denominator
        )
    operator fun minus(n: Int): RationalP38 =
    	RationalP38(numerator - n * denominator, denominator)
    
    override fun toString() = "${numerator} / ${denominator}"

    // tailrec:末尾再帰最適化
    tailrec private fun gcd(a: Int, b: Int): Int = 
    	if (b == 0) a else gcd(b, a % b)
}

// Intに対する拡張関数
operator fun Int.plus(r: RationalP38): RationalP38 = r + this
operator fun Int.minus(r: RationalP38): RationalP38 = r - this


fun main(args: Array<String>) {
 
    val half = 3 + RationalP38(2,1)
    println(half)
    val half2 = 1 + RationalP38(1,2) + 2
    println(half2)

    //FIXME:計算結果が正しくない
    val half3 = 1 - RationalP38(1,2)
    println(half3)
    
}