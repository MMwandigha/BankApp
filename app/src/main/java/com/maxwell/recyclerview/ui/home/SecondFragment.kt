package com.maxwell.recyclerview.ui.home

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import android.widget.inline.InlineContentView
import androidx.navigation.fragment.findNavController
import androidx.navigation.fragment.navArgs
import com.maxwell.recyclerview.R
import com.maxwell.recyclerview.databinding.FragmentMainBinding
import com.maxwell.recyclerview.databinding.FragmentSecondBinding

class SecondFragment : Fragment() {

    val args: SecondFragmentArgs by navArgs()

    private lateinit var binding: FragmentSecondBinding


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?


    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentSecondBinding.inflate(inflater,container, false)

//        binding= FragmentMainBinding.inflate(layoutInflater)

        return binding.root


    }

}