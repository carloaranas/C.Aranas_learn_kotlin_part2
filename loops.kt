//LOOPS
//for Loop
fun main() {
  // Write your code below
  for(i in 1..5) {
    println("Hello, Codey!")
    println("i = $i")
  }
}

//Controlling the Iteration
fun main() {
  println("-- 1st for loop output --")
  // Write your code below
  for(i in 10 downTo 1) {
    println("i= $i")
  }
  println("\n-- 2nd for loop output --")
  // Write your code below
  for(j in 1 until 10) {
    println("j = $j")
  }
  println("\n-- 3rd for loop output --")
  // Write your code below
  for(k in 1..10 step 2) {
    println("k = $k")
  }
}

//Iterating Through Collections
fun main() {
  val mySchedule = listOf("Eat Breakfast", "Clean Up", "Work", "Eat Lunch",  "Clean Up", "Work", "Eat Dinner", "Clean Up")
 
  val myTasks = setOf("Eat Breakfast", "Clean Up", "Work", "Eat Lunch",  "Clean Up", "Work", "Eat Dinner", "Clean Up")

  println("-- mySchedule Output --")
  // Write your code below
  for (task in mySchedule) {
    println(task)
  }
  println("\n-- myTasks Output --")
  // Write your code below
  for ((taskIndex, task) in myTasks.withIndex()) {
  println("$taskIndex: $task")
  }
}

//Iterating Through Maps
fun main() {
  val favoriteColors = mapOf("Jesse" to "Violet", "Megan" to "Red", "Tamala" to "Blue", "Jordan" to "Pink")
  
  println("\n-- Key: Value Output --")
  // Write your code below
  for (favoriteEntry in favoriteColors) {
    println("${favoriteEntry.key}: ${favoriteEntry.value}")
  }
  println("\n-- Only Values Output --")
  // Write your code below
  for (color in favoriteColors.values) {
    println(color)
  }
}

//while Loop
fun main() {
  var counter = 0
  var index = 0
  val schoolGrades = listOf("Kindergarten", "1st", "2nd", "3rd", "4th", "5th", "6th", "7th")

  println("-- counter Output --")
  // Write your code below
  while(counter < 5) {
    println(counter)
    counter += 1
  }
  println("\n-- Elementary School Grades --")
  // Write your code below
  while(schoolGrades[index] != "6th") {
    println(schoolGrades[index])
    index ++
  }
}

//do..while Loop
fun main() {
  var index = 0
  val celsiusTemps = listOf(0.0, 87.0, 16.0, 33.0, 100.0, 65.0)
  val fahr_ratio = 1.8
  var fahr: Double

  println("-- Celsius to Fahrenheit --")
  // Write your code below
  do {
    fahr = celsiusTemps[index] * fahr_ratio + 32.0
    println("${celsiusTemps[index]}C = ${fahr}F")
    index ++
  } while (fahr != 212.0)
}

//Nested Loops
fun main() {
  // Write your code below
  for (i in 1..6){
    for(j in 'A'..'F') {
      print("$j$i ")
    }
    println()
  }
}

//Jump Expressions
fun main() {
  val rooms = listOf("Kitchen", "Living Room", "Basement", "Bathroom")

  println("-- Room Search --")
  for (room in rooms) {
    print("$room: ")
    // Write your code below
    if (room == "Living Room"){
      println("Found It!")
      break
    }
    println("Found Nothing.")
  }

  println("\n-- Divide By Zero --")
  for (number in 12 downTo -12 step 4) {
    // Write your code below
    if (number == 0) {
      continue
    }
    println("120/number = ${120/number}")
  }
}

//Labeled Jump Expressions
fun main() {
  // Write your code below
  grid@ for (i in 1..6) {
    for (j in 'A'..'F') {
      // Write your code below
      if (j == 'C') {
        continue@grid
      }
      print("$j$i ")
    }
    println()
  }
}
