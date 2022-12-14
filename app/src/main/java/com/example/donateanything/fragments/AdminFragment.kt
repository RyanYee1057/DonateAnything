package com.example.donateanything.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageView
import androidx.navigation.Navigation
import com.example.donateanything.R

class AdminFragment : Fragment() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view=inflater.inflate(R.layout.fragment_admin, container, false)

        val homeBtn: Button = view.findViewById(R.id.homeBtn)
        homeBtn.setOnClickListener(){
            Navigation.findNavController(it).navigate(R.id.action_adminFragment_to_homeFragment)
        }

        val btnRes: ImageView =view.findViewById(R.id.imgRes)

        btnRes.setOnClickListener(){
            Navigation.findNavController(it).navigate(R.id.action_adminFragment_to_request_list_Fragment)
        }
        val btnDonate: ImageView =view.findViewById(R.id.imgDonate)

        btnDonate.setOnClickListener(){
            Navigation.findNavController(it).navigate(R.id.action_adminFragment_to_admin_donate_list_Fragment)
        }

        return view
    }

}