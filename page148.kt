/**
 * 著書「Kotlinスタートブック」
 * 　第10章 P148~
 */

package practiceP148

fun main(args: Array<String>) {
}

// インターフェースの継承
interface Foo {
    fun aaa()
    fun bbb()
}
interface Bar: Foo {
    override fun aaa() {}
    fun ccc()
}
class Baz: Bar {
    override fun bbb() {}
    override fun ccc() {}
}