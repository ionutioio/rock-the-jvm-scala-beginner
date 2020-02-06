package lectures.part2oop

object OOBasics extends App{

  val person = new Person("John", 26)
  println(person.age)

}

class Person(name: String, val age: Int) {
  //body

}

class Writer(firstName: String, lastName: String, yob: Int){
  def fullName() = s"@firstName @lastName"
}

//class params are NOT fields.