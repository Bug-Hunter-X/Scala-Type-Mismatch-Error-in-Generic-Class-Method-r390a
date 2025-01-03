```scala
class MyClass[T](val value: T)(implicit num: Numeric[T]) {
  def myMethod(other: MyClass[T]): T = {
    num.plus(value, other.value)
  }
}

//Example Usage
val num1 = new MyClass[Int](10)
val num2 = new MyClass[Int](20)
println(num1.myMethod(num2)) // Output: 30

val str1 = new MyClass[String]("Hello")
val str2 = new MyClass[String]("World")
//This will cause a compilation error if you uncomment. Because String doesn't have Numeric instance.
// println(str1.myMethod(str2)) 
```