package com.example.bankme

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import android.widget.Toast
import com.bumptech.glide.Glide
import org.w3c.dom.Text

class Dashboard : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dashboard)
        val greetingsText:TextView = findViewById(R.id.TW_greetings)

        val ss: String? = intent.getStringExtra("misho")
        greetingsText.text = "Hello $ss"

    }
}