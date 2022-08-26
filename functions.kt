//FUNCTIONS
//Creating and Calling a Function
// Write your code below
fun smores() {
println("Roast a marshmallow.")
println("Place marshmallow on a graham cracker.")
println("Place chocolate on marshmallow.")
println("Put a new graham cracker on chocolate.")
println("Enjoy!")
}


fun main() {
  // Write more code below
  smores()
  smores()
}

//Arguments
// Write your code below
fun getSpeed(distance: Int, time: Int) {
  var speed = distance / time
  println("$speed meters per second")
}


fun main() {
  // Write more code below
  getSpeed(10, 3)
  
}

//Named and Default Arguments
// Write your code below
fun getPrice(price: Double, couponCode: String = "None") {
  var finalPrice: Double
  if (couponCode == "save15") {
    finalPrice = price * .85
  } else {
    finalPrice = price
  }
  println("The total price is $finalPrice.")
}


fun main() {
  // Write more code below
  getPrice(price = 48.0, couponCode = "save15")
  getPrice(48.0)
}

//Return Statements
// Write your code below
fun ozToTsp(oz: Double): Double {
  var tsp = oz * 6
  return tsp 
}


fun main() {
  // Write more code below
  var tspNeeded = ozToTsp(.75)
  println("You will need $tspNeeded tsp of vanilla extract for this recipe.")
  
}

//Single Expression Functions
// Write your code below
fun pyramidVolume(l: Int, w: Int, h: Int) = (l * w * h) / 3



fun main() {
  var length = 5
  var width = 8
  var height = 14
  
  // Write more code below
  var volume = pyramidVolume(length, width, height)
  println("The volume of this pyramid is $volume.")
  
}

//Function Literals
fun main() {
  // Write your code below
  
  // anonymous function 
  val product = { num1: Int, num2: Int -> num1 * num2 }
 
println(product(10, 5))

}

//Review
// Write your code below
fun main() {
  // Write your code below
  
  // anonymous function 
  var name = fun(first: String, last: String): String {
    return (first + last)
  println(name("Carlo", "Aranas"))
  }

}


