package com.maxwell.recyclerview.ui.home.dashboard

import android.app.Activity
import android.app.AlertDialog
import android.app.SearchManager
import android.content.DialogInterface
import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import com.google.zxing.integration.android.IntentIntegrator
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

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.usericon.setOnClickListener {
            view.findNavController().navigate(R.id.action_dashboardFragment_to_myWalletFragment)
        }

        binding.notificationIcon.setOnClickListener {

        }
        binding.settingsIcon.setOnClickListener {
            view.findNavController().navigate(R.id.action_dashboardFragment_to_supportFragment)
        }

        binding.imageView14.setOnClickListener {
            view.findNavController().navigate(R.id.action_dashboardFragment_to_recentsFragment)

        }
        binding.materialCardView99.setOnClickListener {
            val intentIntegrator = IntentIntegrator(requireActivity())
            intentIntegrator.setDesiredBarcodeFormats(listOf(IntentIntegrator.QR_CODE))
            intentIntegrator.initiateScan()
        }


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

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        val result = IntentIntegrator.parseActivityResult(resultCode, data)
        if (result != null) {

            AlertDialog.Builder(requireContext())
                .setMessage("Would you like to go to ${result.contents}?")
                .setPositiveButton("Yes", DialogInterface.OnClickListener { dialogInterface, i ->
                    val intent = Intent(Intent.ACTION_WEB_SEARCH)
                    intent.putExtra(SearchManager.QUERY,result.contents)
                    startActivity(intent)
                })
                .setNegativeButton("No",DialogInterface.OnClickListener { dialogInterface, i ->  })
                .create()
                .show()

        }
    }



    }








}