package io.swagger.client.api
import retrofit2.Call
import retrofit2.http.*
import okhttp3.RequestBody
import io.swagger.client.model.PostsAnswer
import io.swagger.client.model.Post
import io.swagger.client.model.PostData
import java.util.ArrayList
import java.util.HashMap
interface PostsApi {
  /**
 * Returns all Posts
 *
 * @return Call<PostsAnswer>
 */
  @GET("posts")
  fun getPosts():Call<PostsAnswer>
  /**
 * Creates a new Post
 *
 * @param body The Post to create
 * @return Call<Void>
 */
  @POST("posts")
  fun createNewPost(
    @Body body: PostData
  ):Call<Void>
  /**
 * Find a Post by its ID
 *
 * @param id ID of the Post to return
 * @return Call<Post>
 */
  @GET("posts/{Id}")
  fun getPost(
    @Path("Id") id:Long
  ):Call<Post>
}