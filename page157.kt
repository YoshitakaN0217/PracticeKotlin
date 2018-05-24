/**
 * 著書「Kotlinスタートブック」
 * 　第10章 P157~
 */

package practiceP157

fun main(args: Array<String>) {
    val intContainer = Container(123)
    val i: Int = intContainer.value as Int	// 使用する時はダウンキャストして使う
//    val s: String = intContainer.value as String	// 例外を投げる
    println(i)
    
    var intContainerGenerics: ContainerGenerics<Int> = ContainerGenerics<Int>(456)
    val i2 = intContainerGenerics.value
    println(i2)
    
    var intContainerGenerics2 = ContainerGenerics("Hello")
    val i3 = intContainerGenerics2.value
    println(i3.toUpperCase())
    
    
    val container: ContainerGenerics<Int> = box(5)
    println(container.value.string)
}
// 全ての方はAnyのサブタイプ
class Container(var value : Any)

// ジェネリクス
class ContainerGenerics<T>(var value: T)
// ジェネリクス関数
fun <T> box(value: T): ContainerGenerics<T> =
	ContainerGenerics(value)
// ジェネリクスプロパティ
val <T> T.string: String
	get() = toString()

