package io.swagger.client.model
import java.util.Objects
import io.swagger.annotations.ApiModel
import io.swagger.annotations.ApiModelProperty
import com.google.gson.annotations.SerializedName
@ApiModel(description = "")
class CommentData {
  /**
 **/
  @SerializedName("post_id")
  @get:ApiModelProperty(value = "")
  var postId:Long = null
  /**
 * A Comment módosításának ideje
 **/
  @SerializedName("updated_at")
  @get:ApiModelProperty(value = "A Comment módosításának ideje")
  var updatedAt:String = null
  /**
 * A User neve
 **/
  @SerializedName("name")
  @get:ApiModelProperty(value = "A User neve")
  var name:String = null
  /**
 * A Comment létrehozásának ideje
 **/
  @SerializedName("created_at")
  @get:ApiModelProperty(value = "A Comment létrehozásának ideje")
  var createdAt:String = null
  /**
 **/
  @SerializedName("id")
  @get:ApiModelProperty(value = "")
  var id:Long = null
  /**
 * A Comment teste
 **/
  @SerializedName("body")
  @get:ApiModelProperty(value = "A Comment teste")
  var body:String = null
  /**
 * A User e-mail címe
 **/
  @SerializedName("email")
  @get:ApiModelProperty(value = "A User e-mail címe")
  var email:String = null
  public override fun equals(o:Any):Boolean {
    if (this === o)
    {
      return true
    }
    if (o == null || javaClass != o.javaClass)
    {
      return false
    }
    val commentData = o as CommentData
    return (postId == commentData.postId &&
            updatedAt == commentData.updatedAt &&
            name == commentData.name &&
            createdAt == commentData.createdAt &&
            id == commentData.id &&
            body == commentData.body &&
            email == commentData.email)
  }
  public override fun hashCode():Int {
    return Objects.hash(postId, updatedAt, name, createdAt, id, body, email)
  }
  public override fun toString():String {
    val sb = StringBuilder()
    sb.append("class CommentData {\n")
    sb.append(" postId: ").append(toIndentedString(postId)).append("\n")
    sb.append(" updatedAt: ").append(toIndentedString(updatedAt)).append("\n")
    sb.append(" name: ").append(toIndentedString(name)).append("\n")
    sb.append(" createdAt: ").append(toIndentedString(createdAt)).append("\n")
    sb.append(" id: ").append(toIndentedString(id)).append("\n")
    sb.append(" body: ").append(toIndentedString(body)).append("\n")
    sb.append(" email: ").append(toIndentedString(email)).append("\n")
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