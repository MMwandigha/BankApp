package com.maxwell.recyclerview.ui.home.dashboard

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.animation.Animation
import android.view.animation.AnimationUtils
import androidx.fragment.app.Fragment
import androidx.navigation.findNavController
import com.maxwell.recyclerview.R
import com.maxwell.recyclerview.databinding.FragmentSupportBinding
import kotlinx.android.synthetic.main.fragment_support.*


class SupportFragment : Fragment() {

    private lateinit var binding: FragmentSupportBinding

    private val rotateOpen: Animation by lazy { AnimationUtils.loadAnimation(requireContext(), R.anim.rotate_open_anim)}
    private val rotateClose: Animation by lazy {AnimationUtils.loadAnimation(requireContext(), R.anim.rotate_close_anim)}
    private val fromBottom: Animation by lazy {AnimationUtils.loadAnimation(requireContext(),R.anim.from_bottom_anim)}
    private val toBottom : Animation by lazy {AnimationUtils.loadAnimation(requireContext(), R.anim.rotate_open_anim)}


    private var clicked = false
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?


    ): View? {
        // Inflate the layout for this fragment

        binding= FragmentSupportBinding.inflate(inflater, container,false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.supportfab.setOnClickListener {
            onAddButtonClicked()
        }
        binding.livechatfab.setOnClickListener{
            view.findNavController().navigate(R.id.action_supportFragment_to_mainFragment)

        }
        binding.facebookfab.setOnClickListener{

        }
        binding.twitterfab.setOnClickListener{
            try {
                startActivity(
                    Intent(
                        Intent.ACTION_VIEW,
                        Uri.parse("twitter://user?user_id=813679215195410432")
                    )
                )
            } catch (e: Exception) {
                startActivity(
                    Intent(
                        Intent.ACTION_VIEW,
                        Uri.parse("https://twitter.com/LynxMods")
                    )
                )
            }

        }
        binding.whatsappfab.setOnClickListener {
            val url = "https://api.whatsapp.com/send?phone=$+254710184980"
            val i = Intent(Intent.ACTION_VIEW)
            i.data = Uri.parse(url)
            startActivity(i)

        }

        binding.cardCallSupport.setOnClickListener {
            view.findNavController().navigate(R.id.action_supportFragment_to_callSupportFragment)
        }

        binding.cardGiveUsFeedback.setOnClickListener {
            view.findNavController().navigate(R.id.action_supportFragment_to_feedbackFragment)
        }

        binding.cardLocateUs.setOnClickListener {
            view.findNavController().navigate(R.id.action_supportFragment_to_locateUsFragment)
        }
        binding.cardfaq.setOnClickListener {
            view.findNavController().navigate(R.id.action_supportFragment_to_faqFragment)
        }
    }


    private fun onAddButtonClicked() {
        setVisibility(clicked)
        setClickable(clicked)
        setAnimation(clicked)

        clicked = !clicked
    }

    private fun setVisibility(clicked: Boolean) {
        if (!clicked){
            binding.livechatfab.visibility = View.VISIBLE
            binding.facebookfab.visibility = View.VISIBLE
            binding.whatsappfab.visibility = View.VISIBLE
            binding.twitterfab.visibility = View.VISIBLE
        } else {
            binding.livechatfab.visibility = View.INVISIBLE
            binding.facebookfab.visibility = View.INVISIBLE
            binding.whatsappfab.visibility = View.INVISIBLE
            binding.twitterfab.visibility = View.INVISIBLE
        }
    }
    private fun setAnimation(clicked: Boolean) {
        if (!clicked){
            if (!clicked){
                binding.livechatfab.startAnimation(fromBottom)
                binding.facebookfab.startAnimation(fromBottom)
                binding.whatsappfab.startAnimation(fromBottom)
                binding.twitterfab.startAnimation(fromBottom)
                binding.supportfab.startAnimation(rotateOpen)
            }else{
                binding.livechatfab.startAnimation(toBottom)
                binding.facebookfab.startAnimation(toBottom)
                binding.whatsappfab.startAnimation(toBottom)
                binding.twitterfab.startAnimation(toBottom)
                binding.supportfab.startAnimation(rotateClose)
            }
        }

    }
    private fun setClickable (clicked: Boolean){
        if (!clicked){
            binding.livechatfab.isClickable = true
            binding.facebookfab.isClickable = true
            binding.whatsappfab.isClickable = true
            binding.twitterfab.isClickable = true
        } else{
            binding.livechatfab.isClickable = false
            binding.facebookfab.isClickable = false
            binding.whatsappfab.isClickable = false
            binding.twitterfab.isClickable = false
        }
    }





}