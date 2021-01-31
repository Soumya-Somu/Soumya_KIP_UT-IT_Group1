package request

import com.knoldus.db.CompanyReadDto
import com.knoldus.models.Company
import com.knoldus.request.CompanyImpl
import com.knoldus.validator.{CompanyValidator, EmailValidator}
import org.scalatest.flatspec.AnyFlatSpec

class CompanyImplSpec extends AnyFlatSpec {
  val companyRead = new CompanyReadDto
  val emailValidat = new EmailValidator
  val companyValid = new CompanyValidator(companyRead, emailValidat)
  val companyImp = new CompanyImpl(companyValid)

  "Company details" should "send be found for valid parameter" in {
    val knoldusCompany: Company = Company("Knoldus", "knoldussoftware@gmail.com", "Noida")
    val res = companyImp.createCompany(knoldusCompany)
    assert(!res.isEmpty)
  }

  "Company details" should "send not be found for invalid parameter" in {
    val knoldusCompany: Company = Company("Knoldus", "knoldus@gmail.om", "Noida")
    val res = companyImp.createCompany(knoldusCompany)
    assert(res.isEmpty)
  }

}