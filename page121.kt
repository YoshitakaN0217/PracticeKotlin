/**
 * 著書「Kotlinスタートブック」
 * 　第8章 P121~
 */

package practiceP121


fun main(args: Array<String>) {
    val half = Rational(1,2)
    println(half.numerator)
    println(half.denominator)
    
    val half2 = Rational3(1,2)
    println("${half2.numerator}/${half2.denominator}")
    var five = Rational3(5)
    println("${five.numerator}/${five.denominator}")
    
//    val half3 = Rational4(1,0)	// 例外が投げられる
//    println("${half3.numerator}/${half3.denominator}")

	println("I like Kotlin".countSpace())
    println("I like Kotlin".wordsCount)
    
}

// プライマリコンストラクタ　明示版
class Rational constructor(n: Int, d: Int) {
    val numerator: Int = n
    val denominator: Int = d
}
// プライマリコンストラクタ　省略版
class Rational2(val numerator: Int, val denominator: Int)
// セカンダリコンストラクタ
class Rational3(val numerator: Int, val denominator: Int) {
    constructor(numerator: Int) : this(numerator, 1)	// セカンダリコンストラクタの中でプライマリコンストラクタを呼びたい時はthis
}

// イニシャライザ
class Rational4(val numerator: Int, val denominator: Int) {
	init {
        // reqire:条件が真の時、例外を投げる標準ライブラリ
        require(denominator != 0)        // バリデート
    }
}


// エクステンション:関数
fun String.countSpace(): Int =
	this.split("""\s+""".toRegex()).size
// エクステンション:プロパティ(但しバッキングフィールドはもてない)
val String.wordsCount: Int
	get() = split("""\s+""".toRegex()).size



