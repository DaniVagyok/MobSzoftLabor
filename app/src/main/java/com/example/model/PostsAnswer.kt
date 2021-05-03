package io.swagger.client.model
import java.util.Objects
import io.swagger.client.model.Post
import io.swagger.client.model.UsersAnswerMeta
import java.util.ArrayList
import com.google.gson.annotations.SerializedName
class PostsAnswer {
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
  var data:List<PostData> = ArrayList<PostData>()
}