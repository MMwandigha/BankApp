package com.maxwell.recyclerview.model

import com.maxwell.recyclerview.R

data class TransactionsModel(var transImage: Int, var transName: String, var transAmount: String, var transDate: String, var transCard: String){

    companion object{
        fun addListOfTransactionsModel() = arrayListOf<TransactionsModel>(
            TransactionsModel(
                transName = "Razer",
                transAmount = "+800.00",
                transCard = "Mastercard",
                transImage = R.drawable.razer,
                transDate = "18 March 2021"
            ), TransactionsModel(
                transName = "KFC",
                transAmount = "-2.50",
                transCard = "Visa",
                transImage = R.drawable.kfc,
                transDate = "18 March 2021"
            ), TransactionsModel(
                transName = "Gucci",
                transAmount = "-2540.95",
                transCard = "Mastercard",
                transImage = R.drawable.gucci,
                transDate = "18 March 2021"
            ), TransactionsModel(
                transName = "Apple",
                transAmount = "-6999.95",
                transCard = "CitiGroup",
                transImage = R.drawable.apple,
                transDate = "18 March 2021"
            ), TransactionsModel(
                transName = "Louis Vuitton",
                transAmount = "-500.00",
                transCard = "Mastercard",
                transImage = R.drawable.louisvuitton,
                transDate = "18 March 2021"
            ), TransactionsModel(
                transName = "MPESA",
                transAmount = "+8000.00",
                transCard = "Mastercard",
                transImage = R.drawable.mpesa,
                transDate = "18 March 2021"
            ),

        )
    }

}
