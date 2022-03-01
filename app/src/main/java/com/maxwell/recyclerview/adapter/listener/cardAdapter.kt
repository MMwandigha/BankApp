package com.maxwell.recyclerview.adapter.listener

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.viewpager.widget.PagerAdapter
import com.maxwell.recyclerview.R
import com.maxwell.recyclerview.model.CardModel
import kotlinx.android.synthetic.main.card_item.view.*

class CardAdapter(private val context: Context, private val myModelArrayList: ArrayList<CardModel>) : PagerAdapter(){
    override fun isViewFromObject(view: View, `object`: Any): Boolean {
        return view == `object`
    }

    override fun getCount(): Int {
        return myModelArrayList.size
    }

    override fun instantiateItem(container: ViewGroup, position: Int): Any {
        val view = LayoutInflater.from(context).inflate(R.layout.card_item,container, false)
        val model = myModelArrayList[position]


        val bcardname = model.bcardName
        val bcardholder = model.bcardHolder
        val bcardimage = model.bcardImage
        val bcardnumber = model.bcardNumber
        val bcardcolor = model.bcardColor
        val bcardexpiry = model.bcardExpiry

        view.cardImage.setImageResource(bcardimage)
        view.cardHolder.text = bcardholder
        view.cardNumber.text = bcardnumber
        view.cardExpiry.text = bcardexpiry
        view.cardName.text = bcardname
        view.cardColor.setBackgroundColor(bcardcolor.toInt())

        view.setOnClickListener {
            Toast.makeText(context, "$bcardname \n $bcardholder \n $bcardnumber", Toast.LENGTH_SHORT).show()

        }
        container.addView(view,position)

        return view

        }

    override fun destroyItem(container: ViewGroup, position: Int, `object`: Any) {
        container.removeView(`object` as View)
    }


    }






