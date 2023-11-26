package com.example.mytestingapp

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity(), View.OnClickListener {
    private var btnSetValue: Button? = null
    private lateinit var tvText: TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        tvText   = findViewById(R.id.tv_text)
        btnSetValue = findViewById(R.id.btn_set_value)
    }

    override fun onClick(v: View) {
       if (v.id == R.id.btn_set_value) {
           tvText.text = "19"
       }
    }

    companion object {
        private const val TAG = "MainActivity"
    }
}