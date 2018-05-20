/**
 * 著書「Kotlinスタートブック」
 * 　第8章 P127~
 */

package practiceP127


fun main(args: Array<String>) {
    val person = Person("Miho")
    person.introductionMySelf()
    
    val student = Student("くみ", 11002)
//    println(student.id)
//    println(student.name)
    student.introductionMySelf()
    
    val person2: Person = Student("マイク", 11001)
    person2.introductionMySelf()

    // Anyクラの継承
    println(person2.toString())
    println(person2.hashCode())
    if (person == person2)
        println("同じ生徒です")
    else
        println("違う生徒です")
}

// 継承
// openをつけないとfinal(継承不可)
open class Person(open val name: String) {
    // メンバのオーバーライドもopenが必要
    open fun introductionMySelf() {
        println("I am $name.")
    }
}
// プロパティもオーバーライド可
class Student(override val name: String, val id: Long): Person(name) {
    override fun introductionMySelf() {
        println(super.introductionMySelf())
        println("I am $name(id:$id)")
    }
}