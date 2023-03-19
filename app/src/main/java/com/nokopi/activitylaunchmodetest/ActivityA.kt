package com.nokopi.activitylaunchmodetest

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.nokopi.activitylaunchmodetest.databinding.ActivityABinding
import androidx.databinding.DataBindingUtil

class ActivityA : AppCompatActivity() {
    private lateinit var binding: ActivityABinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this,R.layout.activity_a)

        binding.singleTopChip.setOnCloseIconClickListener {

        }

    }
}