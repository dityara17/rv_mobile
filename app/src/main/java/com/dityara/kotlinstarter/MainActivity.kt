package com.dityara.kotlinstarter

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    lateinit var rvClub : RecyclerView
    private var listClub : ArrayList<Club> = arrayListOf()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        rvClub = findViewById(R.id.rv_club)
        rvClub.setHasFixedSize(true)

        listClub.addAll(ClubData.listData)
        showClub()
    }

    fun showClub(){
        rvClub.layoutManager = LinearLayoutManager(this)
        val clubAdapter = ClubAdapter(listClub)
        rvClub.adapter = clubAdapter
    }
}
