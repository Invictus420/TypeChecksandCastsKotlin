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
