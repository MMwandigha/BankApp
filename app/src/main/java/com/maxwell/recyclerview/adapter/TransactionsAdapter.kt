package com.maxwell.recyclerview.adapter

import android.graphics.Color
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.maxwell.recyclerview.databinding.TransactionItemBinding
import com.maxwell.recyclerview.model.TransactionsModel

class TransactionsAdapter (private val transactionsList: ArrayList<TransactionsModel>):

        RecyclerView.Adapter<TransactionsAdapter.TransactionsViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TransactionsViewHolder {
        return TransactionsViewHolder(
            TransactionItemBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        )
    }

    override fun onBindViewHolder(holder: TransactionsViewHolder, position: Int) {
        val currentItem = transactionsList[position]
        holder.binding.transactionImage.setImageResource(currentItem.transImage)
        holder.binding.transactionAmount.text= currentItem.transAmount
        holder.binding.transactionCard.text=currentItem.transCard
        holder.binding.transactionDate.text=currentItem.transDate
        holder.binding.transactionName.text=currentItem.transName

        if (currentItem.transAmount.contains("+")){
            holder.binding.transactionAmount.setTextColor(Color.parseColor("#37b81f"))
        } else {
            holder.binding.transactionAmount.setTextColor(Color.parseColor("#C73C38"))
        }
    }

    override fun getItemCount(): Int {
        return transactionsList.size
    }

    class TransactionsViewHolder(var binding: TransactionItemBinding):RecyclerView.ViewHolder(binding.root)


}