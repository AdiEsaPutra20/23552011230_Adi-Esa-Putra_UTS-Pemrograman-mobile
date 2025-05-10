package com.yourpackage

import android.content.Intent
import android.os.Bundle
import android.widget.*
import androidx.appcompat.app.AppCompatActivity

class LoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        val email = findViewById<EditText>(R.id.etEmail)
                val password = findViewById<EditText>(R.id.etPassword)
                val loginBtn = findViewById<Button>(R.id.btnLogin)
                val registerText = findViewById<TextView>(R.id.tvRegister)

                loginBtn.setOnClickListener {
            val emailText = email.text.toString()
            val passText = password.text.toString()

            if (emailText == "user@mail.com" && passText == "123456") {
                startActivity(Intent(this, ChatListActivity::class.java))
            } else {
                Toast.makeText(this, "Login Gagal", Toast.LENGTH_SHORT).show()
            }
        }

        registerText.setOnClickListener {
            startActivity(Intent(this, RegisterActivity::class.java))
        }
    }
}
