package com.example.testproject

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import io.swagger.client.model.CommentsAnswer

class CommentAdapter(val context: Context, val commentList: CommentsAnswer): RecyclerView.Adapter<CommentAdapter.ViewHolder>() {

    inner class ViewHolder(itemView: View): RecyclerView.ViewHolder(itemView) {
        var nameTextView: TextView
        var bodyTextView: TextView
        init{
            nameTextView = itemView.findViewById(R.id.commentName)
            bodyTextView = itemView.findViewById(R.id.commentBody)
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        var itemView = LayoutInflater.from(context).inflate(R.layout.comment_items, parent, false)
        return ViewHolder(itemView)
    }

    override fun getItemCount(): Int {
        return commentList.data.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.nameTextView.text = commentList.data[position].name.toString()
        holder.bodyTextView.text = commentList.data[position].body.toString()
    }

}