/**
 * 著書「Kotlinスタートブック」
 * 　第5章 P77~
 */

package practiceP77

fun main(args: Array<String>) {
    val list: List<Long> = listOf(1,2,3,4)
	println(sum(list))
    
    
}

fun sum(numbers: List<Long>): Long {
    tailrec fun go(numbers: List<Long>, accumulator: Long): Long =
		if (numbers.isEmpty())
			accumulator
		else
			go(numbers.drop(1), accumulator + numbers.first())
    
    return go(numbers, 0)
}

// 結果を返さない
class Counter {
    private var cnt = 0
    
    fun countUp(): Unit {
        cnt ++
    }
    fun getCount(): Int = cnt
}

