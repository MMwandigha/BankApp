package com.maxwell.recyclerview.ui.home.dashboard

import android.graphics.Color
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.viewpager.widget.ViewPager
import com.maxwell.recyclerview.R
import com.maxwell.recyclerview.adapter.CardAdapter
import com.maxwell.recyclerview.databinding.FragmentTransferBinding
import com.maxwell.recyclerview.model.CardModel


class TransferFragment : Fragment() {

    private lateinit var myModelList: ArrayList<CardModel>


//    private lateinit var cardAdapter: cardAdapter
    private lateinit var binding: FragmentTransferBinding

    lateinit var bcardName: Array <String>
    lateinit var bcardHolder: Array <String>
    lateinit var bcardExpiry: Array <String>
    lateinit var bcardImage: Array <Int>
    lateinit var bcardNumber: Array <String>
    lateinit var bcardColor: Array <Int>

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        // Inflate the layout for this fragment

        binding = FragmentTransferBinding.inflate(inflater, container, false)
        return binding.root


    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        //statements to be inserted for validation
        binding.btnSend.setOnClickListener {
            view.findNavController().navigate(R.id.action_transferFragment_to_successFragment)

        }
        loadCards()


    }

    private fun loadCards() {
        bcardHolder = arrayOf(
            "Maxwell Mwandigha",
            "Maxwell Mwandigha",
            "Johnstone Mwakazi",
            "Maxwell Mwashigadi",
            "Linda Mutisya",
            "Charles Maina",
            "Beatrice Gichuru"
        )
        bcardExpiry = arrayOf(
            "03/27",
            "05/29",
            "01/30",
            "09/22",
            "06/23",
            "12/25",
            "07/27"
        )
        bcardName = arrayOf(
            "Mastercard",
            "Barclays Bank",
            "American Express",
            "Chase Bank",
            "Citigroup Bank",
            "Goldman Sachs",
            "Visa"
        )
        bcardNumber = arrayOf(
            "2345 6079 6987 1234",
            "2643 6877 1234 0987",
            "7612 5902 5462 8766",
            "9512 6745 5598 0911",
            "1299 4573 2801 1176",
            "0988 7566 2151 4590",
            "8095 6984 3864 9112",

        )
        bcardColor = arrayOf(
            Color.rgb(54,88,173),
            Color.rgb(0,57,93),
            Color.rgb(202,233, 217),
            Color.rgb(255,215,0),
            Color.rgb(127,255,212),
            Color.rgb(0,250,154),
            Color.rgb(176,196,222)

        )
        bcardImage = arrayOf(
            R.drawable.mastercard2,
            R.drawable.barclays,
            R.drawable.american_express,
            R.drawable.chase,
            R.drawable.citi,
            R.drawable.goldman_sachs,
            R.drawable.visa
        )

        myModelList = arrayListOf<CardModel>()
        getCardData()

    }

    private fun getCardData(){
        val cardAdapter = CardAdapter(CardModel.addListOfCardModel())
        binding.viewpager.adapter = cardAdapter


    }





}