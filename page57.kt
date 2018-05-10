/**
 * 著書「Kotlinスタートブック」
 * 　第4章 P57~
 */
fun main(args: Array<String>) {
 
    if (true)
    	println("Hello")
    
    if (5 in 0..10){
    	println("abc")
        println("dee")
    }
    
// C言語のように0・非0かで評価されるのではなく、Booleanでないとエラーになる    
//    if (1+2+3)
//    	println("eee")

    
    val score = 50
    if (score >= 60) {
        println("合格")
    }else{
        println("不合格")
    }
    // 三項演算子は無いがif文で書ける
    val message = if (score >= 60) "合格" else "不合格"
    println(message)
    
    val x = if (true) {
        1
        2
    }else{
        3
        4
    }
    println(x)
    
    // switch文はない
    val str = when (x) {
        1 -> "one"
        2,3 -> "two or three"
        else -> {
            "unknown"
        }
    }
    println(str)
    
//    val blank = when(x) {
//        is String -> x.isBlank()
//        else -> true
//    }
//    println(blank)
}



