package com.example.customlist_view_learned_from_somya_singh

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.customlist_view_learned_from_somya_singh.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var userArrayList:ArrayList<User>
    private lateinit var bindingmain: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        bindingmain = ActivityMainBinding.inflate(layoutInflater)
        enableEdgeToEdge()
        setContentView(bindingmain.root)
        ViewCompat.setOnApplyWindowInsetsListener(bindingmain.main) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        userArrayList = arrayListOf()
        val name = arrayOf("Saumya", "Prastuti", "Ankit", "Pradeep", "Aman")

        val lastMsg = arrayOf("Hey everyone", "I am fine", "Good", "Awesome", "cool")

        val lastMsgTime = arrayOf("6:25 AM", "7:30 PM", "5:00 PM", "6:25 AM", "7:30 PM")

        val phoneNumber = arrayOf("786453739", "986453739", "7366382829", "7383413440", "4159251517")

        val imgId = intArrayOf(R.drawable.pic5, R.drawable.pic1, R.drawable.pic2,
            R.drawable.pic3, R.drawable.pic4)

        userArrayList = ArrayList()

        for(eachIndex in name.indices) {
            val user = User(
                name[eachIndex], lastMsg[eachIndex], lastMsgTime[eachIndex], phoneNumber[eachIndex],
                imgId[eachIndex]
            )

            userArrayList.add(user)
        }
        val listView = bindingmain.listView
        listView.isClickable = true
        listView.adapter = MyAdapter(this, userArrayList)

    }
}