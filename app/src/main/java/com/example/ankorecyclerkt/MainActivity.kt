package com.example.ankorecyclerkt

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        recyclerView.layoutManager = LinearLayoutManager(this)

        val list : ArrayList<Movie> = arrayListOf()
        list.add(Movie("Sharelock Holmes", 2009))
        list.add(Movie("The Shawshank Redemption",1994))
        list.add(Movie("Forrest Gump",1994))
        list.add(Movie("Titanic",1997))
        list.add(Movie("Taxi",1998))
        list.add(Movie("Inception",1994))
        list.add(Movie("The Imitation Game",2014))
        list.add(Movie("Sharelock Holmes", 2009))
        list.add(Movie("The Shawshank Redemption",1994))
        list.add(Movie("Forrest Gump",1994))
        list.add(Movie("Titanic",1997))
        list.add(Movie("Taxi",1998))
        list.add(Movie("Inception",1994))
        list.add(Movie("The Imitation Game",2014))
        list.add(Movie("Sharelock Holmes", 2009))
        list.add(Movie("The Shawshank Redemption",1994))
        list.add(Movie("Forrest Gump",1994))
        list.add(Movie("Titanic",1997))
        list.add(Movie("Taxi",1998))
        list.add(Movie("Inception",1994))
        list.add(Movie("The Imitation Game",2014))
        list.add(Movie("Sharelock Holmes", 2009))
        list.add(Movie("The Shawshank Redemption",1994))
        list.add(Movie("Forrest Gump",1994))
        list.add(Movie("Titanic",1997))
        list.add(Movie("Taxi",1998))
        list.add(Movie("Inception",1994))
        list.add(Movie("The Imitation Game",2014))


        recyclerView.adapter = MovieAdapter(list)
    }
}
