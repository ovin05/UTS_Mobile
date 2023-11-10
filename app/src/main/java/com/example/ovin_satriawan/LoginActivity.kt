package com.example.ovin_satriawan

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.ovin_satriawan.databinding.ActivityLoginBinding

class HalamanLoginActivity : AppCompatActivity() {
    private lateinit var binding : ActivityLoginBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityLoginBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.loginButton.setOnClickListener {
            val username = binding.usernameEditText.text.toString()
            val password = binding.passwordEditText.text.toString()
            val gagal: String= "gagal login"
            if ( username == "stmiklombok" && password == "1234"){
                val moveIntent = Intent(this@HalamanLoginActivity, HitungLuasActivity::class.java)
                startActivity(moveIntent)
            }else{
                binding.tulisan.text = gagal
            }
        }
    }
}