package com.example.testproject

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.network.NetworkConfig
import io.swagger.client.api.PostsApi
import io.swagger.client.api.UsersApi
import io.swagger.client.model.PostsAnswer
import io.swagger.client.model.UsersAnswer
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class ListUsersActivity : AppCompatActivity() {
    lateinit var myAdapter: UserAdapter
    lateinit var linearLayoutManager: LinearLayoutManager

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_list_users)
        val recyclerView_users : RecyclerView = findViewById(R.id.recyclerView_users)

        recyclerView_users.setHasFixedSize(true)
        linearLayoutManager = LinearLayoutManager(this)
        recyclerView_users.layoutManager = linearLayoutManager

        getUsers()
    }

    fun getUsers(){
        val retrofitBuilder = Retrofit.Builder()
                .baseUrl(NetworkConfig.BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build()
                .create(UsersApi::class.java)

        val retrofitData = retrofitBuilder.getUsers()

        retrofitData.enqueue(object : Callback<UsersAnswer?> {
            override fun onFailure(call: Call<UsersAnswer?>, t: Throwable) {

            }

            override fun onResponse(call: Call<UsersAnswer?>, response: Response<UsersAnswer?>) {
                val responseBody = response.body()!!
                val recyclerView_users : RecyclerView = findViewById(R.id.recyclerView_users)

                myAdapter = UserAdapter(baseContext, responseBody)
                myAdapter.notifyDataSetChanged()
                recyclerView_users.adapter = myAdapter

            }
        })
    }
}