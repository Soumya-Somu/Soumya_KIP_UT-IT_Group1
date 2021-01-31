package request

import com.knoldus.db._
import com.knoldus.models.{Company, Employee}
import com.knoldus.request.EmployeeImpl
import com.knoldus.validator.{CompanyValidator, EmailValidator, EmployeeValidator}
import org.scalatest.flatspec.AnyFlatSpec

class EmployeeImplSpec extends AnyFlatSpec {
  val employeeRead = new EmployeeReadto
  val emailValidat = new EmailValidator
  val employeeValid = new EmployeeValidator(employeeRead, emailValidat)
  val employeeImp = new EmployeeImpl(employeeValid)

  "Employee details" should "send be found for valid parameter" in {
    val employeeAlan = Employee("Alan", "Brooke", 30, 18000, "Intern", "Knoldus", "alan.brooke@knoldus.com")
    val res = employeeImp.createEmployee(employeeAlan)
    assert(!res.isEmpty)
  }

  "Company details" should "send not be found for invalid parameter" in {
    val employeeAlan = Employee("Alan", "Brooke", 30, 18000, "Intern", "Knoldus", "alan.brooke@knoldus.om")
    val res = employeeImp.createEmployee(employeeAlan)
    assert(res.isEmpty)
  }
}