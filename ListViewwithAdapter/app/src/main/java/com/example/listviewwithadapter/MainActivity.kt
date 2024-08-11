package com.example.listviewwithadapter

import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView
import android.widget.TextView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.listviewwithadapter.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        enableEdgeToEdge()
        setContentView(binding.root)
        ViewCompat.setOnApplyWindowInsetsListener(binding.main) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
//        val listview = findViewById<ListView>(R.id.lw_tasks)
        val tasklist = arrayListOf<String>()
        tasklist.add("Task 1")
        tasklist.add("Task 2")
        tasklist.add("Task 3")
        tasklist.add("Task 4")
        tasklist.add("Task 5")
        val adapterForMyListView = ArrayAdapter(this, android.R.layout.simple_list_item_1, tasklist)
        binding.lwTasks.adapter = adapterForMyListView

        binding.lwTasks.setOnItemClickListener{parent,view,position,id->
            val text = "Clicked on item : "+ (view as TextView).text.toString()
            Toast.makeText(this,text,Toast.LENGTH_SHORT).show()
        }
    }
}