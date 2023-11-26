package com.wenpenglee.navigationbar

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.google.android.material.snackbar.Snackbar
import com.wenpenglee.navigationbar.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.bottomNavigation.selectedItemId = R.id.page_1

        binding.bottomNavigation.setOnItemSelectedListener {item ->
            when(item.itemId) {
                R.id.page_1 -> {
                    true
                }
                R.id.page_2 -> {
                    showSnackBar()
                    true
                }
                R.id.page_3 -> {
                    showSnackBar()
                    true
                }
                R.id.page_4 -> {
                    showSnackBar()
                    true
                }
                else -> false
            }

        }
    }
    private fun showSnackBar() {
        val contextView = findViewById<View>(R.id.bottom_navigation)
        Snackbar.make(contextView, R.string.unavailable, Snackbar.LENGTH_SHORT)
            .show()
    }
}