package com.krashkrosh748199.recyclerview

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.CheckBox
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.ViewHolder

        class TodoAdapter(

            var todos: List<Todo>
        ) : RecyclerView.Adapter<TodoAdapter.TodoViewHolder>() {

            inner class TodoViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView)


            override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TodoViewHolder {
                val view =
                    LayoutInflater.from(parent.context).inflate(R.layout.item_todo, parent, false)
                return TodoViewHolder(view)
            }


            override fun getItemCount(): Int {
                return todos.size
            }

            override fun onBindViewHolder(holder: TodoViewHolder, position: Int) {



                        holder.itemView.apply {


                                    val tvFirst = findViewById<TextView>(R.id.tvTitle)
                                    val cbFirst = findViewById<CheckBox>(R.id.cbDone)
                            tvFirst.text = todos[position].title
                            cbFirst.isChecked = todos[position].isChecked

                        }

                    }


                }

