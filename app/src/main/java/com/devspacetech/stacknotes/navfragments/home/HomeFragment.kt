package com.devspacetech.stacknotes.navfragments.home

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.DefaultItemAnimator
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.devspacetech.stacknotes.R

class HomeFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        return inflater.inflate(R.layout.fragment_home, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val homeImageList = ArrayList<HomeDetails>()
        homeImageList.add(HomeDetails(R.drawable.ic_placeholder))
        homeImageList.add(HomeDetails(R.drawable.ic_placeholder))
        homeImageList.add(HomeDetails(R.drawable.ic_placeholder))
        homeImageList.add(HomeDetails(R.drawable.ic_placeholder))
        homeImageList.add(HomeDetails(R.drawable.ic_placeholder))
        homeImageList.add(HomeDetails(R.drawable.ic_placeholder))
        homeImageList.add(HomeDetails(R.drawable.ic_placeholder))
        homeImageList.add(HomeDetails(R.drawable.ic_placeholder))
        homeImageList.add(HomeDetails(R.drawable.ic_placeholder))
        homeImageList.add(HomeDetails(R.drawable.ic_placeholder))


        view.findViewById<RecyclerView>(R.id.home_fragment_grid).apply {
        GridLayoutManager(
            requireActivity(),
            2,
            RecyclerView.VERTICAL,
            false
        )
            setHasFixedSize(true)
            itemAnimator = DefaultItemAnimator()
            adapter = HomeAdapter(homeImageList)
    }
        }
    }
