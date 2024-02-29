package com.example.movieapprecyclerview

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
            "2022", // Animal
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


        recyclerView.layoutManager=LinearLayoutManager(this)

        moviesArrayList= arrayListOf<Movies>()

        for (index in moviesImageArray.indices){
            val movie=Movies(moviesName[index],moviesImageArray[index],releaseYearArray[index])
            moviesArrayList.add(movie)
        }

        recyclerView.adapter=MyAdapter(moviesArrayList,this)

    }
}