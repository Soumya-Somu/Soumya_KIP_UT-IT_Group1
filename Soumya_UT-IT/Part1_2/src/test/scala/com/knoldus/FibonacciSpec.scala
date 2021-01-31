package com.knoldus

import com.knoldus.Fibonacci
import org.scalatest.flatspec.AnyFlatSpec

class FibonacciSpec extends AnyFlatSpec{

  //Testcase for checking the correct output of Fibonacci

  "Fibonacci" should "send success when the series is correct" in{
    val result:Array[Int]=Array(1,1,2,3,5)
    val res=Fibonacci.fibonacci(5)
    assert(result.sameElements(res))
  }

  // Testcase for catching exception when a negative number is given as input

  "Fibonacci" should "fail when invalid input is given" in{
    val caught =
      intercept[NegativeArraySizeException] {
        Fibonacci.fibonacci(-1)
      }
    assert(caught.getMessage.indexOf("-1") != -1)
  }
}