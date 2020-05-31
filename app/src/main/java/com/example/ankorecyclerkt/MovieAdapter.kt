package com.example.ankorecyclerkt

import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import org.jetbrains.anko.AnkoContext

class MovieAdapter(var list: ArrayList<Movie> = arrayListOf())
    : RecyclerView.Adapter<MovieAdapter.ViewHolder> (){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(MoviewUi().createView(AnkoContext.create(parent.context, parent)))
    }

    override fun onBindViewHolder(holder: MovieAdapter.ViewHolder, position: Int) {
        val movie = list[position]
        holder.tvTitle.text = movie.title
        holder.tvYear.text = "${movie.year}"
    }

    override fun getItemCount(): Int {
        return list.size
    }

    inner class ViewHolder(itemView : View) : RecyclerView.ViewHolder(itemView) {
        var tvTitle : TextView
        var tvYear : TextView

        init {
            tvTitle = itemView.findViewById(MoviewUi.tvTitleId)
            tvYear = itemView.findViewById(MoviewUi.tvYearId)
        }
    }




}