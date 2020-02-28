package exercises

abstract class MyListGeneirc[+A] {

  def head: A
  def tail: MyListGeneirc[A]
  def isEmpty: Boolean
  def add[B>: A](element: B): MyListGeneirc[B]
  override def toString:  String = "[ "+printElements+"]"
  def printElements: String
  def map(myTransformer: MyTransformer[T,A]) : MyListGeneirc[A]
  def filter[B>:A](myPredicate: MyPredicate[B]) : MyListGeneirc[B]

}

object Empty extends MyListGeneirc[Nothing]{
  override def head: Nothing = throw new NoSuchElementException

  override def tail: MyListGeneirc[Nothing] = throw new NoSuchElementException

  override def isEmpty: Boolean = true

  override def add[B>: Nothing](element: B): MyListGeneirc[B] = new Cons(element, Empty)

  override def printElements = ""
}

class Cons[+A](h: A, t:MyListGeneirc[A]) extends MyListGeneirc[A]{
  override def head: A = h

  override def tail: MyListGeneirc[A] = t

  override def isEmpty: Boolean = false

  override def add[B>: A](element: B): MyListGeneirc[B] = new Cons(element, this)

  override def printElements = s"${h} ${t.printElements}"
}

trait MyPredicate[T]{

}
trait MyTransformer[A,B]{

}

object ListTest extends App {
  val list = new Cons[Int](1, new Cons(2, new Cons(3,Empty)))
  println(list.toString)
}