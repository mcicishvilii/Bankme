package com.example.bankme

import android.content.Intent
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.bankme.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.BTNLogin.setOnClickListener {
            if (binding.ETPassword.text.toString() == "admin"){
                val intent = Intent(this,Dashboard::class.java)
                startActivity(intent)
            }
            else{
                Toast.makeText(this,"WRONG PASSWORD",Toast.LENGTH_SHORT).show()
                binding.ETPassword.setBackgroundResource(R.drawable.rounded_rectangle)
                binding.TWPassword.setTextColor(Color.RED)
            }
        }





    }
}