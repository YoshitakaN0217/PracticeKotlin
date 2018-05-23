/**
 * 著書「Kotlinスタートブック」
 * 　第10章 P150~
 */

package practiceP150

fun main(args: Array<String>) {
	val greeter = JapaneseGreeterWithRecording()
    greeter.sayHello("田中")
}



interface Greeter {
    fun sayHello(target: String = "匿名")
}
open class JapaneseGreeter : Greeter {
    override fun sayHello(target: String) {
        println("こんにちは, ${target}さん!")
    }
}
class JapaneseGreeterWithRecording: JapaneseGreeter() {
    private val _targets: MutableSet<String> = mutableSetOf()
	val targets: Set<String>
    	get() = _targets
    
    override fun sayHello(target: String) {
        _targets += target
        super.sayHello(target)
    }
}

