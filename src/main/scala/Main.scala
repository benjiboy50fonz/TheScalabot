import scala.math
import scala.collection.mutable.ArrayBuffer

@main def hello: Unit = 
  println("Hello world!")
  println(answer.distinct)
  test
  abs() // Still need () regardless of if the argument is default or not.
  println(sum(1,2,3,4,5))

  val nums = new Array[Int](10) // Array full of integers, 10 cells long, all zero. Strings are all null when they begin.
  println(nums.length)

  nums(9) = 10

  // ArrayBuffer is like ArrayList
  val b = ArrayBuffer[Int](10, 69)
  b += (-420, 0) // Wow this is cool. Adds to the end.
  println(b(2))
  b ++= Array(1,2,3) // Adds all elements of the array to the end.
  println(b) // 10, 69, -420, 0, 1, 2, 3
  b.insert(2, 100) // Inserts at index 2 (the new value takes the place of that index, pushing other stuff back).
  b.toArray // Returns an array of the elements in the buffer.

  val v = 0 until (b.length, 2) // This is a range.
  val res = for ( x <- v ) yield x * 2 
  println(res)

  val k = new Ok()
  k.increment
  println(k.current)   // The presence of parentheses depends on the definition of the function.


def abs(x: Double = -69.0) = { if (x < 0) -x else x
  println("done!: " + x)
}

def sum(nums: Int*): Any = {
  var result = 0
  for (num <- nums) result += num
 // You need to specify the type when creating parameters!
  return result
}

def test: Unit = 
  var s = x + x + 2 +   // This is a comment. The + tells it to go to the next line.
  3 * x
  var n = 10
  for ( i <- 0 until msg.length) {  // Note that it 'to' is upper-inclusive whereas 'until' is not!
  }
  for ( i <- 1 to 3; j <- 1 to 3) { // Note that it goes one at a time. When the first finishes, then the next increments and it goes again.
    // println((10 + i) + j + " ")
  }
  val V = for ( i <- 1 to 10) yield i * 10  // Creates a vector. Similar to: [x * 10 for x in range(1,11)]
  println(V)

def msg = "I was compiled by Scala 3. :)"

val answer: String = "good"
val x = 2

class Ok {
  private var x = 0
  def increment = { x += 1 }
  def current = x
}