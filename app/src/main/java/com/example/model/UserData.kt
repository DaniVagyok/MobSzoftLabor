package io.swagger.client.model
import java.util.Objects
import com.google.gson.annotations.SerializedName
class UserData {
  /**
 * A User neme
 **/
  @SerializedName("gender")
  var gender:String? = null
  /**
 * A User módosításának ideje
 **/
  @SerializedName("updated_at")
  var updatedAt:String? = null
  /**
 * A User neve
 **/
  @SerializedName("name")
  var name:String? = null
  /**
 * A User létrehozásának ideje
 **/
  @SerializedName("created_at")
  var createdAt:String? = null
  /**
 **/
  @SerializedName("id")
  var id:Long? = null
  /**
 * A User e-mail címe
 **/
  @SerializedName("email")
  var email:String? = null
  /**
 * A User státusza
 **/
  @SerializedName("status")
  var status:String? = null
}