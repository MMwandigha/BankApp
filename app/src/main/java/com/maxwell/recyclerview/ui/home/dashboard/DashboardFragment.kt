package com.maxwell.recyclerview.ui.home.dashboard

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.maxwell.recyclerview.R
import com.maxwell.recyclerview.databinding.FragmentDashboardBinding
import com.maxwell.recyclerview.databinding.FragmentLoginBinding

class DashboardFragment : Fragment() {

    private lateinit var binding: FragmentDashboardBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        // Inflate the layout for this fragment
        binding = FragmentDashboardBinding.inflate(inflater, container,false)
        return binding.root

    }




}