package com.maxwell.recyclerview.ui.home.support

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import androidx.navigation.findNavController
import com.maxwell.recyclerview.R
import com.maxwell.recyclerview.databinding.FragmentFeedbackBinding

class FeedbackFragment : Fragment() {

    private lateinit var binding: FragmentFeedbackBinding

    override fun onResume() {
        super.onResume()

        val typeOfFeedback = resources.getStringArray(R.array.typeOfFeedback)
        val arrayAdapter = ArrayAdapter(requireContext(), R.layout.dropdown_item, typeOfFeedback)
        binding.txtTypeOfFeedback.setAdapter(arrayAdapter)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        // Inflate the layout for this fragment
        binding = FragmentFeedbackBinding.inflate(inflater, container, false)

        return binding.root

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.imageView3.setOnClickListener {
            view.findNavController().navigate(R.id.action_feedbackFragment_to_supportFragment)
        }
    }

}