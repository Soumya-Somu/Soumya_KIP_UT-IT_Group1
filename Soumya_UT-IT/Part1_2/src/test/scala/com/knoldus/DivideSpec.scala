package com.knoldus

import com.knoldus.Division
import org.scalatest.flatspec.AnyFlatSpec

class DivideSpec extends AnyFlatSpec {

  // Testcase for exception of divide by 0

  "dividespec" should "throw an error when divided by 0" in{
    val result=Division.divideIntegers(1,0)   // Checking for divide by 0 exception
    assert(result=="not defined")
  }

  // Testcase for checking correct division output

  "dividespec" should "send success for division of integers" in{
    val result=Division.divideIntegers(10,2)    // Checking for correct output
    assert(result==5)
  }
}
