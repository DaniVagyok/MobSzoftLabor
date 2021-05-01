package io.swagger.client.model
import java.util.Objects
import com.google.gson.annotations.SerializedName
class CommentData {
  /**
 **/
  @SerializedName("post_id")
  var postId:Long? = null
  /**
 * A Comment módosításának ideje
 **/
  @SerializedName("updated_at")
  var updatedAt:String? = null
  /**
 * A User neve
 **/
  @SerializedName("name")
  var name:String? = null
  /**
 * A Comment létrehozásának ideje
 **/
  @SerializedName("created_at")
  var createdAt:String? = null
  /**
 **/
  @SerializedName("id")
  var id:Long? = null
  /**
 * A Comment teste
 **/
  @SerializedName("body")
  var body:String? = null
  /**
 * A User e-mail címe
 **/
  @SerializedName("email")
  var email:String? = null

}