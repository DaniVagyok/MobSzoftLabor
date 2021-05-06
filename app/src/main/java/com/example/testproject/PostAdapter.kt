package com.example.testproject

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import io.swagger.client.model.Post
import io.swagger.client.model.PostsAnswer


class PostAdapter(val context: Context, val postList: PostsAnswer): RecyclerView.Adapter<PostAdapter.ViewHolder>() {


    inner class ViewHolder(itemView: View): RecyclerView.ViewHolder(itemView) {
        var postId: TextView
        var userId: TextView
        var title: TextView
        var body: TextView
        init{
            postId = itemView.findViewById(R.id.postId)
            userId = itemView.findViewById(R.id.postUserId)
            title = itemView.findViewById(R.id.postTitle)
            body = itemView.findViewById(R.id.postBody)

            itemView.setOnClickListener {
                context.startActivity(Intent(context, PostActivity::class.java)
                        .addFlags(Intent.FLAG_ACTIVITY_NEW_TASK)
                        .putExtra("postId", postId.text)
                        .putExtra("userId", userId.text)
                        .putExtra("title", title.text)
                        .putExtra("body", body.text)
                )
            }
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
        holder.postId.text = postList.data[position].id.toString()
        holder.userId.text = postList.data[position].userId.toString()
        holder.title.text = postList.data[position].title.toString()
        holder.body.text = postList.data[position].body.toString()
    }
}