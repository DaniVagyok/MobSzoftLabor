package io.swagger.client.model
import java.util.Objects
import io.swagger.annotations.ApiModel
import io.swagger.annotations.ApiModelProperty
import io.swagger.client.model.Comment
import io.swagger.client.model.UsersAnswerMeta
import java.util.ArrayList
import com.google.gson.annotations.SerializedName
@ApiModel(description = "")
internal class CommentsAnswer {
  var code:`var`
  var meta:`var`
  var data:`var`
  var `fun`:override
  var `fun`:override
  var `fun`:override
  constructor()
  constructor()
  constructor()
  constructor()
  init{
    if (this === = o)
    {
      return true
    }
    if (o == null || javaClass !== o.javaClass)
    {
      return false
    }
    val commentsAnswer = o
    val CommentsAnswer:`as`
    return ((code === commentsAnswer.code &&
             meta === commentsAnswer.meta &&
             data === commentsAnswer.data))
  }
  constructor()
  init{
    return Objects.hash(code, meta, data)
  }
  constructor()
  init{
    val sb = StringBuilder()
    sb.append("class CommentsAnswer {\n")
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
  private fun toIndentedString():`fun`
  init{
    if (o == null)
    {
      return "null"
    }
    return o.toString().replace("\n", "\n ")
  }
}/**
**//**
**//**
**/