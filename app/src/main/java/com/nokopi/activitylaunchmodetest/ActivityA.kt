package com.nokopi.activitylaunchmodetest

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

        binding.singleTopChip.setOnCheckedChangeListener { buttonView, isChecked ->
            Toast.makeText(this, "aaaa", Toast.LENGTH_SHORT).show()
            Log.i("aaa","aaa")
        }

    }
}