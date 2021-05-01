package io.swagger.client.model
import java.util.Objects
import io.swagger.client.model.PostData
import com.google.gson.annotations.SerializedName
class Post {
  /**
 **/
  @SerializedName("code")
  var code:Long? = null
  /**
 **/
  @SerializedName("meta")
  var meta:Long? = null
  /**
 **/
  @SerializedName("data")
  var data:PostData? = null

}