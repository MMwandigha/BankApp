package com.maxwell.recyclerview.ui.home.dashboard

import android.graphics.Color
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import com.github.mikephil.charting.charts.LineChart
import com.github.mikephil.charting.data.Entry
import com.github.mikephil.charting.data.LineData
import com.github.mikephil.charting.data.LineDataSet
import com.github.mikephil.charting.utils.ColorTemplate
import com.maxwell.recyclerview.R
import com.maxwell.recyclerview.adapter.TransactionsAdapter
import com.maxwell.recyclerview.databinding.FragmentRecentsBinding
import com.maxwell.recyclerview.model.TransactionsModel
import kotlinx.android.synthetic.main.fragment_recents.*
import java.util.*
import kotlin.collections.ArrayList

class RecentsFragment : Fragment() {

    private lateinit var binding: FragmentRecentsBinding
    private lateinit var myModelList: ArrayList<TransactionsModel>

    private lateinit var lineList: ArrayList<Entry>
    private lateinit var lineDataSet: LineDataSet
    private lateinit var lineData: LineData


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



        lineList = ArrayList()
        lineList.add(Entry(10f, 100f ))
        lineList.add(Entry(20f, 300f ))
        lineList.add(Entry(30f, 200f ))
        lineList.add(Entry(40f, 600f ))
        lineList.add(Entry(50f, 500f ))
        lineList.add(Entry(10f, 900f ))

        lineDataSet = LineDataSet(lineList, "Count" )
        lineData = LineData(lineDataSet)
        binding.lineChart.data = lineData
        lineDataSet.color = Color.BLACK
//        lineDataSet.setColors(*ColorTemplate.JOYFUL_COLORS)
        lineDataSet.valueTextColor=Color.BLUE
        lineDataSet.valueTextSize=13f
        lineDataSet.setDrawFilled(true)


    }



    private fun getTransactions(){

        myModelList= ArrayList()
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