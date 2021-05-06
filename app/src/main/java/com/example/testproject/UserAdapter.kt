package com.example.testproject

import android.content.Context
import android.media.Image
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageButton
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.example.network.NetworkConfig
import io.swagger.client.api.PostsApi
import io.swagger.client.api.UsersApi
import io.swagger.client.model.PostsAnswer
import io.swagger.client.model.User
import io.swagger.client.model.UsersAnswer
import okhttp3.ResponseBody
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class UserAdapter(val context: Context, val userList: UsersAnswer): RecyclerView.Adapter<UserAdapter.ViewHolder>() {
    class ViewHolder(itemView: View): RecyclerView.ViewHolder(itemView) {
        var userId: TextView
        var name: TextView
        var email: TextView
        var delete: ImageButton
        init{
            userId = itemView.findViewById(R.id.userUserId)
            name = itemView.findViewById(R.id.userName)
            email = itemView.findViewById(R.id.userEmail)
            delete = itemView.findViewById(R.id.layout_list_delete)
        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        var itemView = LayoutInflater.from(context).inflate(R.layout.user_items, parent, false)
        return ViewHolder(itemView)
    }

    override fun getItemCount(): Int {
        return userList.data.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.userId.text = userList.data[position].id.toString()
        holder.name.text = userList.data[position].name.toString()
        holder.email.text = userList.data[position].email.toString()
        holder.delete.setOnClickListener{
            deleteUser(holder)
            notifyDataSetChanged()
            userList.data.removeAt(position)
            notifyItemRemoved(position)
        }
    }

    fun deleteUser(holder: ViewHolder){
        val retrofitBuilder = Retrofit.Builder()
            .baseUrl(NetworkConfig.BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
            .create(UsersApi::class.java)

        val retrofitData = retrofitBuilder.deleteUser(Integer.parseInt(holder.userId.text.toString()).toLong(), "Bearer 09066c31e1c30471eaccd42b96df44e7fe7c7873573aa571f111c5dce56dc2cb")

        retrofitData.enqueue(object: Callback<Void>{
            override fun onFailure(call: Call<Void>, t: Throwable) {
                Toast.makeText(context, "Failed delete", Toast.LENGTH_SHORT).show()
            }

            override fun onResponse(call: Call<Void>, response: Response<Void>) {
                if(response.isSuccessful){
                    Toast.makeText(context, "Successful delete", Toast.LENGTH_SHORT).show()
                }
            }

        })
    }
}