/**
 * 著書「Kotlinスタートブック」
 * 　第8章 P113~
 */

package practiceP113


fun main(args: Array<String>) {
    val myClass: MyClass = MyClass()
    println(myClass)	// practiceP113.MyClass@28a418fc
    
    val greeter = Greeter()
    greeter.greet("Taro")
    
    val hanako = Person()
    println(hanako.name)
    println(hanako.age)
    
    hanako.name = "花子"
    hanako.age = 25
    println(hanako.name)
    println(hanako.age)
    println(hanako.nameLength)
}

// 引数を取らないコンストラクタを持っている(自動的に生成される)
class MyClass

// メソッド
class Greeter {
    fun greet(name: String) {
        println("Hello $name!")
    }
}

// プロパティ
class Person {
    var name: String = ""
    	set(value) {	// カスタムセッター
            println("${value}が設定されました")
            field = value	// fieldはバッキングフィールドの暗黙の変数名
        }
    var age: Int = 0
    
    // ■バッキングフィールド
    // プロパティには自動的にバッキングフィールドが生成される
    // プロパティの値はバッキングフィールドは保存される

    // カスタムゲッター(バッキングフィールドを持たない)
    val nameLength: Int
    	get(): Int {
//            return this.name.length
            return name.length            // this　自分自身
        }
}

// 遅い初期化
class MyClass2 {
    lateinit var foo: String
//    lateinit val foo2: String		// error:valには使用不可

	// lateinitで初期化前の変数を参照すると例外エラー
}