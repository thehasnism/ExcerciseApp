package com.hasnicodes.excercise

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.hasnicodes.excercise.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    private var isDark = false
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.timeTxtView.text = getCurrentTime()
        binding.dayTextview.text = getCurrentDay()
        binding.dateTextView.text = getCurrentDateDetail()

        binding.onOffBtn.setOnClickListener {
            isDark = !isDark
            enableDarkMode(isDark)

        }
    }
}