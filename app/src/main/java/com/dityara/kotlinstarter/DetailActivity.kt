package com.dityara.kotlinstarter

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import com.bumptech.glide.Glide

class DetailActivity : AppCompatActivity() {

    companion object{
        const val EXTRA_TEAM_NAME = "extra_team_name"
        const val EXTRA_TEAM_DESC = "extra_team_desc"
        const val EXTRA_TEAM_PHOTO = "extra_team_photo"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)

        val tvName : TextView = findViewById(R.id.tv_team_name)
        val tvDesc : TextView = findViewById(R.id.tv_team_desc)
        val imgTeam : ImageView = findViewById(R.id.img_detail_photo)

        val name = intent.getStringExtra(EXTRA_TEAM_NAME)
        val desc = intent.getStringExtra(EXTRA_TEAM_DESC)
        val photo = intent.getStringExtra(EXTRA_TEAM_PHOTO)

        tvDesc.text = desc
        tvName.text = name

        Glide.with(applicationContext)
            .load(photo)
            .override(200,200)
            .into(imgTeam)

    }
}
