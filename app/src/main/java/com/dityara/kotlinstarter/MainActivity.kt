package com.dityara.kotlinstarter

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    lateinit var rvClub: RecyclerView
    private var listClub: ArrayList<Club> = arrayListOf()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        rvClub = findViewById(R.id.rv_club)
        rvClub.setHasFixedSize(true)

        listClub.addAll(ClubData.listData)
        showClub()
    }

    fun showClub() {
        rvClub.layoutManager = LinearLayoutManager(this)
        val clubAdapter = ClubAdapter(listClub)
        rvClub.adapter = clubAdapter

        clubAdapter.setOnItemClickCallback(object : ClubAdapter.OnItemClickCallback {
            override fun onItemClicked(data: Club) {
                moveDetail(data)
            }

        })
    }

    private fun moveDetail(club: Club) {
        val moveIntent = Intent(this@MainActivity, DetailActivity::class.java)
        moveIntent.putExtra(DetailActivity.EXTRA_TEAM_NAME, club.name)
        moveIntent.putExtra(DetailActivity.EXTRA_TEAM_DESC, club.detail)
        moveIntent.putExtra(DetailActivity.EXTRA_TEAM_PHOTO, club.photo)
        startActivity(moveIntent)
    }


}
