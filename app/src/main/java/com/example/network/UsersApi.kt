package io.swagger.client.api
import io.swagger.client.model.User
import io.swagger.client.model.UserData
import retrofit2.Call
import retrofit2.http.*
import io.swagger.client.model.UsersAnswer

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
          @Body body: UserData,
          @Header("Authorization") token: String
  ):Call<User>
  /**
 * Deletes a User
 *
 * @param id User id to delete
 * @return Call<Void>
 */
  @DELETE("users/{Id}")
  fun deleteUser(
    @Path("Id") id:Long,
    @Header("Authorization") token: String
  ):Call<Void>
}