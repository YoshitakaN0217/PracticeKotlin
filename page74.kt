/**
 * 著書「Kotlinスタートブック」
 * 　第5章 P74~
 */

package practiceP74

fun main(args: Array<String>) {
    val list: List<Int> = listOf(1,2,3,4)
	println(sum(list))
    
	println(sumRec((1..12).toList()))
    println(sumRec2((1L..12).toList()))
}

// 再帰呼び出し：なし
fun sum(numbers: List<Int>): Int {
    var sum = 0
    for(n in numbers) {
        sum += n
    }
    return sum
}

// 再帰呼び出し：あり
fun sumRec(numbers: List<Int>): Int =
	if (numbers.isEmpty())
		0
	else
		numbers.first() + sum(numbers.drop(1))

// 再帰呼び出し：あり
// TCO(Tail Call Optimization)有効
tailrec fun sumRec2(numbers: List<Long>, accumulator: Long=0): Long =
	if (numbers.isEmpty())
		accumulator
	else
		sumRec2(numbers.drop(1), accumulator + numbers.first())


