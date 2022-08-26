//CLASSES
//Creating a Class
class Book {
  val pages = 320
  val title = "Harry Potter and the Sorcerer's Stone"
  val author = "J.K. Rowling"
}

// Write your code above 📕

fun main() {
  
}

//Creating an Instance
class Building {
  val yearBuilt = 2016
  val height = 400 // Feet
  val type = "Limestone"
}

fun main() {
  // Write your code below 🏙
  var residentialBuilding = Building()
  println(residentialBuilding.yearBuilt)
  println(residentialBuilding.height)
  println(residentialBuilding.type)

  var commercialBuilding = Building()
  println(commercialBuilding.yearBuilt)
  println(commercialBuilding.height)
  println(commercialBuilding.type)
}

//Primary Constructor
// Write your class below 
class Person(val name: String, val age: Int, val favoriteColor: String)


fun main() {
  // Create your instances below 
  var me = Person("Carlo", 21, "Pink")
  var myFriend = Person("Jose", 20, "Black")

  println("${me.name} is ${me.age} years old and his favorite color is ${me.favoriteColor}.")
   println("${myFriend.name} is ${myFriend.age} years old and his favorite color is ${myFriend.favoriteColor}.")
}

//The Init Block
class Employee(val firstName: String, val lastName: String, val yearsWorked: Int) {
  // Write your code below 
  val fullName = "$firstName $lastName"

  init {
    if (yearsWorked > 1) {
      println("$fullName is eligible for a raise!")
    } else {
      println("$fullName is not eligible for a raise just yet.")
    } 
  }
} 

fun main() {
  // Create an instance below 👩🏻‍💼
  val projectManager = Employee("Maria", "Gonzalez", 2)
}

//Member Functions
class Dog(val name: String, val breed: String, val competitionsParticipated: List<String>) {
  
  init {
    for (comp in competitionsParticipated) {
      println("$name participated in $comp.")
    }
  }

  // Write your function below 
  fun speak() {
   println("$name says: Woof!")
  }
}

fun main() {
  // Write your instance below 🐩
  var maxie = Dog("Maxie", "Poodle", listOf("Westminster Kennel Club Dog Show", "AKC National Championship"))
  maxie.speak()

}

//Review
class Congratulations(val name: String) {

  init {
    println("Dear $name,")
  }

  fun message() {
    println("Thank you for embarking on this journey with me. I couldn't have gotten through the treacherous waters of Conditional Creek or hiked up the Looping mountains without your help. You now have the fundamental knowledge to go on and continue your Kotlin journey in the world of android application, web development or more. The world is yours. Good luck! ")
  }

  fun signOut() {
    println("With ♥️ , Codey and the Codecademy Team.")
  }
} 

fun main() {
  println("Please enter your name...")
  var learnerName = readLine()
  var toLearner = Congratulations(learnerName.toString())
  toLearner.message()
  toLearner.signOut()
}
