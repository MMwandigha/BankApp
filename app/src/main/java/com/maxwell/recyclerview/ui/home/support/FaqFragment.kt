package com.maxwell.recyclerview.ui.home.support

import android.os.Bundle
import android.transition.AutoTransition
import android.transition.TransitionManager
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.findNavController
import com.maxwell.recyclerview.R
import com.maxwell.recyclerview.databinding.FragmentFaqBinding
import kotlinx.android.synthetic.main.fragment_faq.*

class FaqFragment : Fragment() {

    private lateinit var binding: FragmentFaqBinding


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        // Inflate the layout for this fragment
        binding = FragmentFaqBinding.inflate(inflater, container, false)

        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.q1.setOnClickListener {
            if (binding.ansq1.visibility == View.GONE){
                TransitionManager.beginDelayedTransition(binding.q1, AutoTransition())
                ansq1.visibility = View.VISIBLE
            } else {
                TransitionManager.beginDelayedTransition(binding.q1, AutoTransition())
                ansq1.visibility = View.GONE
            }
        }

        binding.q2.setOnClickListener {
            if (binding.ansq2.visibility == View.GONE){
                TransitionManager.beginDelayedTransition(binding.q2, AutoTransition())
                ansq2.visibility = View.VISIBLE
            } else {
                TransitionManager.beginDelayedTransition(binding.q2, AutoTransition())
                ansq2.visibility = View.GONE
            }
        }

        binding.q3.setOnClickListener {
            if (binding.ansq3.visibility == View.GONE){
                TransitionManager.beginDelayedTransition(binding.q3, AutoTransition())
                ansq3.visibility = View.VISIBLE
            } else {
                TransitionManager.beginDelayedTransition(binding.q3, AutoTransition())
                ansq3.visibility = View.GONE
            }
        }
        binding.faqback.setOnClickListener {
            view.findNavController().navigate(R.id.action_faqFragment_to_supportFragment)
        }
    }


}