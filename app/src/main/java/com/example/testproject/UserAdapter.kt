package com.example.testproject

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import io.swagger.client.model.PostsAnswer
import io.swagger.client.model.UsersAnswer

class UserAdapter(val context: Context, val userList: UsersAnswer): RecyclerView.Adapter<UserAdapter.ViewHolder>() {
    class ViewHolder(itemView: View): RecyclerView.ViewHolder(itemView) {
        var userId: TextView
        var name: TextView
        var email: TextView
        init{
            userId = itemView.findViewById(R.id.userUserId)
            name = itemView.findViewById(R.id.userName)
            email = itemView.findViewById(R.id.userEmail)
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
    }
}