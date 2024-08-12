package com.example.customlist_view_learned_from_somya_singh

import android.app.Activity
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.TextView
import de.hdodenhof.circleimageview.CircleImageView

class MyAdapter(val context: Activity,val arrayList:ArrayList<User>) : ArrayAdapter<User>(context,R.layout.eachitem,arrayList){
    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
        val inflater = context.layoutInflater
        val view = inflater.inflate(R.layout.eachitem,null)
        val image = view.findViewById<CircleImageView>(R.id.profile_image)
        val name = view.findViewById<TextView>(R.id.tVName)
        val lastMsg = view.findViewById<TextView>(R.id.tVLastMessage)
        val lastMsgTime = view.findViewById<TextView>(R.id.tVLastMsgTime)
        name.text = arrayList[position].name
        lastMsg.text = arrayList[position].lastmsg
        lastMsgTime.text = arrayList[position].lastmsgtime
        image.setImageResource(arrayList[position].ImageId)


        return view
    }
}