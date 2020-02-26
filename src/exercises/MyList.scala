package exercises

abstract class MyList {

  def head: Int
  def tail: MyList
  def isEmpty: Boolean
  def add(int: Int): MyList
  override def toString:  String = "[ "+printElements+"]"
  def printElements: String
}

object Empty extends MyList{
  override def head: Int = throw new NoSuchElementException

  override def tail: MyList = throw new NoSuchElementException

  override def isEmpty: Boolean = true

  override def add(int: Int): MyList = new Cons(int, Empty)

  override def printElements = ""
}

class Cons(h: Int, t:MyList) extends MyList{
  override def head: Int = h

  override def tail: MyList = t

  override def isEmpty: Boolean = false

  override def add(int: Int): MyList = new Cons(int, this)

  override def printElements = s"${h} ${t.printElements}"
}

object ListTest extends App {
  val list = new Cons(1, new Cons(2, new Cons(3,Empty)))
  println(list.toString)
}