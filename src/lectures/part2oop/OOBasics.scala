package lectures.part2oop

object OOBasics extends App{

  val person = new Person("John", 26)
  println(person.age)

}

class Person(name: String, val age: Int) {
  //body

}

class Writer(firstName: String, lastName: String, val yob: Int){
  def fullName() = s"@firstName @lastName"
  def +(string: String) = {
    new Writer(firstName.concat(string), lastName.concat(string), yob)
  }
  def unary_+(i: Int)= {
    new Writer(lastName, firstName, yob+1)
  }
}
class Novel(name: String, year: Int, author: Writer){
  def authorAge(): Int = year - this.author.yob

  def isWrittenBy(author: Writer) : Boolean = (this.author == author)
  def copy(year:Int): Novel = new Novel(this.name, year, this.author)
}

class Counter(val value: Int){
  def currentCount(): Int = value
  def inc() = new Counter (this.value +1)
  def dec() = new Counter(this.value-1)
  def inc(amount: Int) = new Counter(this.value+amount)
  def dec(amount: Int) = new Counter(this.value-amount)




}
//class params are NOT fields.