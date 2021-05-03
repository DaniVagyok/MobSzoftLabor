package io.swagger.client.model
import java.util.Objects
import io.swagger.client.model.User
import io.swagger.client.model.UsersAnswerMeta
import java.util.ArrayList
import com.google.gson.annotations.SerializedName
class UsersAnswer {
  /**
 **/
  @SerializedName("code")
  var code:Long? = null
  /**
 **/
  @SerializedName("meta")
  var meta:UsersAnswerMeta? = null
  /**
 **/
  @SerializedName("data")
  var data: ArrayList<UserData> = ArrayList<UserData>()
}