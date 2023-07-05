package com.krashkrosh748199.recyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val rvFirst=findViewById<RecyclerView>(R.id.rvTodos)
        val btnFirst=findViewById<Button>(R.id.btnAddTodo)
        val etFirst=findViewById<EditText>(R.id.etTodo)
        var todoList= mutableListOf(
            Todo("Follow AndroidDevs",false),
            Todo("Learn about recyclerview",true),
            Todo("Feed my cat",false),
            Todo("prank my Boss",false),
            Todo("Eat some carry",true),
            Todo("Ask my crush out",false),
            Todo("Take a shower",false)
        )
val adapter = TodoAdapter(todoList)
       rvFirst.adapter= adapter
        rvFirst.layoutManager=LinearLayoutManager(this)
        btnFirst.setOnClickListener {
            val title=etFirst.text.toString()
            val todo=Todo(title,false)
            todoList.add(todo)
            adapter.notifyItemInserted(todoList.size-1)
        }
    }
}