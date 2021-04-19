package io.swagger.client.model
import java.util.Objects
import io.swagger.annotations.ApiModel
import io.swagger.annotations.ApiModelProperty
import io.swagger.client.model.UsersAnswerMetaPagination
import com.google.gson.annotations.SerializedName
@ApiModel(description = "")
class UsersAnswerMeta {
  /**
 **/
  @SerializedName("pagination")
  @get:ApiModelProperty(value = "")
  var pagination:UsersAnswerMetaPagination = null
  public override fun equals(o:Any):Boolean {
    if (this === o)
    {
      return true
    }
    if (o == null || javaClass != o.javaClass)
    {
      return false
    }
    val usersAnswerMeta = o as UsersAnswerMeta
    return pagination == usersAnswerMeta.pagination
  }
  public override fun hashCode():Int {
    return Objects.hash(pagination)
  }
  public override fun toString():String {
    val sb = StringBuilder()
    sb.append("class UsersAnswerMeta {\n")
    sb.append(" pagination: ").append(toIndentedString(pagination)).append("\n")
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