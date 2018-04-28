/**
 * 著書「Kotlinスタートブック」
 * 　第3章 P31~
 */
class RationalP31(val numerator: Int, val denominator: Int?) {
    init {
//        require(denominator != 0)
//        require(denominator != 0, {"denominator must not be zero"})
//		requireNotNull(denominator, {"denominator must not be null"})

        check(denominator != 0, {"denominator must not be zero"})
        
        //Q. requireとCheckの使い分けはどうすればいいのか?
    }
    override fun toString() = "${numerator} / ${denominator}"
}

fun main(args: Array<String>) {
 
    // 分数
    val half = RationalP31(5, 0)
    println(half)

    val half2 = RationalP31(5, null)
    println(half2)

}

