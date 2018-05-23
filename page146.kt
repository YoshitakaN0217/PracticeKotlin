/**
 * 著書「Kotlinスタートブック」
 * 　第10章 P146~
 */

package practiceP146

fun main(args: Array<String>) {
    val foobar = FooBar()
    foobar.execute()	// FooBar
}

// Foo,Barどちらかは関係なくオーバーライドされているのでエラーにはならない
interface Foo {
    fun execute()
}
interface Bar {
    fun execute()
}
class FooBar: Foo, Bar {
    override fun execute() {
        println("FooBar")
    }
}

// スーパークラス（Superclass）でオーバーライドされているのでエラーにはならない
open class Superclass {
    open fun execute() {
        println("Superclass")
    }
}
class FooSuperclass: Superclass(), Foo

// 同一メソッドがありどちらを使用するのか曖昧なためエラーになる
interface Hoge {
    fun execute() {
        println("Hoge")
    }
}
interface Fuga {
    fun execute() {
        println("Fuga")
    }
}
//class HogeFuga: Hoge, Fuga		// エラーになる
class HogeFuga: Hoge, Fuga {
    override fun execute() {
        super<Hoge>.execute()		// どのインターフェースのメソッドをオーバーライドするか明示。エラーにはならない
    }
}


