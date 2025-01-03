```scala
class MyClass[T](val value: T) {
  def myMethod(other: MyClass[T]): T = {
    //Error: Type mismatch, expected: T, actual: Any
    value + other.value 
  }
}
```