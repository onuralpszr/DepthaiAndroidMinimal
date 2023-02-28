package com.example.depthaiandroid

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.depthaiandroid.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // Example of a call to a native method
        binding.sampleText.text = stringFromJNI()
    }

    private external fun stringFromJNI(): String

    companion object {
        // Used to load the 'depthaiandroid' library on application startup.
        init {
            System.loadLibrary("depthaiandroid")
        }
    }
}