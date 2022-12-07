package com.intsyslab.nestedrecyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.intsyslab.nestedrecyclerview.adapter.MainAdapter
import com.intsyslab.nestedrecyclerview.databinding.ActivityMainBinding
import com.intsyslab.nestedrecyclerview.utils.SampleData

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.apply {
            rvMain.adapter = MainAdapter(SampleData.collections)
        }
    }
}