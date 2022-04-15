package com.example.bankme

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import com.bumptech.glide.Glide
import org.w3c.dom.Text

class Dashboard : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dashboard)

        val addButton: Button = findViewById(R.id.BTN_add)
        val withdrawButton: Button = findViewById(R.id.BTN_withdraw)
        val greetingsText:TextView = findViewById(R.id.TW_greetings)

        val ss: String? = intent.getStringExtra("misho")
        greetingsText.text = "Hello $ss"


        withdrawButton.setOnClickListener {
            val intent = Intent(this,Withdraw_activity::class.java)
            intent.putExtra("misho",findViewById<TextView>(R.id.TW_money).text.toString())
            startActivity(intent)
        }




    }
}