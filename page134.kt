/**
 * 著書「Kotlinスタートブック」
 * 　第8章 P134~
 */

package practiceP134


fun main(args: Array<String>) {
	EnglishGreeter("Kotlin").sayHello()
	JapaneseGreeter("Java").sayHello()
}

// 抽象クラス
// ・sayHello()をオーバーライドしないとコンパイルエラー
// ・継承されることが前提なのでopenは不要
abstract class Greeter(val target: String) {
    abstract fun sayHello()
}

class EnglishGreeter(target: String): Greeter(target) {
    override fun sayHello() {
        println("Heloo, $target!")
    }
}
class JapaneseGreeter(target: String): Greeter(target) {
    override fun sayHello() {
        println("こんにちは, $target!")
    }
}