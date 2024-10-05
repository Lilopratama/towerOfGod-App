package com.example.towerofgod.adapter

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.towerofgod.R
import com.example.towerofgod.activity.DetailActivity
import com.example.towerofgod.model.TogChar
import de.hdodenhof.circleimageview.CircleImageView

class ListCharAdapter(private val listChar: ArrayList<TogChar>) : RecyclerView.Adapter<ListCharAdapter.ListViewHolder>() {
    class ListViewHolder(itemView:View) : RecyclerView.ViewHolder(itemView) {
        val name: TextView = itemView.findViewById(R.id.tv_nameChar)
        val type: TextView = itemView.findViewById(R.id.tv_typeChar)
        val faction : TextView = itemView.findViewById(R.id.tv_factionChar)
        val position : TextView = itemView.findViewById(R.id.tv_positionChar)
        val photo: CircleImageView = itemView.findViewById(R.id.civ_imageChar)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ListViewHolder {
        val view: View = LayoutInflater.from(parent.context).inflate(R.layout.item_list_rows, parent, false)
        return ListViewHolder(view)
    }

    override fun getItemCount(): Int {
        return listChar.size
    }

    override fun onBindViewHolder(holder: ListViewHolder, position: Int) {
        val context = holder.itemView.context
        val togChar = listChar[position]

        holder.name.text = togChar.name
        holder.type.text = togChar.type
        holder.faction.text = togChar.faction
        holder.position.text = togChar.positionCombat
        holder.photo.setImageResource(togChar.photoChar)
        holder.itemView.setOnClickListener {
            val itemIntent = Intent(context, DetailActivity::class.java)
            itemIntent.putExtra(DetailActivity.EXTRA_NAME, togChar.name)
            itemIntent.putExtra(DetailActivity.EXTRA_DESCRIPTION, togChar.description)
            itemIntent.putExtra(DetailActivity.EXTRA_FACTION, togChar.faction)
            itemIntent.putExtra(DetailActivity.EXTRA_POSITION, togChar.positionCombat)
            itemIntent.putExtra(DetailActivity.EXTRA_RANK, togChar.rank)
            itemIntent.putExtra(DetailActivity.EXTRA_TYPE, togChar.type)
            itemIntent.putExtra(DetailActivity.EXTRA_ATTRIBUTE, togChar.attribute)
            itemIntent.putExtra(DetailActivity.EXTRA_SHINSU, togChar.shinsu)
            itemIntent.putExtra(DetailActivity.EXTRA_GENDER, togChar.gender)
            itemIntent.putExtra(DetailActivity.EXTRA_SPECIES, togChar.species)
            itemIntent.putExtra(DetailActivity.EXTRA_AGE, togChar.age)
            itemIntent.putExtra(DetailActivity.EXTRA_PHOTOCHAR, togChar.photoChar)
            itemIntent.putExtra(DetailActivity.EXTRA_PHOTOFACTION, togChar.photoFaction)
            itemIntent.putExtra(DetailActivity.EXTRA_BGCHAR, togChar.bgChar)
            context.startActivity(itemIntent)
        }

    }
}