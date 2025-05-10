package com.example.uts_pm

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.ImageView
import android.widget.TextView

class EbookAdapter(
    private val context: Context,
    private val ebooks: List<Ebook>
) : ArrayAdapter<Ebook>(context, 0, ebooks) {

    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
        val ebook = ebooks[position]
        val view = convertView ?: LayoutInflater.from(context).inflate(R.layout.item_ebook, parent, false)

        val imgEbook = view.findViewById<ImageView>(R.id.imgEbook)
        val tvEbookTitle = view.findViewById<TextView>(R.id.tvEbookTitle)

        imgEbook.setImageResource(ebook.imageResId)
        tvEbookTitle.text = ebook.title

        return view
    }
}