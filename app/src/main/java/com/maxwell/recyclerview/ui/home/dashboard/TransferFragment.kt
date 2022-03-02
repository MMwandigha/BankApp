package com.maxwell.recyclerview.ui.home.dashboard

import android.app.ActionBar
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.view.setPadding
import androidx.viewpager.widget.ViewPager
import com.maxwell.recyclerview.R
import com.maxwell.recyclerview.adapter.CardAdapter
import com.maxwell.recyclerview.databinding.FragmentTransferBinding
import com.maxwell.recyclerview.model.CardModel
import kotlinx.android.synthetic.main.fragment_transfer.*


class TransferFragment : Fragment() {

    private lateinit var myModelList: ArrayList<CardModel>
    private lateinit var actionBar: ActionBar

//    private lateinit var cardAdapter: cardAdapter
    private lateinit var binding: FragmentTransferBinding

    lateinit var bcardName: Array <String>
    lateinit var bcardHolder: Array <String>
    lateinit var bcardExpiry: Array <String>
    lateinit var bcardImage: Array <Int>
    lateinit var bcardNumber: Array <String>
    lateinit var bcardColor: Array <String>

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
        loadCards()

        viewpager.addOnPageChangeListener(object :ViewPager.OnPageChangeListener{
            override fun onPageScrollStateChanged(state: Int) {
                TODO("Not yet implemented")
            }


            override fun onPageScrolled(
                position: Int,
                positionOffset: Float,
                positionOffsetPixels: Int
            ) {

            }

            override fun onPageSelected(position: Int) {

            }


        })


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
            "American Express",
            "Barclays Bank",
            "Chase Bank",
            "Citigroup Bank",
            "Goldman Sachs",
            "Visa",
            "Mastercard"
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
            "D4AF37",
            "00AFE9",
            "117ACA",
            "DB230B",
            "64A8F0",
            "FCB70A",
            "231F20"

        )
        bcardImage = arrayOf(
            R.drawable.american_express,
            R.drawable.barclays,
            R.drawable.chase,
            R.drawable.citi,
            R.drawable.goldman_sachs,
            R.drawable.visa,
            R.drawable.mastercard2
        )

        myModelList = arrayListOf<CardModel>()
        getCardData()

    }

    private fun getCardData(){
        val cardAdapter = CardAdapter(requireContext(), CardModel.addListOfCardModel())
        viewpager.adapter = cardAdapter
        viewpager.setPadding(100,0,100,0)
    }




}