package com.maxwell.recyclerview.ui.home.dashboard

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import com.maxwell.recyclerview.R
import com.maxwell.recyclerview.adapter.TransactionsAdapter
import com.maxwell.recyclerview.databinding.FragmentDashboardBinding
import com.maxwell.recyclerview.databinding.FragmentLoginBinding
import com.maxwell.recyclerview.model.TransactionsModel

class DashboardFragment : Fragment() {

    private lateinit var binding: FragmentDashboardBinding
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
        binding = FragmentDashboardBinding.inflate(inflater, container,false)
        getTransactions()
        return binding.root


    }
    private fun getTransactions(){

        myModelList= arrayListOf<TransactionsModel>()
        getTransactionsData()
    }

    private fun getTransactionsData(){
        val transactionsAdapter = TransactionsAdapter(TransactionsModel.addListOfTransactionsModel())
        binding.dashboardrecyclerview.adapter= transactionsAdapter
        binding.dashboardrecyclerview.setHasFixedSize(true)
        binding.dashboardrecyclerview.layoutManager= LinearLayoutManager(requireContext())
        binding.dashboardrecyclerview.isNestedScrollingEnabled=false
    }






}