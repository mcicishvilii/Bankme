package com.example.bankme

import android.annotation.SuppressLint
import android.content.Intent
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.*

class Withdraw_activity : AppCompatActivity() {
    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_withdraw)
        val backButton:ImageButton = findViewById(R.id.back_button)
        val amount:TextView = findViewById(R.id.TW_amount_in_int)
        val amountToWithdraw:TextView = findViewById(R.id.TW_amount_activity_Withrdaw)
        val withdrawButton: Button = findViewById(R.id.BTN_withdraw_activity_withdraw)
        val moneytransferamount: EditText = findViewById(R.id.ET_money_to_transfer)

        val ss: String? = intent.getStringExtra("misho")
        amount.text = "Balance: $ss"

        backButton.setOnClickListener{
            val intent = Intent(this,Dashboard::class.java)
            startActivity(intent)
        }

        withdrawButton.setOnClickListener {
            if (moneytransferamount.text.toString().isEmpty()){
                Toast.makeText(this, "Please enter amount to transfer",Toast.LENGTH_LONG).show()
                amountToWithdraw.setTextColor(Color.RED)
            }else{
                val intent = Intent(this,Transaction_confirmed_activity::class.java)
                startActivity(intent)
            }

        }



    }
}