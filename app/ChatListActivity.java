package com.yourpackage

import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView
import androidx.appcompat.app.AppCompatActivity

class ChatListActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_chat_list)

        val chatList = listOf("Andi", "Budi", "Citra", "Dina", "Eko")
        val listView = findViewById<ListView>(R.id.listView)
                val adapter = ArrayAdapter(this, android.R.layout.simple_list_item_1, chatList)
        listView.adapter = adapter
    }
}
