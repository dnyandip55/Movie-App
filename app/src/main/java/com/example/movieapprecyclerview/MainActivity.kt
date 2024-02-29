package com.example.movieapprecyclerview

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    lateinit var recyclerView:RecyclerView
    lateinit var  moviesArrayList:ArrayList<Movies>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        recyclerView=findViewById(R.id.recyclerView)
        val moviesImageArray= arrayOf(R.drawable.a,
            R.drawable.b,
            R.drawable.c,
            R.drawable.d,
            R.drawable.e,
            R.drawable.f,
            R.drawable.g,
            R.drawable.h,
            R.drawable.i,
            R.drawable.j,
            R.drawable.k,
            R.drawable.l,
            R.drawable.m,
            R.drawable.n,
            R.drawable.o,
            R.drawable.p,
            R.drawable.r,
            R.drawable.s,
            R.drawable.t,
            R.drawable.u,
        )

        val moviesName= arrayOf("Animal","Baaghi","Chennai Express","Dabangg","Ek Villain","Force","Gabbar is back",
                "Happy New Year","I","Jay ho","Kick","Laal Singh Chadha","M.S. Dhoni :The Untold Story","Neerja",
                    "OMG 2","PK","RRR","Saaho","Tanhaji:The Unsung warrior ","URI:The sergical strike")

        val releaseYearArray= arrayOf(
            "2023", // Animal
            "2016", // Baaghi
            "2013", // Chennai Express
            "2010", // Dabangg
            "2014", // Ek Villain
            "2011", // Force
            "2015", // Gabbar is back
            "2014", // Happy New Year
            "2015", // I
            "2014", // Jay ho
            "2014", // Kick
            "2022", // Laal Singh Chadha
            "2016", // M.S. Dhoni :The Untold Story
            "2016", // Neerja
            "2023", // OMG 2
            "2014", // PK
            "2023", // RRR
            "2019", // Saaho
            "2020", // Tanhaji:The Unsung warrior
            "2019"
        )

        val castArray = arrayOf(
            "Ranbir Kapoor ,Tripti Dimpari ,Rashmika Mandana",
            "Tiger Shroff,Shraddha Kapoor",
            "Shah Rukh Khan,Deepika Padukone",
            "Salman Khan ,Sonakshi Sinha",
            "Sidharth Malohtra,Riteish Deshmukh,Shradha Kapoor",
            "John Abraham ,Genelia",
            "Akshay Kumar,Sruti Hasan",
            "Shah Rukh Khan,Deepika Padukone",
            "Vikram,Amy Jakson",
            "Salman khan ,Daisy Shah",
            "Salman Khan ,Jacqueline Fernandez",
            "Aamir Khan ,Karina Kapoor",
            "Sushant Singh Rajput ,Kiara Advani,Disha Patani",
            "Sonam Kapoor",
            "Pankaj Tripathi ,AKshay Kumar,Yami Gautam",
            "Aamir Khan , Anushka Sharma",
            "Ram Charan , Jr N.T Rama Rao",
            "Prabhas ,Shradha Kapoor",
            "Ajay Devgan , Kajol ",
            "Vicky Kaushal,Yami Gautam"


        )

        val synopsisArray = arrayOf(
            R.string.animal,R.string.baaghi,R.string.chennai_express,R.string.dabangg,R.string.ek_villain,R.string.force,
            R.string.gabbar_is_back,R.string.happy_new_year,R.string.i,R.string.jay_ho,R.string.kick,R.string.laal_singh_chadha,
            R.string.dhoni,R.string.neerja,R.string.omg,R.string.pk,R.string.rrr,R.string.saaho,R.string.tanhaji,R.string.uri
        )

//        val castImagesList= listOf(listOf( R.drawable.cast1_movie1,R.drawable.cast2_movie_1),
//            listOf(R.drawable.cast1_movie2,R.drawable.cast2_movie2,R.drawable.movie2_cast3,R.drawable.movie2_cast4,R.drawable.movie2_cast5),
//
//            listOf(R.drawable.cast1_movie1,R.drawable.cast2_movie_1),
//            listOf(R.drawable.cast1_movie1,R.drawable.cast2_movie_1),
//            listOf(R.drawable.cast1_movie1,R.drawable.cast2_movie_1),
//            listOf(R.drawable.cast1_movie1,R.drawable.cast2_movie_1),
//            listOf(R.drawable.cast1_movie1,R.drawable.cast2_movie_1),
//            listOf(R.drawable.cast1_movie1,R.drawable.cast2_movie_1),
//            listOf(R.drawable.cast1_movie1,R.drawable.cast2_movie_1),
//            listOf(R.drawable.cast1_movie1,R.drawable.cast2_movie_1),
//            listOf(R.drawable.cast1_movie1,R.drawable.cast2_movie_1),
//            listOf(R.drawable.cast1_movie1,R.drawable.cast2_movie_1),
//            listOf(R.drawable.cast1_movie1,R.drawable.cast2_movie_1),
//            listOf(R.drawable.cast1_movie1,R.drawable.cast2_movie_1),
//            listOf(R.drawable.cast1_movie1,R.drawable.cast2_movie_1),
//            listOf(R.drawable.cast1_movie1,R.drawable.cast2_movie_1),
//            listOf(R.drawable.cast1_movie1,R.drawable.cast2_movie_1),
//            listOf(R.drawable.cast1_movie1,R.drawable.cast2_movie_1),
//            listOf(R.drawable.cast1_movie1,R.drawable.cast2_movie_1),
//            listOf(R.drawable.cast1_movie1,R.drawable.cast2_movie_1),
//
//        )

        recyclerView.layoutManager=LinearLayoutManager(this)

        moviesArrayList= arrayListOf<Movies>()

        for (index in moviesImageArray.indices){
            val movie=Movies(moviesName[index],moviesImageArray[index],releaseYearArray[index],castArray[index],synopsisArray[index],castArray[index])
            moviesArrayList.add(movie)
        }

        recyclerView.adapter = MyAdapter(moviesArrayList) { movie ->
            val intent = Intent(this@MainActivity, MovieDetailActivity::class.java)
            intent.putExtra("movie_name", movie.movieName)
            intent.putExtra("movie_poster", movie.moviePoster)
            intent.putExtra("movie_cast", movie.cast)
            intent.putExtra("movie_synopsis", getString(movie.synopsis))
            startActivity(intent)
        }



    }
}