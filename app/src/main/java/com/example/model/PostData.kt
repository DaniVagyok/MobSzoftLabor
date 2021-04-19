package io.swagger.client.model
import java.util.Objects
import io.swagger.annotations.ApiModel
import io.swagger.annotations.ApiModelProperty
import com.google.gson.annotations.SerializedName
@ApiModel(description = "")
class PostData {
  /**
 * A Post módosításának ideje
 **/
  @SerializedName("updated_at")
  @get:ApiModelProperty(value = "A Post módosításának ideje")
  var updatedAt:String = null
  /**
 **/
  @SerializedName("user_id")
  @get:ApiModelProperty(value = "")
  var userId:Long = null
  /**
 * A Post létrehozásának ideje
 **/
  @SerializedName("created_at")
  @get:ApiModelProperty(value = "A Post létrehozásának ideje")
  var createdAt:String = null
  /**
 **/
  @SerializedName("id")
  @get:ApiModelProperty(value = "")
  var id:Long = null
  /**
 * A Post címe
 **/
  @SerializedName("title")
  @get:ApiModelProperty(value = "A Post címe")
  var title:String = null
  /**
 * A Post teste
 **/
  @SerializedName("body")
  @get:ApiModelProperty(value = "A Post teste")
  var body:String = null
  public override fun equals(o:Any):Boolean {
    if (this === o)
    {
      return true
    }
    if (o == null || javaClass != o.javaClass)
    {
      return false
    }
    val postData = o as PostData
    return (updatedAt == postData.updatedAt &&
            userId == postData.userId &&
            createdAt == postData.createdAt &&
            id == postData.id &&
            title == postData.title &&
            body == postData.body)
  }
  public override fun hashCode():Int {
    return Objects.hash(updatedAt, userId, createdAt, id, title, body)
  }
  public override fun toString():String {
    val sb = StringBuilder()
    sb.append("class PostData {\n")
    sb.append(" updatedAt: ").append(toIndentedString(updatedAt)).append("\n")
    sb.append(" userId: ").append(toIndentedString(userId)).append("\n")
    sb.append(" createdAt: ").append(toIndentedString(createdAt)).append("\n")
    sb.append(" id: ").append(toIndentedString(id)).append("\n")
    sb.append(" title: ").append(toIndentedString(title)).append("\n")
    sb.append(" body: ").append(toIndentedString(body)).append("\n")
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