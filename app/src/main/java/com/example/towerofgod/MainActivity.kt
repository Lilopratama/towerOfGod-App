package com.example.towerofgod

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.towerofgod.activity.AboutActivity
import com.example.towerofgod.adapter.ListCharAdapter
import com.example.towerofgod.database.CharacterData
import com.example.towerofgod.model.TogChar

class MainActivity : AppCompatActivity() {

    private lateinit var rvParent: RecyclerView
    private var list: ArrayList<TogChar> = arrayListOf()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val actionbar = supportActionBar
        actionbar!!.title = "Tower Of God"

        rvParent = findViewById(R.id.rv_parent)
        rvParent.setHasFixedSize(true)

        list.addAll(CharacterData.listData)
        showRecycleList()
    }

    private fun showRecycleList() {
        rvParent.layoutManager = LinearLayoutManager(this)
        val listCharAdapter = ListCharAdapter(list)
        rvParent.adapter = listCharAdapter
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.main_menu, menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        setMode(item.itemId)
        return super.onOptionsItemSelected(item)
    }

    private fun setMode(selectedMode: Int) {
        when(selectedMode) {
            R.id.about -> {
                val myAbout = Intent(this, AboutActivity::class.java)
                startActivity(myAbout)
            }
        }
    }
}