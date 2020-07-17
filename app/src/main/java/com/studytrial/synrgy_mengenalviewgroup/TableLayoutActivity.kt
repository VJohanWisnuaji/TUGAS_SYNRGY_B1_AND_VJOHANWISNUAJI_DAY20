package com.studytrial.synrgy_mengenalviewgroup

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_frame_layout.*

class TableLayoutActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_table_layout)

        ib_home.setOnClickListener {
            startActivity(Intent(this, MainActivity::class.java))
        }
    }
}