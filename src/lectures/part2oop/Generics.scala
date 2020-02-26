package lectures.part2oop

import lectures.part2oop.AbstractDataTypes.Animal

object Generics extends App{
  class MyList[A]{
    def add [B>:A](element: A): MyList[B] = ???
  }

  val listOfIntegers = new MyList[Int]
  val listOfStrings = new MyList[String]
  object MyList {
    def empty[A]: MyList[A] = ???
  }

  val emptyListOfIntegers = MyList.empty[Int]

  class Animal
  class Cat extends Animal
  class Dog extends Animal

  // List[Cat] extends List [Animal] => covariance

  class CovariantList[+A]
  val animal: Animal = new Cat
  val animalList: CovariantList[Animal]= new CovariantList[Cat]

  // Invariance:

  class InvariantList[A]
  // marche pas: val invariantAnimalList: InvariantList[Animal] = new InvariantList[Cat]

  //Contravariance

  class Trainer[-A]
  val contravariantList: Trainer[Cat] = new Trainer[Animal]

  //bounded types
  class Cage[A <: Animal](animal: A) //subtypes of Animal

  val cage = new Cage(new Dog)


}
