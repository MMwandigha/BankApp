package com.maxwell.recyclerview.ui.home.support

import android.content.Context
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.animation.Animation
import android.view.animation.AnimationUtils
import com.google.android.material.floatingactionbutton.FloatingActionButton
import com.maxwell.recyclerview.R
import kotlinx.android.synthetic.main.fragment_support.*


class SupportFragment : Fragment() {


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
        supportfab.setOnClickListener {
            onAddButtonClicked()

        }
        livechatfab.setOnClickListener{

        }
        facebookfab.setOnClickListener{

        }
        twitterfab.setOnClickListener{

        }
        whatsappfab.setOnClickListener {

        }
        return inflater.inflate(R.layout.fragment_support, container, false)

    }


    private fun onAddButtonClicked() {
        setVisibility(clicked)
        setClickable(clicked)
        setAnimation(clicked)
        clicked = !clicked
    }

    private fun setVisibility(clicked: Boolean) {
        if (!clicked){
            livechatfab.visibility = View.VISIBLE
            facebookfab.visibility = View.VISIBLE
            whatsappfab.visibility = View.VISIBLE
            twitterfab.visibility = View.VISIBLE
        } else {
            livechatfab.visibility = View.INVISIBLE
            facebookfab.visibility = View.INVISIBLE
            whatsappfab.visibility = View.INVISIBLE
            twitterfab.visibility = View.INVISIBLE
        }
    }
    private fun setAnimation(clicked: Boolean) {
        if (!clicked){
            if (!clicked){
                livechatfab.startAnimation(fromBottom)
                facebookfab.startAnimation(fromBottom)
                whatsappfab.startAnimation(fromBottom)
                twitterfab.startAnimation(fromBottom)
                supportfab.startAnimation(rotateOpen)
            }else{
                livechatfab.startAnimation(toBottom)
                facebookfab.startAnimation(toBottom)
                whatsappfab.startAnimation(toBottom)
                twitterfab.startAnimation(toBottom)
                supportfab.startAnimation(rotateClose)
            }
        }

    }
    private fun setClickable (clicked: Boolean){
        if (!clicked){
            livechatfab.isClickable = true
            facebookfab.isClickable = true
            whatsappfab.isClickable = true
            twitterfab.isClickable = true
        } else{
            livechatfab.isClickable = false
            facebookfab.isClickable = false
            whatsappfab.isClickable = false
            twitterfab.isClickable = false
        }
    }




}