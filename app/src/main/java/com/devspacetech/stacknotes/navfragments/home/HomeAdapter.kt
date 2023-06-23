package com.devspacetech.stacknotes.navfragments.home

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.recyclerview.widget.RecyclerView
import com.devspacetech.stacknotes.R

class HomeAdapter(private val dataSet: ArrayList<HomeDetails>) :
    RecyclerView.Adapter<HomeAdapter.ViewHolder>() {

    class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val homeImages: ImageView

        init {
            homeImages = view.findViewById(R.id.home_image_views)
        }
    }

    override fun onCreateViewHolder(viewGroup: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(viewGroup.context)
            .inflate(R.layout.fragment_home_items, viewGroup, false)

        return ViewHolder(view)
    }

    override fun onBindViewHolder(viewHolder: ViewHolder, position: Int) {

        val homeImages: HomeDetails = dataSet[position]
        viewHolder.homeImages.setImageResource(homeImages.homeImageIcon)
    }

    override fun getItemCount() = dataSet.size

}