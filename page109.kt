/**
 * 著書「Kotlinスタートブック」
 * 　第6章 P109~
 */

package practiceP109

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

    var bucket1 = BucketImpl(7)
    var bucket2 = BucketImpl(4)

    bucket1.fill()
    // バケツ1からバケツ2へ注ぐ
    bucket1.pourTo(bucket2)
    
    println(bucket1.quantity)
    println(bucket2.quantity)
}


// クラス
class BucketImpl(_capacity: Int): Bucket {
    override val capacity = _capacity
    override var quantity = 0

    override fun fill() {
        quantity = capacity
	}
    override fun drainAway() {
		quantity = 0
    }

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

