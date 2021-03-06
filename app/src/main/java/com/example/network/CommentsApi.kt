package io.swagger.client.api
import retrofit2.Call
import retrofit2.http.*
import io.swagger.client.model.CommentsAnswer
import io.swagger.client.model.Comment
import java.util.HashMap
interface CommentsApi {
  /**
 * Retrieves post comments
 *
 * @param id ID of the Post to return
 * @return Call<CommentsAnswer>
 */
  @GET("posts/{Id}/comments")
  fun getComments(
    @Path("Id") id: Long?
  ):Call<CommentsAnswer>
  /**
 * Creates a new Comment
 *
 * @param id ID of the Post to return
 * @param body The Comment to create
 * @return Call<Void>
 */
  @POST("posts/{Id}/comment")
  fun createNewComment(
    @Path("Id") id:Long, @Body body:Comment
  ):Call<Void>
}