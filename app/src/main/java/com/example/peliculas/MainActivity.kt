package com.example.peliculas

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.peliculas.adapter.FilmAdapter
import com.example.peliculas.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityMainBinding.inflate(layoutInflater)
        //val decoration = DividerItemDecoration(this, LinearLayoutManager.VERTICAL)
        val manager = LinearLayoutManager(this)
        setContentView(binding.root)

        binding.recycler.layoutManager = LinearLayoutManager(this)
        binding.recycler.adapter = FilmAdapter(FilmProvider.filmList)
        //binding.recycler.addItemDecoration(decoration)

    }
}