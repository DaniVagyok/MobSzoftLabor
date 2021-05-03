package io.swagger.client.api
import io.swagger.client.model.PostsAnswer
import retrofit2.Call
import retrofit2.http.*
import okhttp3.RequestBody
import io.swagger.client.model.UsersAnswer
import io.swagger.client.model.User
import java.util.ArrayList
import java.util.HashMap
interface UsersApi {
  /**
 * Returns all Users
 *
 * @return Call<UsersAnswer>
 */
  @GET("users")
  fun getUsers():Call<UsersAnswer>
  /**
 * Creates a new User
 *
 * @param body The User to create
 * @return Call<Void>
 */
  @POST("users")
  fun createNewUser(
    @Body body:User
  ):Call<Void>
  /**
 * Deletes a User
 *
 * @param id User id to delete
 * @return Call<Void>
 */
  @DELETE("users/{Id}")
  fun deleteUser(
    @Path("Id") id:Long
  ):Call<Void>
}