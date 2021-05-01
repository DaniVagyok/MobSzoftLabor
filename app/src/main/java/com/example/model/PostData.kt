package io.swagger.client.model
import java.util.Objects
import com.google.gson.annotations.SerializedName
class PostData {
  /**
 * A Post módosításának ideje
 **/
  @SerializedName("updated_at")
  var updatedAt:String? = null
  /**
 **/
  @SerializedName("user_id")
  var userId:Long? = null
  /**
 * A Post létrehozásának ideje
 **/
  @SerializedName("created_at")
  var createdAt:String? = null
  /**
 **/
  @SerializedName("id")
  var id:Long? = null
  /**
 * A Post címe
 **/
  @SerializedName("title")
  var title:String? = null
  /**
 * A Post teste
 **/
  @SerializedName("body")
  var body:String? = null

}