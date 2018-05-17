/**
 * 著書「Kotlinスタートブック」
 * 　第6章 P99~
 */

package practiceP99

interface Bucket {
//    fun fill()
//    fun drainAway()
//    fun pourTo(that: Bucket)
    
//    fun getCapacity(): Int
//    fun getQuantity(): Int
//    fun setQuantity(quantity: Int): Int
    
}


fun main(args: Array<String>) {
    
	val bucket = object: Bucket {
        // バケツの容量
        val capacity: Int = 5
        // バケツの入っている水の量
        var quantity: Int = 0
        
        // バケツを水で満たす
        fun fill() {
            quantity = capacity
        }
        // 排水する
        fun drainAway() {
            quantity = 0
        }
        // 入っている水の量を出力する
        fun printQuantity() {
            println(quantity)
        }
        // 他のバケツに注ぐ
        fun pourTo(that: Bucket) {
            //TODO:未実装
        }
    }

    bucket.printQuantity()	// 0
    bucket.fill()
    bucket.printQuantity()	// 5
    bucket.drainAway()
    bucket.printQuantity()	// 0


}