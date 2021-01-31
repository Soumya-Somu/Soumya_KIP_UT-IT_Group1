package com.knoldus

import org.scalatest.flatspec.AnyFlatSpec

class EMailValidationSpec extends AnyFlatSpec
{

  // Checking for a correct alphanumeric email

  "EmailValidationSpec" should "send success if email has alphanumeric username in lowercase or uppercase" in {
    val result: Boolean = EMailValidation.validEmail("firstname.lastname123@knoldus.com")
    assert(result==true)
  }

  // Checking for an invalid email with an invalid domain name

  "EmailValidationSpec" should "fail for invalid email" in {
    val result : Boolean=EMailValidation.validEmail("dummy.id@organisation.test")
    assert(result==false)
  }
}