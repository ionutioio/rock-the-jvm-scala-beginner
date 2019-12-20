package lectures.part1basics

object Expressions extends App {
  val x = 1 +2 //EXPRESSION
  println(x)

  val someValue = {
    2<3
  }

  val someOtherValue = {
    if(someValue) 239 else 906
    42
  }
  println(someOtherValue)

  def aFunction1(name: String, age: Int) :  Unit = {
  println("Hello, my name is "+name+" and I am "+age+" years old")
  }
  aFunction1("toto", 42)

  def aFunction2(number: Int) : Int = {
    if (number ==1) number else number*aFunction2(number-1)
  }
  println(aFunction2(5))

  def fib (n: Int): Int = {
    if(n <=1) 1
    else if(n==2) 1
    else fib(n-1) + fib(n-2)
  }
  println (fib(6))
  def isPrime(n: Int) : Boolean = {
    
  }
}
