/**
 * 著書「Kotlinスタートブック」
 * 　第4章 P41~
 */
fun main(args: Array<String>) {
 
    // 型いろいろ
    val double: Double = 0.0	// 64bit
    val fload: Float = 0F		// 32bit
    val long: Long = 0			// 64bit
    val int: Int = 0			// 32bit
    val short: Short = 0		// 16bit
    val byte: Byte = 0			// 8bit
    val boolean: Boolean = true
    val char: Char = 'c'	// ""は使用不可
    val string: String = "hello \nworld"
    
    // 浮動小数点
    val double2: Double = 123.4e2
    println("double2:${double2}")
    val double3: Double = 123.4e-1
    println("double3:${double3}")

    // 進数
    // 8進数はサポートされてない
    val num0 = 0xFF
    println("num0:${num0}")
    val num1 = 0b1010
    println("num1:${num1}")

    val check = 5 == 0
    println("check:${check}")
    
    // 暗黙の型変換は存在しないが、演算子オーバーロードによって実現されている
    val int: Int = 123
	//val long: Long = int	// error!
}