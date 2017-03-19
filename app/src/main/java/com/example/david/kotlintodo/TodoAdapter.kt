package com.example.david.kotlintodo

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.david.kotlintodo.TodoAdapter.ViewHolder
import kotlinx.android.synthetic.main.item_todo.view.*

/**
 * Created by david on 19/3/17.
 */

class TodoAdapter (val todoValues : ArrayList<String>)
    : RecyclerView.Adapter<ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_todo, parent, false)
        return ViewHolder(view)
    }

    override fun getItemCount(): Int {
        return todoValues.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bindData(todoValues[position])
    }

    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        fun bindData(value : String){
            itemView.todoName.text = value
        }
    }
}