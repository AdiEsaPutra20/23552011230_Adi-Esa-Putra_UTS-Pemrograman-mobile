package com.yourpackage

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.*
import androidx.appcompat.app.AppCompatActivity

class RegisterActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)

        val name = findViewById<EditText>(R.id.etName)
                val email = findViewById<EditText>(R.id.etEmail)
                val password = findViewById<EditText>(R.id.etPassword)
                val registerBtn = findViewById<Button>(R.id.btnRegister)

                registerBtn.setOnClickListener {
            val userName = name.text.toString()
            val userEmail = email.text.toString()

            Log.d("REGISTER", "User: $userName, Email: $userEmail")
            Toast.makeText(this, "Register berhasil untuk $userName", Toast.LENGTH_SHORT).show()
            startActivity(Intent(this, LoginActivity::class.java))
        }
    }
}
