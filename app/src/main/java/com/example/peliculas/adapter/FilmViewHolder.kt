package com.example.peliculas.adapter

import android.view.View
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.peliculas.Film
import com.example.peliculas.databinding.ItemFilmBinding

class FilmViewHolder(view: View):RecyclerView.ViewHolder(view) {

    val binding = ItemFilmBinding.bind(view)

    fun render (filmModel:Film){
        binding.FilmName.text = filmModel.title
        binding.FilmDirector.text = filmModel.director
        binding.FilmYear.text = filmModel.year.toString()
        Glide.with(binding.FilmPhoto.context).load(filmModel.photo).into(binding.FilmPhoto)
        binding.FilmPhoto.setOnClickListener{Toast.makeText(binding.FilmPhoto.context, filmModel.title, Toast.LENGTH_LONG).show()}
        itemView.setOnClickListener{Toast.makeText(binding.FilmPhoto.context, filmModel.director, Toast.LENGTH_LONG).show()}
    }
}