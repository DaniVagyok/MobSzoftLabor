package io.swagger.client.model
import java.util.Objects
import io.swagger.annotations.ApiModel
import io.swagger.annotations.ApiModelProperty
import io.swagger.client.model.Post
import io.swagger.client.model.UsersAnswerMeta
import java.util.ArrayList
import com.google.gson.annotations.SerializedName
@ApiModel(description = "")
class PostsAnswer {
  /**
 **/
  @SerializedName("code")
  @get:ApiModelProperty(required = true, value = "")
  var code:Long = null
  /**
 **/
  @SerializedName("meta")
  @get:ApiModelProperty(value = "")
  var meta:UsersAnswerMeta = null
  /**
 **/
  @SerializedName("data")
  @get:ApiModelProperty(required = true, value = "")
  var data:List<Post> = ArrayList<Post>()
  public override fun equals(o:Any):Boolean {
    if (this === o)
    {
      return true
    }
    if (o == null || javaClass != o.javaClass)
    {
      return false
    }
    val postsAnswer = o as PostsAnswer
    return (code == postsAnswer.code &&
            meta == postsAnswer.meta &&
            data == postsAnswer.data)
  }
  public override fun hashCode():Int {
    return Objects.hash(code, meta, data)
  }
  public override fun toString():String {
    val sb = StringBuilder()
    sb.append("class PostsAnswer {\n")
    sb.append(" code: ").append(toIndentedString(code)).append("\n")
    sb.append(" meta: ").append(toIndentedString(meta)).append("\n")
    sb.append(" data: ").append(toIndentedString(data)).append("\n")
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