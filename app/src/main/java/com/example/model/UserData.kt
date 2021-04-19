package io.swagger.client.model
import java.util.Objects
import io.swagger.annotations.ApiModel
import io.swagger.annotations.ApiModelProperty
import com.google.gson.annotations.SerializedName
@ApiModel(description = "")
class UserData {
  /**
 * A User neme
 **/
  @SerializedName("gender")
  @get:ApiModelProperty(value = "A User neme")
  var gender:String = null
  /**
 * A User módosításának ideje
 **/
  @SerializedName("updated_at")
  @get:ApiModelProperty(value = "A User módosításának ideje")
  var updatedAt:String = null
  /**
 * A User neve
 **/
  @SerializedName("name")
  @get:ApiModelProperty(value = "A User neve")
  var name:String = null
  /**
 * A User létrehozásának ideje
 **/
  @SerializedName("created_at")
  @get:ApiModelProperty(value = "A User létrehozásának ideje")
  var createdAt:String = null
  /**
 **/
  @SerializedName("id")
  @get:ApiModelProperty(value = "")
  var id:Long = null
  /**
 * A User e-mail címe
 **/
  @SerializedName("email")
  @get:ApiModelProperty(value = "A User e-mail címe")
  var email:String = null
  /**
 * A User státusza
 **/
  @SerializedName("status")
  @get:ApiModelProperty(value = "A User státusza")
  var status:String = null
  public override fun equals(o:Any):Boolean {
    if (this === o)
    {
      return true
    }
    if (o == null || javaClass != o.javaClass)
    {
      return false
    }
    val userData = o as UserData
    return (gender == userData.gender &&
            updatedAt == userData.updatedAt &&
            name == userData.name &&
            createdAt == userData.createdAt &&
            id == userData.id &&
            email == userData.email &&
            status == userData.status)
  }
  public override fun hashCode():Int {
    return Objects.hash(gender, updatedAt, name, createdAt, id, email, status)
  }
  public override fun toString():String {
    val sb = StringBuilder()
    sb.append("class UserData {\n")
    sb.append(" gender: ").append(toIndentedString(gender)).append("\n")
    sb.append(" updatedAt: ").append(toIndentedString(updatedAt)).append("\n")
    sb.append(" name: ").append(toIndentedString(name)).append("\n")
    sb.append(" createdAt: ").append(toIndentedString(createdAt)).append("\n")
    sb.append(" id: ").append(toIndentedString(id)).append("\n")
    sb.append(" email: ").append(toIndentedString(email)).append("\n")
    sb.append(" status: ").append(toIndentedString(status)).append("\n")
    sb.append("}")
    return sb.toString()
  }
  /**
 * Convert the given object to string with each line indented by 4 spaces
 * (except the first line).
 */
  private fun toIndentedString(o:Any):String {
    if (o == null)
    {
      return "null"
    }
    return o.toString().replace("\n", "\n ")
  }
}