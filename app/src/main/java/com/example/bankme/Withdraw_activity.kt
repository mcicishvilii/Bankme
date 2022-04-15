package com.example.bankme

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton
import android.widget.TextView

class Withdraw_activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_withdraw)
        val backButton:ImageButton = findViewById(R.id.back_button)
        val amount:TextView = findViewById(R.id.TW_amount_in_int)
        val withdrawButton: Button = findViewById(R.id.BTN_withdraw_activity_withdraw)

        val ss: String? = intent.getStringExtra("misho")
        amount.text = "Balance: $ss"

        backButton.setOnClickListener{
            val intent = Intent(this,Dashboard::class.java)
            startActivity(intent)
        }

        withdrawButton.setOnClickListener {
            val intent = Intent(this,Transaction_confirmed_activity::class.java)
            startActivity(intent)
        }



    }
}