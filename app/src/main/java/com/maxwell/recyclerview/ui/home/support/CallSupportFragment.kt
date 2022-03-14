package com.maxwell.recyclerview.ui.home.support

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.findNavController
import com.maxwell.recyclerview.R
import com.maxwell.recyclerview.databinding.FragmentCallSupportBinding


class CallSupportFragment : Fragment() {

    private lateinit var binding: FragmentCallSupportBinding


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment

        binding = FragmentCallSupportBinding.inflate(inflater, container, false)

        return binding.root

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.cardContact.setOnClickListener {
            val intent = Intent(Intent.ACTION_DIAL)
            intent.data = Uri.parse("tel:0710184980")
            startActivity(intent)
        }

        binding.callsupportback.setOnClickListener {
            view.findNavController().navigate(R.id.action_callSupportFragment_to_supportFragment)
        }
    }
}