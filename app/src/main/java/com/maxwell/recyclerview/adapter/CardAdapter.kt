package com.maxwell.recyclerview.adapter

import android.content.Context
import android.graphics.Color
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.maxwell.recyclerview.databinding.CardItemBinding
import com.maxwell.recyclerview.model.CardModel
import kotlin.random.Random

class CardAdapter(private val cardsList: ArrayList<CardModel>):

    RecyclerView.Adapter<CardAdapter.CardViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CardViewHolder {
        return CardViewHolder(
            CardItemBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        )
    }

    //To randomize card colors//
//        private fun Int.Companion.randomColor(): Int{
//        return Color.argb(255, Random.nextInt(256),Random.nextInt(256),Random.nextInt(256))
//    }

    override fun onBindViewHolder(holder: CardViewHolder, position: Int)  {
        val currentItem = cardsList[position]
        holder.binding.cardImage.setImageResource(currentItem.bcardImage)
        holder.binding.cardHolder.text = currentItem.bcardHolder
        holder.binding.cardExpiry.text = currentItem.bcardExpiry
        holder.binding.cardName.text = currentItem.bcardName
//        holder.binding.cardColor.setCardBackgroundColor(Int.randomColor())
        holder.binding.cardColor.setCardBackgroundColor(currentItem.bcardColor)


    }

    override fun getItemCount(): Int {
        return cardsList.size
    }

        class CardViewHolder (var binding: CardItemBinding):RecyclerView.ViewHolder(binding.root){

        }


    }











//{
//    override fun isViewFromObject(view: View, `object`: Any): Boolean {
//        return view == `object`
//    }
//
//    override fun getCount(): Int {
//        return cardsList.size
//    }
//
//    private fun Int.Companion.randomColor(): Int{
//        return Color.argb(255, Random.nextInt(256),Random.nextInt(256),Random.nextInt(256))
//    }
//
//    override fun instantiateItem(container: ViewGroup, position: Int): Any {
//        val view = LayoutInflater.from(context).inflate(R.layout.card_item,container, false)
//        val model = cardsList[position]
//
//
//        val bcardname = model.bcardName
//        val bcardholder = model.bcardHolder
//        val bcardimage = model.bcardImage
//        val bcardnumber = model.bcardNumber
//        val bcardexpiry = model.bcardExpiry
//
//
//

//
//        view.setOnClickListener {
//            Toast.makeText(context, "$bcardname \n $bcardholder \n $bcardnumber", Toast.LENGTH_SHORT).show()
//
//        }
//        container.addView(view,position)
//
//        return view
//
//        }
//
//    override fun destroyItem(container: ViewGroup, position: Int, `object`: Any) {
//        container.removeView(`object` as View)
//    }
//
//
//    }






