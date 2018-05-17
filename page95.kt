/**
 * 著書「Kotlinスタートブック」
 * 　第6章 P95~
 */

package practiceP95

fun main(args: Array<String>) {
    
//	println(containsDigit("eefwev2dd"))
	println(containsDigit2("eefwev2dd"))
    
}

inline fun forEach(str: String, f: (Char) -> Unit) {
    for (c in str) {
    	f(c)
	}
}

// 非ローカルリターン
fun containsDigit(str: String): Boolean {
    forEach(str) {
        if (it.isDigit())
        	return true
    }
    return false
}
// ラベルへのリターン
fun containsDigit2(str: String): Boolean {
    var result = false
    forEach(str) here@ {
        if (it.isDigit()) {
        	result = true
        	return@here
        }
    }
    return result
}
// 関数名を指定したリターン
fun containsDigit3(str: String): Boolean {
    var result = false
    forEach(str) {
        if (it.isDigit()) {
        	result = true
        	return@forEach
        }
    }
    return result
}