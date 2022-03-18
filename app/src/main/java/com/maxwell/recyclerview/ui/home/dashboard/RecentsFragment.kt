package com.maxwell.recyclerview.ui.home.dashboard

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import com.maxwell.recyclerview.R
import com.maxwell.recyclerview.adapter.TransactionsAdapter
import com.maxwell.recyclerview.databinding.FragmentRecentsBinding
import com.maxwell.recyclerview.model.TransactionsModel

class RecentsFragment : Fragment() {

    private lateinit var binding: FragmentRecentsBinding
    private lateinit var myModelList: ArrayList<TransactionsModel>

    lateinit var transName: Array<String>
    lateinit var transImage: Array<Int>
    lateinit var transAmount: Array<Int>
    lateinit var transDate: Array<String>
    lateinit var transCard: Array<String>



    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment

        binding = FragmentRecentsBinding.inflate(inflater,container, false)
        return binding.root

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        getTransactions()


    }

    private fun getTransactions(){

        myModelList= arrayListOf<TransactionsModel>()
        getTransactionsData()
    }



    private fun getTransactionsData(){
        val transactionsAdapter = TransactionsAdapter(TransactionsModel.addListOfTransactionsModel())
        binding.recentsrecyclerview.adapter= transactionsAdapter
        binding.recentsrecyclerview.setHasFixedSize(true)
        binding.recentsrecyclerview.layoutManager=LinearLayoutManager(requireContext())
        binding.recentsrecyclerview.isNestedScrollingEnabled=false
    }





}