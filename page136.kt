/**
 * 著書「Kotlinスタートブック」
 * 　第8章 P136~
 */

package practiceP136
import practiceP121.Rational
import practiceP121.Rational2 as RationalDefault    // インポートしつつ別名をつける

fun main(args: Array<String>) {
    // 異なるパッケージであれば同盟クラスを定義できる
    // 利用する場合は完全修飾名を書くか、importを記述
    // 
    val greeter = practiceP134.EnglishGreeter("Kotlin")
    greeter.sayHello()

    val student = practiceP127.Student("くみ", 11002)
    student.introductionMySelf()


    val half = Rational(1,2)
    println(half.numerator)
    println(half.denominator)
    
    val half2 = RationalDefault(3,10)
    println(half2.numerator)
    println(half2.denominator)
    
    // ■可視性
    // トップレベルの可視性(パッケージ直下)
    //   public:どこからでもアクセス可
    //   internal:同一モジュール内のみ全公開　→　同一のコンパイル単位、モジュール、プロジェクト
    //   private:同一ファイル内のみアクセス可
    //
    // クラス、メンバの可視性
    //   public:どこからでもアクセス可
    //   internal:同一モジュール内のみ全公開　→　同一のコンパイル単位、モジュール、プロジェクト
    //   protected:同一クラス、サブクラス内からアクセス可
    //   private:同一ファイル内のみアクセス可
    //   
    //   
}


open class Foo {
    private fun privateMethod() {}
    protected fun protectedMethod() {}
}

class Bar: Foo() {
    fun execute() {
//        privateMethod()   // コンパイルエラー
        protectedMethod()   // OK
    }
}
class Baz {
    fun execute(foo: Foo) {
//        foo.protectedMethod()  // コンパイルエラー
    }
}