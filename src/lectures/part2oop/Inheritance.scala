package lectures.part2oop

object Inheritance extends App{

  class Animal {
    val creatureType = "wild"
    def eat  = println("nomnomnom")
  }

  class Cat extends Animal {
    def crunch={
      eat
      println("crunch crunch")
    }
  }

  val cat = new Cat
  cat.crunch

  class Person (name: String, age: Int) {
    def this(name: String) = this(name, 0)
  }
  class Adult (name: String, age: Int, idCard: String) extends Person(name)


  class Dog(override val creatureType: String) extends Animal  {
    //override val creatureType = "domestic"
    override def eat = println("crunch, crunch")
  }
  val dog = new Dog("domestic")
  dog.eat
  println(dog.creatureType)

  //typeSubstitution

  val unknownAnimal: Animal = new Dog("K9")
  unknownAnimal.eat

}
