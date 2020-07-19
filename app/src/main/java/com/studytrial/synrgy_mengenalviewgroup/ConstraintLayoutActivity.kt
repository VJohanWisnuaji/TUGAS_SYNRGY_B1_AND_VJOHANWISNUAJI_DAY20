package com.studytrial.synrgy_mengenalviewgroup

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.studytrial.synrgy_mengenalviewgroup.databinding.ActivityConstraintLayoutBinding
import kotlinx.android.synthetic.main.activity_card_view.*


class ConstraintLayoutActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_constraint_layout)

        val binding = ActivityConstraintLayoutBinding.inflate(layoutInflater)

        binding.progressBar.max = 50
        binding.progressBar2.max = 50
        binding.progressBar3.max = 50

        binding.ibAdd1.setOnClickListener{
            binding.progressBar.max += 10
        }

        binding.ibAdd2.setOnClickListener{
            binding.progressBar2.max += 10
        }
        binding.ibAdd3.setOnClickListener{
            binding.progressBar3.max += 10
        }

        binding.ibMin1.setOnClickListener{
            binding.progressBar.max -= 10
        }

        binding.ibMin2.setOnClickListener{
            binding.progressBar2.max -= 10
        }
        binding.ibMin3.setOnClickListener{
            binding.progressBar3.max -= 10
        }


        setContentView(binding.root)
        fab_home.setOnClickListener {
            startActivity(Intent(this, MainActivity::class.java))
        }

    }
}