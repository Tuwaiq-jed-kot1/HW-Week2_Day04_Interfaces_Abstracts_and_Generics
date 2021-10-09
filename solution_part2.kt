
## Part II - Generics.
---
- Create a Generic Class example with different type variances


  class coash<T>(private var wish :T) where T:Wishing,T:Persons{
  fun printWishes(){
  println(wish.rollChar())
  println(wish.rollGuns())
  }
  }
  class Wishing(private var value :String): Persons{
  override fun rollChar():String{
  print("Your wished Person is: ")
  return "Legendary 5 Star"
  }
  fun rollGuns():String{
  print("Your wished Guns is: ")
  return "Epic 4 Star"
  }
  }
  interface Persons {
  fun rollChar():String
  }
  fun main() {
  val pity = coash (Wishing(value = "Common Item"))
  pity.printWishes()
  }
- Create three Generic Classes examples, one with `Where`, one with `Out` keyword, and the third with `In` keyword

  fun main() {
  }
  class Where<T>(){
  fun C(t:T):T{
  TODO()
  }
  }
  class Out<out T>(){
  fun B():T{
  TODO()
  }
  }
  class In<in T>(){
  fun A(t:T){
  TODO()
  }
  }
