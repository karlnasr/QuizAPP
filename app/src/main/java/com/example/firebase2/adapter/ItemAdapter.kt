package com.example.firebase2.adapter

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.firebase2.EducationQuestions
import com.example.firebase2.MusicQuestions
import com.example.firebase2.R
import com.example.firebase2.SportsQuestions
import kotlinx.android.synthetic.main.item_custom.view.*

class ItemAdapter(val context: Context, val items: ArrayList<String>) :
    RecyclerView.Adapter<ItemAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemAdapter.ViewHolder {
        return ViewHolder(
            LayoutInflater.from(context).inflate(
                R.layout.item_custom,
                parent,
                false
            )
        )
    }


    override fun onBindViewHolder(holder: ItemAdapter.ViewHolder, position: Int) {
        val item = items.get(position)
        if (position == 0) {
            holder.tvItem.text = "Music"
            holder.itemImage.setImageResource(R.drawable.ic_music)
            holder.playBtn.setOnClickListener {
                val context = holder.playBtn.context
                val intent = Intent(context, MusicQuestions::class.java)
                context.startActivity(intent)
            }
        }
        if (position == 1) {
            holder.tvItem.text = "Sports"
            holder.itemImage.setImageResource(R.drawable.ic_soccer)
            holder.playBtn.setOnClickListener {
                val context = holder.playBtn.context
                val intent = Intent(context, SportsQuestions::class.java)
                context.startActivity(intent)
            }
        }
        if(position == 2){
            holder.tvItem.text="Education"
            holder.itemImage.setImageResource(R.drawable.ic_school)
            holder.playBtn.setOnClickListener {
                val context = holder.playBtn.context
                val intent = Intent(context, EducationQuestions::class.java)
                context.startActivity(intent)
            }
        }
    }

    override fun getItemCount(): Int {
        return items.size
    }

    class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val tvItem = view.tv_item_name
        val cardviewItem = view.card_view_tem
        val itemImage = view.item_image
        val playBtn = view.playbtn
    }
}