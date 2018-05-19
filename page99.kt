
/**
 * 著書「Kotlinスタートブック」
 * 　第6章 P99~
 */

package practiceP99

//※まだ改良の余地はあるみたい
//Kotlinでgetter,setterはもっと簡単に実装できる

interface Bucket {
    // overrideを強制(C++の純粋仮想関数みたいな感じ)
    fun fill()
    fun drainAway()
    fun pourTo(that: Bucket)
    
    fun getCapacity(): Int
    fun getQuantity(): Int
    fun setQuantity(quantity: Int)
    
    //fun text()    overrideしていないのでコンパイルエラー
}

fun main(args: Array<String>) {

    var bucket1 = createBucket(7)
    var bucket2 = createBucket(4)

    bucket1.fill()
    // バケツ1からバケツ2へ注ぐ
    bucket1.pourTo(bucket2)
    
    println(bucket1.getQuantity())
    println(bucket2.getQuantity())
}
fun createBucket(capacity: Int): Bucket = object: Bucket {
    var _quantity: Int = 0    

    // バケツを水で満たす
    override fun fill() {
        setQuantity(getCapacity())
    }
    // 排水する
    override fun drainAway() {
        setQuantity(0)
    }

    // 他のバケツに注ぐ
    override fun pourTo(that: Bucket) {
        val thatVacuity = that.getCapacity() - that.getQuantity()
        if (getQuantity() <= thatVacuity) {
            that.setQuantity(that.getQuantity() + getQuantity())
            drainAway()
        }else{
            that.fill()
            setQuantity(getQuantity() - thatVacuity)
        }
    }

    override fun getCapacity(): Int = capacity
    override fun getQuantity(): Int = _quantity
    override fun setQuantity(quantity: Int) {
        _quantity = quantity
    }
}

