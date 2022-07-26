package com.example.firebase2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.PopupMenu
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.firebase2.adapter.ItemAdapter
import kotlinx.android.synthetic.main.activity_home_page.*

class HomePage : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home_page)

        recycle_view_items.layoutManager = LinearLayoutManager(this)
        val itemAdapter = ItemAdapter(this, getItemsList())
        recycle_view_items.adapter= itemAdapter

        menu.setOnClickListener {
            val popupMenu= PopupMenu(this,it)
            popupMenu.setOnMenuItemClickListener { item ->
                when(item.itemId){
                    R.id.home -> {
                        val intent = Intent(this, HomePage::class.java)
                        startActivity(intent)
                        true
                    }
                    R.id.profile -> {
                        val intent = Intent(this, Profile::class.java)
                        startActivity(intent)
                        true
                    }
                    else -> false
                }
            }
            popupMenu.inflate(R.menu.menu)
            popupMenu.show()
        }
    }

    override fun onBackPressed() {
        //super.onBackPressed()
        //Toast.makeText(this, "Cant", Toast.LENGTH_SHORT).show()
    }

    private fun getItemsList(): ArrayList<String> {
        val list= ArrayList<String>()
        for (i in 1..3){
            list.add("Item $i")
        }
        return list
    }
}