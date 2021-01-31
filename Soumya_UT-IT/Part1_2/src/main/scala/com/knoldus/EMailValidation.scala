package com.knoldus

import scala.util.matching.Regex
import scala.io.StdIn._

object EMailValidation {

  def validEmail(email: String): Boolean = {
    val pattern = new Regex("^([a-zA-Z\\d\\.-]+)@([a-zA-Z\\d-]+)\\.(com|net|org)$") // Obtaining the required email format in pattern variable
    val store = (pattern.findAllIn(email)).mkString("") // Storing the pattern of the mail
    if (store == email) // Checking whether the email entered is valid or not
      true
    else {
      false
    }
  }

  def main(args: Array[String]): Unit = {
    println("Please enter your mail id")
    val email = readLine() // User input for email
    if (validEmail(email)) { // Checking if email is valid
      println("This is a valid email id")
    }
    else {
      println("This is an incorrect email id. Please try again.")
    }
  }
}