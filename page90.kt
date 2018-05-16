/**
 * 著書「Kotlinスタートブック」
 * 　第6章 P90~
 */

package practiceP90

fun main(args: Array<String>) {
	val counter1 = getCounter()
    val counter2 = getCounter()
    
    println(counter1())		// 0
    println(counter1())		// 1
    println(counter2())		// 0
    println(counter1())		// 2
    println(counter2())		// 1
    
    log() { "このメッセージは出力される" }
    log(false) { "このメッセージは出力されない" }
}

// クロージャ
fun getCounter(): ()->Int {
    var count = 0
    return {
        count ++
    }
}
// インライン関数
inline fun log(debug: Boolean=true, message: () -> String) {
    if (debug)
    	println(message())
}

/*
fun foo(): Int {
    val a = 1
    val b = 2
    return a + b
}
fun bar(): Int {
    val c = 3
    return a + b + c	// スコープの問題でエラー
}
*/

