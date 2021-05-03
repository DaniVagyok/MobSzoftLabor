package com.example.testproject

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.network.NetworkConfig
import io.swagger.client.api.PostsApi
import io.swagger.client.model.PostsAnswer
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class ListPostsActivity : AppCompatActivity() {

    lateinit var myAdapter: PostAdapter
    lateinit var linearLayoutManager: LinearLayoutManager

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_list_posts)
        val recyclerView_posts : RecyclerView = findViewById(R.id.recyclerView_posts)

        recyclerView_posts.setHasFixedSize(true)
        linearLayoutManager = LinearLayoutManager(this)
        recyclerView_posts.layoutManager = linearLayoutManager

        getPosts()

    }

    fun getPosts(){
        val retrofitBuilder = Retrofit.Builder()
                .baseUrl(NetworkConfig.BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build()
                .create(PostsApi::class.java)

        val retrofitData = retrofitBuilder.getPosts()

        retrofitData.enqueue(object : Callback<PostsAnswer?> {
            override fun onFailure(call: Call<PostsAnswer?>, t: Throwable) {

            }

            override fun onResponse(call: Call<PostsAnswer?>, response: Response<PostsAnswer?>) {
                val responseBody = response.body()!!
                val recyclerView_posts : RecyclerView = findViewById(R.id.recyclerView_posts)

                myAdapter = PostAdapter(baseContext, responseBody)
                myAdapter.notifyDataSetChanged()
                recyclerView_posts.adapter = myAdapter

            }
        })
    }

}