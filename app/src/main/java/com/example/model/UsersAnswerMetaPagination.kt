package io.swagger.client.model
import java.util.Objects
import io.swagger.annotations.ApiModel
import io.swagger.annotations.ApiModelProperty
import com.google.gson.annotations.SerializedName
@ApiModel(description = "")
class UsersAnswerMetaPagination {
  /**
 **/
  @SerializedName("total")
  @get:ApiModelProperty(value = "")
  var total:Long = null
  /**
 **/
  @SerializedName("pages")
  @get:ApiModelProperty(value = "")
  var pages:Long = null
  /**
 **/
  @SerializedName("limit")
  @get:ApiModelProperty(value = "")
  var limit:Long = null
  /**
 **/
  @SerializedName("page")
  @get:ApiModelProperty(value = "")
  var page:Long = null
  public override fun equals(o:Any):Boolean {
    if (this === o)
    {
      return true
    }
    if (o == null || javaClass != o.javaClass)
    {
      return false
    }
    val usersAnswerMetaPagination = o as UsersAnswerMetaPagination
    return (total == usersAnswerMetaPagination.total &&
            pages == usersAnswerMetaPagination.pages &&
            limit == usersAnswerMetaPagination.limit &&
            page == usersAnswerMetaPagination.page)
  }
  public override fun hashCode():Int {
    return Objects.hash(total, pages, limit, page)
  }
  public override fun toString():String {
    val sb = StringBuilder()
    sb.append("class UsersAnswerMetaPagination {\n")
    sb.append(" total: ").append(toIndentedString(total)).append("\n")
    sb.append(" pages: ").append(toIndentedString(pages)).append("\n")
    sb.append(" limit: ").append(toIndentedString(limit)).append("\n")
    sb.append(" page: ").append(toIndentedString(page)).append("\n")
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