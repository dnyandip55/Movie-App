package com.example.movieapprecyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MovieDetailActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_movie_detail)

        val movieName = intent.getStringExtra("movie_name")
        val moviePoster = intent.getIntExtra("movie_poster", R.drawable.default_poster)
        val movieCast = intent.getStringExtra("movie_cast")
        val movieSynopsis = intent.getStringExtra("movie_synopsis")

        // Update views with movie details
        findViewById<TextView>(R.id.movieName).text = movieName
        findViewById<ImageView>(R.id.imagePoster).setImageResource(moviePoster)
        findViewById<TextView>(R.id.cast).text = "Cast: $movieCast"
        findViewById<TextView>(R.id.synopsis).text = movieSynopsis


    }
}