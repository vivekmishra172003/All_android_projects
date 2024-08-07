package com.example.customlistview

import android.os.Bundle
import android.widget.ListView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val language = arrayOf(
            "C", "C++", "Java", ".Net", "Kotlin", "Ruby", "Rails", "Python",
            "Java Script", "Php", "Ajax", "Perl", "Hadoop"
        )
        val description = arrayOf(
            "C programming is considered as the base for other programming languages",
            "C++ is an object-oriented programming language.",
            "Java is a programming language and a platform.",
            ".NET is a framework which is used to develop software applications.",
            "Kotlin is an open-source programming language, used to develop Android apps and much more.",
            "Ruby is an open-source and fully object-oriented programming language.",
            "Ruby on Rails is a server-side web application development framework written in Ruby language.",
            "Python is interpreted scripting  and object-orientedprogramming language.",
            "JavaScript is an object-based scripting language.",
            "PHP is an interpreted language, i.e., there is no need for compilation.",
            "AJAX allows you to send and receive data asynchronously without reloading the web page.",
            "Perl is a cross-platform environment used to create network and server-side applications.",
            "Hadoop is an open source framework from Apache written in Java."
        )
        val imageId = arrayOf(
            R.drawable.c16, R.drawable.cpp64, R.drawable.java50, R.drawable.kotlin50,
            R.drawable.c16, R.drawable.cpp64, R.drawable.java50, R.drawable.kotlin50,
            R.drawable.c16, R.drawable.cpp64, R.drawable.java50, R.drawable.kotlin50,
            R.drawable.kotlin50
        )

        val listView = findViewById<ListView>(R.id.listView) // Use the ID of the ListView from activity_main.xml
        val myListAdapter = MyListAdapter(this, language, description, imageId)
        listView.adapter = myListAdapter

        listView.setOnItemClickListener { adapterView, view, position, id ->
            val itemAtPos = adapterView.getItemAtPosition(position)
            val itemIdAtPos = adapterView.getItemIdAtPosition(position)
            Toast.makeText(
                this,
                "Click on item at $itemAtPos its item id $itemIdAtPos",
                Toast.LENGTH_LONG
            ).show()
        }
    }
}