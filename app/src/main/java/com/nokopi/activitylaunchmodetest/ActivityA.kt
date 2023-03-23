package com.nokopi.activitylaunchmodetest

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import com.nokopi.activitylaunchmodetest.databinding.ActivityABinding
import androidx.databinding.DataBindingUtil

class ActivityA : AppCompatActivity() {
    private lateinit var binding: ActivityABinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this,R.layout.activity_a)
        var intentB = Intent(this, ActivityB::class.java)

        binding.singleTopChip.setOnCheckedChangeListener { _, isChecked ->
            intentB = if (isChecked) {
                Intent(this, ActivityB::class.java).setFlags(Intent.FLAG_ACTIVITY_SINGLE_TOP)
            } else {
                Intent(this, ActivityB::class.java)
            }
        }

    }
}