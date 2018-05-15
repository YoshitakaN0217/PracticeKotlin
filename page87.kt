/**
 * 著書「Kotlinスタートブック」
 * 　第5章 P87~
 */

package practiceP87

fun main(args: Array<String>) {
    //ラムダ式
    var squareLambda: (Int) -> Int = { i: Int ->
        i * i
    }
    // 型省略1
    var squareLambda2 = { i: Int ->
        i * i
    }
    // 型省略2
    var squareLambda3: (Int) -> Int = { i ->
        i * i
    }
    
    // 暗黙の変数it
    //  引数が1つの場合のみ使える
    var squareLambdaIt: (Int) -> Int = {
        it * it
    }


    println(squareLambda(3))
    println(squareLambda2(3))
    
    println(squareLambdaIt(2))    
    
    val checkStr = "fsekvv dd"
    println(firstWhitespace(checkStr))
    
    // ラムダ式版
    val firstWhitespaceLanbda: (String) -> Int = {
        first(it, { it.isWhitespace() })
    }
    println(firstWhitespaceLanbda(checkStr))
}

fun firstWhitespace(str: String): Int {
    val isWhitespace: (Char) -> Boolean = {
        it.isWhitespace()
    }
    return first(str, isWhitespace)
}


fun first(str: String, predicate: (Char) -> Boolean): Int {
    tailrec fun go(str: String, index: Int): Int =
        when {
            str.isEmpty() -> -1
            predicate(str.first()) -> index
            else -> go(str.drop(1), index+1)
        }
    return go(str, 0)
}