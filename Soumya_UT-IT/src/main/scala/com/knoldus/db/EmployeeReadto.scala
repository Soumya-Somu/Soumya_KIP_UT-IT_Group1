package com.knoldus.db

import com.knoldus.models.Employee

import scala.collection.immutable.HashMap

class EmployeeReadto {

  // Get employee details with hashmap keys

  val employeeAlan = Employee("Alan", "Brooke", 30, 18000, "Intern", "Knoldus", "alan.brooke@knoldus.com")
  val employeeSample = Employee("firstName", "lastName", 26, 20000, "Designation", "Company", "email@domain.com")
  val employees: HashMap[String, Employee] = HashMap("Alan" -> employeeAlan, "Sample" -> employeeSample)

  def getEmployeeByName(name: String): Option[Employee] = employees.get(name)
}
