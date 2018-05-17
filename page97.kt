/**
 * 著書「Kotlinスタートブック」
 * 　第6章 P97~
 */

package practiceP97

fun main(args: Array<String>) {
    
    // ラムダ式と無名関数の違い
    // 　無名関数は値を帰す場合、return必須
    // 　無名関数は非ローカルリターン使用不可
    
    // Kotlinではラムダ式、無名関数をまとめて「関数リテラル」という
    
    // ラムダ式
    val square1: (Int) -> Int = { i: Int ->
        i * i
    }
    
    // 無名関数
    val square2: (Int) -> Int = fun(i: Int): Int {
        return i * i
    }

    // 無名関数(省略ver)
    val square3: (Int) -> Int = fun(i: Int) = i * i
    
    println(square1(2))
    println(square2(2))
    println(square3(2))
}


