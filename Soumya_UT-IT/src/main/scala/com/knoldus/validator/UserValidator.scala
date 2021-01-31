package com.knoldus.validator

import com.knoldus.db.{CompanyReadDto, UserReadTo}
import com.knoldus.models.User

class UserValidator(userReadTo: UserReadTo, validateEmail: EmailValidator, companyReadDto: CompanyReadDto) {

  def userValidator(user: User): Boolean = {

    val emailValid = validateEmail.emailIdIsValid(user.email)
    val nameValid = userReadTo.getUserByName(user.firstName)

    val companyName = companyReadDto.getCompanyByName(user.companyName)

    if (emailValid == true && !nameValid.isEmpty && !companyName.isEmpty)
      true
    else
      false

  }
}