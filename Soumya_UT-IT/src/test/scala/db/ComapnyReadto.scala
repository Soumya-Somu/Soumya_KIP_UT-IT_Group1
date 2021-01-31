package db

import com.knoldus.db.CompanyReadDto
import org.scalatest.flatspec.AnyFlatSpec

class ComapnyReadto extends AnyFlatSpec {

  val company = new CompanyReadDto()

  // Testcase for a valid company as output

  "Company details" should "be found for valid company name" in {
    val res = company.getCompanyByName("Knoldus")
    assert(!res.isEmpty)
  }

  // Testcase for an invalid company name as output

  "Company details " should "not be found for invalid company name" in {
    val res = company.getCompanyByName("name")
    assert(res.isEmpty)
  }

}