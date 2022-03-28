package com.maxwell.recyclerview.ui.home.dashboard

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import com.google.android.material.tabs.TabLayoutMediator
import com.maxwell.recyclerview.R
import com.maxwell.recyclerview.adapter.CardAdapter
import com.maxwell.recyclerview.databinding.FragmentMyWalletBinding
import com.maxwell.recyclerview.model.CardModel
import kotlinx.android.synthetic.main.fragment_my_wallet.*
import kotlinx.android.synthetic.main.fragment_view_pager.*

class MyWalletFragment : Fragment() {

    lateinit var bcardName: Array <String>
    lateinit var bcardHolder: Array <String>
    lateinit var bcardExpiry: Array <String>
    lateinit var bcardImage: Array <Int>
    lateinit var bcardNumber: Array <String>
    lateinit var bcardColor: Array <Int>

    private lateinit var binding: FragmentMyWalletBinding
    private lateinit var myModelList: ArrayList<CardModel>


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentMyWalletBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.buttonViewTransactions.setOnClickListener {
            view.findNavController().navigate(R.id.action_myWalletFragment_to_recentsFragment)
        }

        loadCards()
    }

    private fun loadCards() {
        myModelList = arrayListOf<CardModel>()
        getCardData()

    }

        private fun getCardData(){
        val cardAdapter = CardAdapter(CardModel.addListOfCardModel())
        binding.myWalletViewPager.adapter = cardAdapter

            TabLayoutMediator(binding.tabLayout,binding.myWalletViewPager) {tab, position ->}.attach()



    }



}