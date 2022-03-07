package com.maxwell.recyclerview.model

import com.maxwell.recyclerview.R

data class CardModel(var bcardName: String, var bcardNumber: String, var bcardImage: Int, var bcardExpiry: String, var bcardHolder: String) {

    companion object {
        fun addListOfCardModel() = arrayListOf<CardModel>(
            CardModel(

                bcardName = "Mastercard",
                bcardNumber = "2345 6079 6987 1234",
                bcardHolder = "Maxwell Mwandigha",
                bcardExpiry = "03/27",
                bcardImage = R.drawable.mastercard2
            ), CardModel(

                bcardName = "Barclays Bank",
                bcardNumber = "2643 6877 1234 0987",
                bcardHolder = "Maxwell Mwandigha",
                bcardExpiry = "05/29",
                bcardImage = R.drawable.barclays
            ), CardModel(

                bcardName = "American Express",
                bcardNumber = "7612 5902 5462 8766",
                bcardHolder = "Johnstone Mwakazi",
                bcardExpiry = "01/30",
                bcardImage = R.drawable.american_express
            ), CardModel(

                bcardName = "Chase Bank",
                bcardNumber = "9512 6745 5598 0911",
                bcardHolder = "Maxwell Mwashigadi",
                bcardExpiry = "09/22",
                bcardImage = R.drawable.chase
            ), CardModel(

                bcardName = "Citigroup Bank",
                bcardNumber = "1299 4573 2801 1176",
                bcardHolder = "Linda Mutisya",
                bcardExpiry = "06/23",
                bcardImage = R.drawable.citi
            ), CardModel(

                bcardName = "Goldman Sachs",
                bcardNumber = "0988 7566 2151 4590",
                bcardHolder = "Charles Maina",
                bcardExpiry = "12/25",
                bcardImage = R.drawable.goldman_sachs
            ),CardModel(

                bcardName = "Visa",
                bcardNumber = "8095 6984 3864 9112",
                bcardHolder = "Beatrice Gichuru",
                bcardExpiry = "07/27",
                bcardImage = R.drawable.visa
            ),
        )
    }
}