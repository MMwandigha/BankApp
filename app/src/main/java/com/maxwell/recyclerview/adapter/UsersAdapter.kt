package com.maxwell.recyclerview.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.maxwell.recyclerview.adapter.listener.OnItemUserClickListener
import com.maxwell.recyclerview.databinding.UserListBinding
import com.maxwell.recyclerview.model.UsersModel


class UsersAdapter(private val usersList : ArrayList<UsersModel>,
                   private  val mListenerUser: OnItemUserClickListener
):
    RecyclerView.Adapter<UsersAdapter.MyViewHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {

        return MyViewHolder(
            UserListBinding.inflate(LayoutInflater.from(parent.context),parent, false)
        )
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        val currentItem = usersList[position]
        holder.binding.userpicture.setImageResource(currentItem.titleImage)
        holder.binding.username.text=currentItem.titleName
        holder.binding.emailAddress.text=currentItem.titleEmail

    }

    override fun getItemCount(): Int {
        return usersList.size
    }

    class MyViewHolder(var binding: UserListBinding): RecyclerView.ViewHolder(binding.root){
//
//        val titleImage : ShapeableImageView = itemView.findViewById(R.id.userpicture)
//        val titleName : TextView = itemView.findViewById(R.id.username)
//        val titleEmail : TextView = itemView.findViewById(R.id.email_address)
//
//
//        init{
//            itemView.setOnClickListener {
//                listener.onItemClick(adapterPosition)
//            }
//        }



    }

}