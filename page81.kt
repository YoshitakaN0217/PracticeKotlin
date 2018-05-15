/**
 * 著書「Kotlinスタートブック」
 * 　第5章 P81~
 */

package practiceP81

fun main(args: Array<String>) {
//    println(::square)

    // 関数オブジェクトを変数として保持できる
//    val functionObject = ::square
//    println(functionObject(2))
    
    val checkStr = "fwrFwkK"
    println(firstK(checkStr))
    println(firstUpperCase(checkStr))
    
    println(firstK2(checkStr))
    println(firstUpperCase2(checkStr))
}

fun square(i: Int): Int = i * i

// 最初に'K'が出現する位置を返す
fun firstK(str: String): Int {
    tailrec fun go(str: String, index: Int): Int =
    	when {
            str.isEmpty() -> -1
            str.first() == 'K' -> index
            else -> go(str.drop(1), index+1)
        }
    return go(str, 0)
}
// 最初に大文字が出現する位置を返す
fun firstUpperCase(str: String): Int {
    tailrec fun go(str: String, index: Int): Int =
    	when {
            str.isEmpty() -> -1
            str.first().isUpperCase() -> index
            else -> go(str.drop(1), index+1)
        }
    return go(str, 0)
}
// firstK,firstUpperCaseを汎用性をもたせた関数
// predicateはCharを引数に持ちBooleanを返す関数オブジェクト
fun first(str: String, predicate: (Char) -> Boolean): Int {
    tailrec fun go(str: String, index: Int): Int =
    	when {
            str.isEmpty() -> -1
            predicate(str.first()) -> index
            else -> go(str.drop(1), index+1)
        }
    return go(str, 0)
}

fun firstK2(str: String): Int {
    fun isK(c: Char): Boolean = c == 'K'
    return first(str, ::isK)
}
fun firstUpperCase2(str: String): Int {
    fun isUpperCase(c: Char): Boolean = c.isUpperCase()
    return first(str, ::isUpperCase)
}




