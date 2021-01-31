package com.knoldus.db

import com.knoldus.models.User

import scala.collection.immutable.HashMap

class UserReadTo {

  // Get user details with hashmap keys

  val user1: User = User("user1", "lastName", 24, "email", "9876543210", "city", "Noida")
  val user2: User = User("user2", "lastName1", 24, "email1", "9876543210", "city1", "Chennai")

  val users: HashMap[String, User] = HashMap("user1" -> user1, "user2" -> user2)

  def getUserByName(name: String): Option[User] = users.get(name)
}
