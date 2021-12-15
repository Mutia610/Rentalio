package com.mutia.rentalio.fragment

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.NavController
import androidx.navigation.Navigation
import com.denzcoskun.imageslider.constants.ScaleTypes
import com.denzcoskun.imageslider.models.SlideModel
import com.mutia.rentalio.*
import kotlinx.android.synthetic.main.fragment_home.*


class HomeFragment : Fragment() {

    private val listData : java.util.ArrayList<RentalioModel> = arrayListOf()
    lateinit var navController: NavController

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_home, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        navController = Navigation.findNavController(view)

        listData.addAll(RentalioData.listDataRentalio)

        bannerSlider()
        listCategory()
    }

    private fun bannerSlider(){
        val imageList = ArrayList<SlideModel>()

        imageList.add(SlideModel(R.drawable.banner_slider_satu))
        imageList.add(SlideModel(R.drawable.banner_slider_dua))

        imageSlider.setImageList(imageList, ScaleTypes.FIT)
    }

    private fun listCategory(){
        val rentalioAdapter = RentalioAdapter(listData, object : RentalioAdapter.OnClickListener{
            override fun booking() {
//                navController.navigate(R.id.action_homeFragment2_to_historyFragment)
            }
        })

        rvCategory.adapter = rentalioAdapter
    }
}