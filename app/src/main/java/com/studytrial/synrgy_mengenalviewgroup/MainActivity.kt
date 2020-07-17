package com.studytrial.synrgy_mengenalviewgroup

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_constraint_layout.*
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btn_scroll_view.setOnClickListener{
            startActivity(Intent(this,ScrollViewActivity::class.java))
        }

        btn_grid_layout.setOnClickListener{
            startActivity(Intent(this,GridLayoutActivity::class.java))
        }

        btn_table_layout.setOnClickListener{
            startActivity(Intent(this,TableLayoutActivity::class.java))
        }

        btn_frame_layout.setOnClickListener{
            startActivity(Intent(this,FrameLayoutActivity::class.java))
        }

        btn_card_view.setOnClickListener{
            startActivity(Intent(this,CardViewActivity::class.java))
        }

        btn_relative_layout.setOnClickListener{
            startActivity(Intent(this,RelativeLayoutActivity::class.java))
        }

        btn_constraint_layout.setOnClickListener{
            startActivity(Intent(this,ConstraintLayoutActivity::class.java))
        }
    }
}