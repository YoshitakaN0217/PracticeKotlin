/**
 * 著書「Kotlinスタートブック」
 * 　第4章 P61~
 */
fun main(args: Array<String>) {

	var count = 3
   	while(count-- > 0){
       println("Hello")
   	}
    
    do {
        println("Hello!!")
        // Math.random()は0.0~1.0を返す
        val next = Math.random() < 0.5
    } while(next)

    // forループ
    for (x in arrayOf(1,2,3)) {
        println(x)
    }
    
    val names = listOf("foo", "bar", "baz")
    for (name in names) {
        println(name)
    }
    
    for (i in 0 until 10 step 2){	// 0<=10
//    for (i in 0..10 step 2){		// 0<10
        println(i)
    }
}




