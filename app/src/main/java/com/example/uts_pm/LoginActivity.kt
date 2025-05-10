package com.example.uts_pm

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity

class LoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        val etEmail = findViewById<EditText>(R.id.etEmail)
        val etPassword = findViewById<EditText>(R.id.etPassword)
        val btnLogin = findViewById<Button>(R.id.btnLogin)
        val btnToRegister = findViewById<Button>(R.id.btnToRegister)

        btnLogin.setOnClickListener {
            Log.d("LoginActivity", "Tombol Login ditekan")

            val email = etEmail.text.toString()
            val password = etPassword.text.toString()

            val sharedPref = getSharedPreferences("UserData", MODE_PRIVATE)
            val savedEmail = sharedPref.getString("email", null)
            val savedPassword = sharedPref.getString("password", null)

            if (email == savedEmail && password == savedPassword) {
                startActivity(Intent(this, HomeActivity::class.java))
                finish()
            } else {
                Toast.makeText(this, "Email atau Password salah", Toast.LENGTH_SHORT).show()
            }


            btnToRegister.setOnClickListener {
                Log.d("LoginActivity", "Tombol Daftar ditekan")
                Toast.makeText(this, "Menuju halaman daftar", Toast.LENGTH_SHORT).show()

                startActivity(Intent(this, RegisterActivity::class.java))
            }
        }
    }
}