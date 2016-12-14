/**
 * Created by alexa on 12/12/2016.
 */
fun main(args: Array<String>){
    val string: String = "Hello! GTFO"
    val number: Int = 9001
    val double: Double = 3.14
    val float: Float = 4.20f
    val bool: Boolean = true
    val long: Long = 1337L
    val array: IntArray = intArrayOf(1, 2, 3, 10)

    typechecker(string)
    typechecker(number)
    typechecker(double)
    typechecker(float)
    typechecker(bool)
    typechecker(long)
    typechecker(array)



//    unsafecast(30)
}

fun typechecker(obj: Any){

    when (obj) {
        is Int -> println("This Integer is over " + (obj-1))
        is String -> println("This is what my doormat  says: " + obj)
        is Double -> println("I'm so hungry I could eat a Double slice of $obj...  Get it?")
        is Float -> println("Float on this: " + obj)
        is Boolean -> println("We need to get this done. " + obj)
        is Long -> println("Long time h4cker $obj has logged on")
        is IntArray -> println("Can you count to 10? " + obj.asList())
        }

    if(obj !is String){
        var x = obj
        if(obj is IntArray){
            x = obj.asList()
        }
        return println("This '$x' is not a string" )
    }
}

fun unsafecast(obj: Any){
    val output: String = obj as String
    println("String:" + output)
    val output2: Int = obj as Int
    println("Int:" + output2)
}