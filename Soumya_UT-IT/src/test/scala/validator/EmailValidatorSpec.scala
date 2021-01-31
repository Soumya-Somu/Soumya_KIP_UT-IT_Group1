package validator

import com.knoldus.validator.EmailValidator
import org.scalatest.flatspec.AnyFlatSpec

class EmailValidatorSpec extends AnyFlatSpec {

  "email id" should "send success for valid email" in {
    val email = (new EmailValidator).emailIdIsValid("alan.brooke@gmail.com")
    assert(email == true)
  }

  "email id" should "send failure for invalid email" in {
    val email = (new EmailValidator).emailIdIsValid("alan.brooke@gail.om")
    assert(email == false)
  }
}