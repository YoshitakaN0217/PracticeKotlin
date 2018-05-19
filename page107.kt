
/**
 * 著書「Kotlinスタートブック」
 * 　第6章 P107~
 */

package practiceP107

interface Bucket {
    // overrideを強制(C++の純粋仮想関数みたいな感じ)
    fun fill()
    fun drainAway()
    fun pourTo(that: Bucket)

    // プロパティ
    val capacity: Int		// 容量
    var quantity: Int		// 現在の水量
}

fun main(args: Array<String>) {

    var bucket1 = createBucket(7)
    var bucket2 = createBucket(4)

    bucket1.fill()
    // バケツ1からバケツ2へ注ぐ
    bucket1.pourTo(bucket2)
    
    println(bucket1.quantity)
    println(bucket2.quantity)
}
fun createBucket(_capacity: Int): Bucket = object: Bucket {
    // プロラティにもoverrideを付ける
	override val capacity = _capacity
    override var quantity = 0

    // バケツを水で満たす
    override fun fill() {
        quantity = capacity
	}
    // 排水する
    override fun drainAway() {
		quantity = 0
    }

    // 他のバケツに注ぐ
    override fun pourTo(that: Bucket) {
    	val thatVacuity = that.capacity - that.quantity
        if (capacity <= thatVacuity) {
            that.quantity += quantity
            drainAway()
        }else{
            that.fill()
            quantity -= thatVacuity
        }
    }
    
}