/**
 * 著書「Kotlinスタートブック」
 * 　第4章 P63~
 */
fun main(args: Array<String>) {
    for (item in MyIterable()) {
        println(item)
    }
    
    val names = listOf("foo", "bar", "baz")
    var barIndex = -1
    println(names.indices)	// indicesはIndexの複数形。IntRangeオブジェクト
    for (index in names.indices) {
        if (names[index] == "bar") {
            barIndex = index
            break
        }
    }
    println("ヒットしたindexは${barIndex}")
}

class MyIterator {
    operator fun hasNext(): Boolean = Math.random() < 0.5
    operator fun next(): String = "Hello"
}

class MyIterable {
    operator fun iterator() = MyIterator()
}