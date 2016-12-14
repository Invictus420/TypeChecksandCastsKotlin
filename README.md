# TypeChecksandCastsKotlin

In kotlin you can use the 'is' operator to determine the specific datatype of an object.

```kotlin
if(obj !is String){
        var x = obj
        if(obj is IntArray){
            x = obj.asList()
        }
        return println("This '$x' is not a string" )
    }
```

In the above example we are checking whether or not the given obj is not a string. We also check whether or not the obj is an IntArray, simply to make sure it would print properly. In the end we return the result with a message.

##Smart Casts

In kotlin you don't always have to use explicit cast operators, because the compiler checks the is and checks for immutable values and automatically casts. This can also be used for when and while loops.

```kotlin
when (obj) {
        is Int -> println("This Integer is over " + (obj-1))
        is String -> println("This is what my doormat  says: " + obj)
        is Double -> println("I'm so hungry I could eat a Double slice of $obj...  Get it?")
        is Float -> println("Float on this: " + obj)
        is Boolean -> println("We need to get this done. " + obj)
        is Long -> println("Long time h4cker $obj has logged on")
        is IntArray -> println("Can you count to 10? " + obj.asList())
        }
```

In the above example we check for whether our object is any of the basic datatypes and to act accordingly.

Note that smart casts do not work when the compiler cannot guarantee that the variable cannot change between the check and the usage. More specifically, smart casts are applicable according to the following rules:

val local variables - always;
val properties - if the property is private or internal or the check is performed in the same module where the property is declared. Smart casts aren't applicable to open properties or properties that have custom getters;
var local variables - if the variable is not modified between the check and the usage and is not captured in a lambda that modifies it;
var properties - never (because the variable can be modified at any time by other code).
