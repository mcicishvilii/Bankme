package com.example.bankme

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Transaction_confirmed_activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_transaction_confirmed)

        val closeButton:Button = findViewById(R.id.btn_close)


        closeButton.setOnClickListener {
            val intent = Intent(this,Dashboard::class.java)
            startActivity(intent)
        }



    }
}