package com.knoldus.request

import com.knoldus.models.Company
import com.knoldus.validator.CompanyValidator

class CompanyImpl(companyValidator: CompanyValidator) {

  // Check if company details exist in the hashmap

  def createCompany(company: Company): Option[String] = {
    if (companyValidator.companyIsValid(company))
      Option(company.name)
    else None
  }
}