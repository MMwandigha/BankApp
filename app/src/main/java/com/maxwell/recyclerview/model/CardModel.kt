package com.maxwell.recyclerview.model

import com.maxwell.recyclerview.R

data class CardModel(
    var bcardColor: String,
    var bcardName: String,
    var bcardNumber: String,
    var bcardImage: Int,
    var bcardExpiry: String,
    var bcardHolder: String
) {
    companion object {
        fun addListOfCardModel() = arrayListOf<CardModel>(
            CardModel(
                bcardColor = "#00F321",
                bcardName = "Mastercard",
                bcardNumber = "1234 4845 4455 3438",
                bcardHolder = "Maxwell Mwandigha",
                bcardExpiry = "03/27",
                bcardImage = R.drawable.mastercard2
            ), CardModel(
                bcardColor = "#00F321",
                bcardName = "Mastercard",
                bcardNumber = "1234 4845 4455 3438",
                bcardHolder = "Maxwell Mwandigha",
                bcardExpiry = "03/27",
                bcardImage = R.drawable.mastercard2
            ), CardModel(
                bcardColor = "#00F321",
                bcardName = "Mastercard",
                bcardNumber = "1234 4845 4455 3438",
                bcardHolder = "Maxwell Mwandigha",
                bcardExpiry = "03/27",
                bcardImage = R.drawable.mastercard2
            )
        )
    }
}