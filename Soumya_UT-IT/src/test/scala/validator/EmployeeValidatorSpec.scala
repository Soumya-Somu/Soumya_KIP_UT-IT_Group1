package validator

import com.knoldus.db.EmployeeReadto
import com.knoldus.models.Employee
import com.knoldus.request.EmployeeImpl
import com.knoldus.validator.{EmailValidator, EmployeeValidator}
import org.scalatest.flatspec.AnyFlatSpec

class EmployeeValidatorSpec extends AnyFlatSpec {

  val employeeRead = new EmployeeReadto
  val emailValidat = new EmailValidator
  val employeeValid = new EmployeeValidator(employeeRead, emailValidat)
  val employeeImp = new EmployeeImpl(employeeValid)

  "Employee details" should "send be found for valid Employee" in {
    val employeeAlan = Employee("Alan", "Brooke", 30, 18000, "Intern", "Knoldus", "alan.brooke@knoldus.com")
    val res = employeeValid.employeeIsValid(employeeAlan)
    assert(res == true)
  }

  "Employee details" should "send be found for invalid Employee" in {
    val employeeAlan = Employee("Alan", "Brooke", 30, 18000, "Intern", "Knoldus", "alan.brooke@knoldus.om")
    val res = employeeValid.employeeIsValid(employeeAlan)
    assert(res == false)
  }

}