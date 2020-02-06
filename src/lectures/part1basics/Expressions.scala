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
    else fib(n-1) + fib(n-2)
  }
  println (fib(6))

  def isPrime(n: Int) : Boolean = {
    def isPrimeUntil(t: Int) : Boolean = {
      if(t<=1) true
      else n%t != 0 && isPrimeUntil(t-1)
    }
    isPrimeUntil(n/2)
  }

  println(isPrime(6))

  def stringConcat(s: String, n: Int): String ={
    def concatHelper(n: Int, acc: String): String ={
      if(n<=0) acc
      else concatHelper(n-1, acc+s)
    }
    concatHelper(n, "")
  }
  println (stringConcat("Titi", 5))


  def isPrimeRec(n: Int): Boolean = {
    def isPrimeTailRec(t: Int, isStillPrime: Boolean): Boolean ={
      if(! isStillPrime) false
      else if(t<= 1) true
      else isPrimeTailRec(t-1, n%t != 0 && isStillPrime)

    }
    isPrimeTailRec(n/2, true)
  }

  println(isPrimeRec(6))

  def fibRec(n: Int): Int ={
    def fibTailRec(t: Int, last: Int, prev: Int): Int = {
      if (t >= n) last
      else fibTailRec(t + 1, last + prev, last)
    }
    if(n<=1) 1
    else fibTailRec(2, 1, 1)
  }
  println (fibRec(8))
}

