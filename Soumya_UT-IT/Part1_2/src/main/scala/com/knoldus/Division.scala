package com.knoldus

import scala.io.StdIn._

object Division {

  def main(args: Array[String]) {
    print("Enter the number you want to divide : ")
    val num1 = readInt() // First user input
    print("Enter the number you want to divide with : ")
    val num2 = readInt() // Second user input
    println("The result of the above division is : " + divideIntegers(num1, num2))
  }

  def divideIntegers(num1: Int, num2: Int) = // Exception handling for division by 0
  {
    try {
      num1 / num2
    }
    catch {
      case x: Exception =>
        println(x.getMessage)
        "not defined"
    }
  }
}