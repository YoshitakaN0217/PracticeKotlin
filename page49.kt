/**
 * 著書「Kotlinスタートブック」
 * 　第4章 P49~
 */
fun main(args: Array<String>) {
 
    var string: String = "Kotlin"
    println("string${string[0]}")
    
    var name = "Taro"
    println("Hello ${name}")
  
    // raw String
    val str = """
  |abc
  def
  \n
""".trimMargin()	// trimMargin()で行頭を明示
    println(str)

	var ints = arrayOfNulls<Int>(5)
    println("size:"+ints.size)
    val strs = arrayOf("one", "two", "three")
    println("${strs[0]}")
    
    
    // List
    // 		一般的な配列
//    val list: List<Int> = listOf<Int>(1,2,3)
    var list: MutableList<Int> = mutableListOf<Int>(1,2,3)
    println("list:${list}")
    list[2] = 101		// MutableListなら可能
    println("list[2]:${list[2]}")
    println("list size:${list.size}")

    // Set
    // 		重複データは存在しない
    // 		要素順を考慮しない → インデックスでのアクセス不可
    val sets: Set<Int> = setOf(1,2,1,4,5)
    println("set:${sets}")
//    println("set[2]:${sets[2]}")	// error
    println("set size:${sets.size}")
  
    // Map
    // 		キーと値のペア
//    val map: Map<String, Int> = mapOf("Kotlin" to 1, "Java" to 2)
    val map: MutableMap<String, Int> = mutableMapOf("Kotlin" to 1, "Java" to 2)
    println("map: ${map}")
    println("map size:${map.size}")
    map += "C++" to 3	// 追加
    println("map: ${map}")
    println("map size:${map.size}")
    println("map[Java]: ${map["Java"]}")

    
    // レンジ
	val range: IntRange = 12..15
    println("check 5:${5 in range}")
    println("check 5:${5 !in range}")
    println("list make pattern no1:${(1..5).toList()}")			// 昇順
    println("list make pattern no2:${(5 downTo 1).toList()}")	// 降順
    println("list make pattern no3:${(1..10 step 3).toList()}")
    println("list make pattern no3:${(20 downTo 1 step 3).toList()}")
}


