package com.example.peliculas

class FilmProvider {
    companion object{


    val filmList = listOf<Film>(
        Film(
            title = "Fast And Furious 8",
            director="Alberto Pescador",
            year = 2020,
            photo="https://i.blogs.es/09b647/googlefotos/1366_2000.jpg"
        ),
        Film(
            title = "Fast And Furious 7",
            director="Alberto Pespi",
            year = 2000,
            photo="https://i.blogs.es/09b647/googlefotos/1366_2000.jpg"
        ),
        Film(
            title = "Changanilla in action",
            director = "Chorros",
            year = 2030,
            photo = "https://i.blogs.es/09b647/googlefotos/1366_2000.jpg"
        ),
        Film(
            title = "Chorros sin fronteras",
            director ="Manuel",
            year = 2022,
            photo = "https://i.blogs.es/09b647/googlefotos/1366_2000.jpg"
        ),
        Film(
            title = "Juliancanteflamenco",
            director="Julian Pescador",
            year = 2008,
            photo = "https://i.blogs.es/09b647/googlefotos/1366_2000.jpg"
        )
    )
}
}