package io.swagger.client.model
import java.util.Objects
import io.swagger.client.model.UserData
import com.google.gson.annotations.SerializedName
import java.util.ArrayList

class CommentsAnswer {
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
  var data:List<CommentData> = ArrayList<CommentData>()

}