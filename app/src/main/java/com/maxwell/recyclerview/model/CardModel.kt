package com.maxwell.recyclerview.model

import android.graphics.Color
import com.maxwell.recyclerview.R

data class CardModel(var bcardName: String, var bcardNumber: String, var bcardImage: Int, var bcardExpiry: String, var bcardHolder: String, var bcardColor: Int) {

    companion object {
        fun addListOfCardModel() = arrayListOf<CardModel>(
            CardModel(
                bcardColor = Color.rgb(54,88,173),
                bcardName = "Mastercard",
                bcardNumber = "2345 6079 6987 1234",
                bcardHolder = "Maxwell Mwandigha",
                bcardExpiry = "03/27",
                bcardImage = R.drawable.mastercard2
            ), CardModel(
                bcardColor = Color.rgb(0,57,93),
                bcardName = "Barclays Bank",
                bcardNumber = "2643 6877 1234 0987",
                bcardHolder = "Maxwell Mwandigha",
                bcardExpiry = "05/29",
                bcardImage = R.drawable.barclays
            ), CardModel(
                bcardColor = Color.rgb(202,233, 217),
                bcardName = "American Express",
                bcardNumber = "7612 5902 5462 8766",
                bcardHolder = "Johnstone Mwakazi",
                bcardExpiry = "01/30",
                bcardImage = R.drawable.american_express
            ), CardModel(
                bcardColor = Color.rgb(255,215,0),
                bcardName = "Chase Bank",
                bcardNumber = "9512 6745 5598 0911",
                bcardHolder = "Maxwell Mwashigadi",
                bcardExpiry = "09/22",
                bcardImage = R.drawable.chase
            ), CardModel(
                bcardColor = Color.rgb(127,255,212),
                bcardName = "Citigroup Bank",
                bcardNumber = "1299 4573 2801 1176",
                bcardHolder = "Linda Mutisya",
                bcardExpiry = "06/23",
                bcardImage = R.drawable.citi
            ), CardModel(
                bcardColor = Color.rgb(0,250,154),
                bcardName = "Goldman Sachs",
                bcardNumber = "0988 7566 2151 4590",
                bcardHolder = "Charles Maina",
                bcardExpiry = "12/25",
                bcardImage = R.drawable.goldman_sachs
            ),CardModel(
                bcardColor = Color.rgb(176,196,222),
                bcardName = "Visa",
                bcardNumber = "8095 6984 3864 9112",
                bcardHolder = "Beatrice Gichuru",
                bcardExpiry = "07/27",
                bcardImage = R.drawable.visa
            ),
        )
    }
}