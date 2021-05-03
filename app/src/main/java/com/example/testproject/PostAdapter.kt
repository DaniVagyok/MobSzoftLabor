package com.example.testproject

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import io.swagger.client.model.Post
import io.swagger.client.model.PostsAnswer


class PostAdapter(val context: Context, val postList: PostsAnswer): RecyclerView.Adapter<PostAdapter.ViewHolder>() {

    var posts = arrayListOf<Post>()

    class ViewHolder(itemView: View): RecyclerView.ViewHolder(itemView) {
        var userId: TextView
        var title: TextView
        var body: TextView
        init{
            userId = itemView.findViewById(R.id.postUserId)
            title = itemView.findViewById(R.id.postTitle)
            body = itemView.findViewById(R.id.postBody)
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        var itemView = LayoutInflater.from(context).inflate(R.layout.post_items, parent, false)
        return ViewHolder(itemView)
    }

    override fun getItemCount(): Int {
        return postList.data.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.userId.text = postList.data[position].userId.toString()
        holder.title.text = postList.data[position].title.toString()
        holder.body.text = postList.data[position].body.toString()
    }
}