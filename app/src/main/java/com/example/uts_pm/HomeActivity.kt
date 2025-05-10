package com.example.uts_pm

import android.os.Bundle
import android.util.Log
import android.widget.ListView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class HomeActivity : AppCompatActivity() {

    private lateinit var ebookListView: ListView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        ebookListView = findViewById(R.id.ebookListView)
        val ebookList = listOf(
            Ebook("Belajar Kotlin Dasar", R.drawable.ic_book),
            Ebook("Panduan Android Studio", R.drawable.ic_book),
            Ebook("Kumpulan Cerpen Nusantara", R.drawable.ic_book),
            Ebook("Tips UI/UX Aplikasi Mobile", R.drawable.ic_book),
            Ebook("Teknik Membuat Aplikasi Sukses", R.drawable.ic_book),
            Ebook("Algoritma dan Struktur Data", R.drawable.ic_book),
            Ebook("Filsafat Ilmu Modern", R.drawable.ic_book),
            Ebook("Pemrograman Java Lanjutan", R.drawable.ic_book),
            Ebook("Design Thinking untuk Pemula", R.drawable.ic_book),
            Ebook("Panduan Freelance Developer", R.drawable.ic_book),
            Ebook("Machine Learning Sederhana", R.drawable.ic_book),
            Ebook("Literasi Digital Generasi Z", R.drawable.ic_book),
            Ebook("Mengenal UI Jetpack Compose", R.drawable.ic_book),
            Ebook("Cerita Rakyat Nusantara", R.drawable.ic_book),
            Ebook("Kumpulan Puisi Romantis", R.drawable.ic_book)
        )

        val adapter = EbookAdapter(this, ebookList)
        ebookListView.adapter = adapter

        ebookListView.setOnItemClickListener { _, _, position, _ ->
            val selectedBook = ebookList[position]
            Toast.makeText(this, "Membuka: ${selectedBook.title}", Toast.LENGTH_SHORT).show()
            Log.d("HomeActivity", "Klik: ${selectedBook.title}")
        }

    }

}