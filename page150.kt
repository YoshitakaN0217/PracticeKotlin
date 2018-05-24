/**
 * 著書「Kotlinスタートブック」
 * 　第10章 P150~
 */

package practiceP150

fun main(args: Array<String>) {
    val greeter = JapaneseGreeterWithRecording()
    greeter.sayHello("田中")
    greeter.sayHello()
    println(greeter.targets)
    
    val japanese = JapaneseGreeter()
    val greeter2 = GreeterWithRecording(japanese)
    greeter2.sayHello("伊藤")
    greeter2.sayHello()
    println(greeter2.targets)
}



interface Greeter {
    fun sayHello(target: String = "匿名")
    fun sayHello()
}
open class JapaneseGreeter : Greeter {
    override fun sayHello(target: String) {
        println("こんにちは, ${target}さん!")
    }
    override fun sayHello() {
        println("こんにちは, 匿名さん!")
    }
}
// 移譲(delegateion)
class JapaneseGreeterWithRecording: Greeter {
    private val greeter: Greeter = JapaneseGreeter()
    private val _targets: MutableSet<String> = mutableSetOf()
    
    val targets: Set<String>
        get() = _targets
    
    override fun sayHello() {
        greeter.sayHello()
    }
    override fun sayHello(target: String) {
        _targets += target
        greeter.sayHello(target)
    }
}
// クラスデリゲーション(class delegation)
class GreeterWithRecording(private val greeter: Greeter): Greeter by greeter {
    private val _targets: MutableSet<String> = mutableSetOf()
    
    val targets: Set<String>
        get() = _targets
    override fun sayHello(target: String) {
        _targets += target
        greeter.sayHello(target)
    }
}


