package db

import com.knoldus.db.UserReadTo
import org.scalatest.flatspec.AnyFlatSpec

class UserReadToSpec extends AnyFlatSpec {
  val user = new UserReadTo
  "User details " should "be found for valid name" in {
    val res = user.getUserByName("user1")
    assert(!res.isEmpty)
  }

  "User details " should " not be found for invalid name" in {
    val res = user.getUserByName("user")
    assert(res.isEmpty)
  }
}