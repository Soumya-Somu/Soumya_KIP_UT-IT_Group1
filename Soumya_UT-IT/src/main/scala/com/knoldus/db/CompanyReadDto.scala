package com.knoldus.db

import com.knoldus.models.Company

import scala.collection.immutable.HashMap

class CompanyReadDto {

  // Get company details with hashmap keys

  val knoldusCompany: Company = Company("Knoldus", "knoldussoftware@gmail.com", "Noida")
  val techbuzzCompany: Company = Company("techbuzz", "techbuzz123@gmail.com", "Chennai")

  val companies: HashMap[String, Company] = HashMap("Knoldus" -> knoldusCompany, "Techbuzz" -> techbuzzCompany)

  def getCompanyByName(name: String): Option[Company] = companies.get(name)

}