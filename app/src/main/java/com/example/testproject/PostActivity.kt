package com.example.testproject

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.TextView
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.network.NetworkConfig
import io.swagger.client.api.CommentsApi
import io.swagger.client.model.CommentsAnswer
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class PostActivity : AppCompatActivity() {

    lateinit var myAdapter: CommentAdapter
    lateinit var linearLayoutManager: LinearLayoutManager

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_post)

        var postId: String
        var userId: String
        var title: String
        var body: String
        val postIdTextView: TextView = findViewById(R.id.postId) as TextView
        val postUserIdTextView: TextView = findViewById(R.id.postUserId) as TextView
        val postTitleTextView: TextView = findViewById(R.id.postTitle) as TextView
        val postBodyTextView: TextView = findViewById(R.id.postBody) as TextView
        postId = intent.getStringExtra("postId").toString()
        userId = intent.getStringExtra("userId").toString()
        title = intent.getStringExtra("title").toString()
        body = intent.getStringExtra("body").toString()
        postIdTextView.text = postId
        postUserIdTextView.text = userId
        postTitleTextView.text = title
        postBodyTextView.text = body

        val recyclerView_comments : RecyclerView = findViewById(R.id.recyclerView_comments)

        recyclerView_comments.setHasFixedSize(true)
        linearLayoutManager = LinearLayoutManager(this)
        recyclerView_comments.layoutManager = linearLayoutManager
        getComments()

    }

    fun getComments(){
        val retrofitBuilder = Retrofit.Builder()
            .baseUrl(NetworkConfig.BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
            .create(CommentsApi::class.java)

        val retrofitData = retrofitBuilder.getComments(intent.getStringExtra("postId")?.toLong())

        retrofitData.enqueue(object : Callback<CommentsAnswer?> {
            override fun onFailure(call: Call<CommentsAnswer?>, t: Throwable) {

            }

            override fun onResponse(call: Call<CommentsAnswer?>, response: Response<CommentsAnswer?>) {
                val responseBody = response.body()!!
                val recyclerView_comments : RecyclerView = findViewById(R.id.recyclerView_comments)

                myAdapter = CommentAdapter(baseContext, responseBody)
                myAdapter.notifyDataSetChanged()
                recyclerView_comments.adapter = myAdapter

            }
        })
    }
}