package request

import com.knoldus.db.{CompanyReadDto, EmployeeReadto, UserReadTo}
import com.knoldus.models.{Employee, User}
import com.knoldus.request.{EmployeeImpl, UserImpl}
import com.knoldus.validator.{EmailValidator, EmployeeValidator, UserValidator}
import org.scalatest.flatspec.AnyFlatSpec

class UserImplSpec extends AnyFlatSpec {

  val companyRead = new CompanyReadDto


  val userRead = new UserReadTo
  val emailValidat = new EmailValidator
  val userValid = new UserValidator(userRead, emailValidat, companyRead)
  val userImp = new UserImpl(userValid)

  "User details" should "send be found for valid parameter" in {
    val user1: User = User("user1", "lastName", 24, "alan.brooke@knoldus.com", "9876543210", "city", "Knoldus")
    val res = userImp.createUser(user1)
    println("\n\nRes :  " + res + "\n\n")
    assert(!res.isEmpty)
  }

  "user details" should "send not be found for invalid parameter" in {
    val user1: User = User("user1", "lastName", 24, "email", "9876543210", "city", "Forbe")
    val res = userImp.createUser(user1)
    println("\n\n" + res + "\n\n")
    assert(res.isEmpty)
  }
}
