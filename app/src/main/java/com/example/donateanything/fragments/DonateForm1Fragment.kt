package com.example.donateanything.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.navigation.Navigation
import com.example.donateanything.R


class DonateForm1Fragment : Fragment() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view=inflater.inflate(R.layout.fragment_donateform1, container, false)
        val btnBack: ImageView =view.findViewById(R.id.back3)
        val argsFrom = this.arguments
        val title = argsFrom?.getString("itemType")
        val icNo = argsFrom?.getString("icNo")
        val date = argsFrom?.getString("date")

        btnBack.setOnClickListener(){
            Navigation.findNavController(it).navigate(R.id.action_donateFragment_to_newsFragment)
        }

        val titleText= view.findViewById<TextView>(R.id.donateItem);
        titleText.setText(title)

        val btnSubmit: Button =view.findViewById(R.id.submitBtn)

        btnSubmit.setOnClickListener(){


            Navigation.findNavController(it).navigate(R.id.action_donateFragment_to_donateForm1Fragment)


            //Navigation.findNavController(it).navigate(R.id.action_donateFragment_to_donateForm2Fragment)
        }

        // Inflate the layout for this fragment
        return view
    }


}