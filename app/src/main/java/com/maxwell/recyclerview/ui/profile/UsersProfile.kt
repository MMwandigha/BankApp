package com.maxwell.recyclerview.ui.profile

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import com.maxwell.recyclerview.R

class UsersProfile : AppCompatActivity() {

        override fun onCreate(savedInstanceState: Bundle?) {
            super.onCreate(savedInstanceState)
            setContentView(R.layout.user_profile)

            val myName : TextView = findViewById(R.id.username)
            val myDesc : TextView = findViewById(R.id.description)
            val myImage : ImageView = findViewById(R.id.userpicture)
            val myAddress : TextView = findViewById(R.id.email_address)

            val bundle : Bundle?= intent.extras
            val titleName= bundle!!.getString("titleName")
            val titleImage= bundle.getInt("titleImage")
            val titleEmail = bundle.getString("titleEmail")
            val titleDesc = bundle.getString("titleDesc")

            myName.text = titleName
            myDesc.text = titleDesc
            myImage.setImageResource(titleImage)
            myAddress.text = titleEmail


        }

    }
