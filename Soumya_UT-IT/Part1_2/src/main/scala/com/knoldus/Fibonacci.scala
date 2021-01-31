package com.knoldus


import scala.io.StdIn._

object Fibonacci {
  def fibonacci(num: Int): Array[Int] = // Function for generating fibonacci series
  {
    var ar: Array[Int] = new Array[Int](num)
    var temp = 0

    for (i <- 0 to num - 1; if (num > 0)) {
      if (i < 2) { // Providing value for first 2 elements
        ar(i) = 1
        temp = ar(i)
      } else {
        ar(i) = ar(i - 1) + temp // Generating the elements of series
        temp = ar(i - 1)
      }
    }
    ar
  }

  def main(args: Array[String]) {
    print("Enter range for series : ")
    val a = readInt() // User enters number of the elements to be generated in the fibonacci series
    var ar = fibonacci(a)
    ar.foreach(x => print(x + ", "))
  }
}
