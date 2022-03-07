package com.maxwell.recyclerview.ui.home

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import com.maxwell.recyclerview.R
import com.maxwell.recyclerview.adapter.UsersAdapter
import com.maxwell.recyclerview.adapter.listener.OnItemUserClickListener
import com.maxwell.recyclerview.databinding.FragmentMainBinding
import com.maxwell.recyclerview.model.UsersModel


class MainFragment : Fragment(),OnItemUserClickListener {
    private lateinit var newArrayList: ArrayList<UsersModel>


    //Added
    private lateinit var binding: FragmentMainBinding

    lateinit var titleImage : Array <Int>
    lateinit var titleName : Array <String>
    lateinit var titleEmail : Array <String>
    lateinit var titleDesc : Array <String>


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {


        // Inflate the layout for this fragment

        binding= FragmentMainBinding.inflate(inflater,container, false)
//        binding= FragmentMainBinding.inflate(layoutInflater)

        return binding.root


    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
       inflateRecy()
    }
    private fun inflateRecy() {
        titleImage = arrayOf(
            R.drawable.alex,
            R.drawable.ana,
            R.drawable.charles,
            R.drawable.christina,
            R.drawable.james,
            R.drawable.jane,
            R.drawable.jennifer,
            R.drawable.john,
            R.drawable.laurel,
            R.drawable.warren,

            )

        titleName= arrayOf(
            "Alex Wamae",
            "Ana Wangari",
            "Charles Maina",
            "Christina Njoki",
            "James Mutisya",
            "Jane Njuguna",
            "Jennifer Lopez",
            "John Mutua",
            "Laurel Akinyi",
            "Warren Otiende"

        )

        titleEmail= arrayOf(
            "alexwamae@gmail.com",
            "anawangari@gmail.com",
            "charlesmaina@gmail.com",
            "christinanjoki@gmail.com",
            "jamesmutisya@gmail.com",
            "janenjuguna@gmail.com",
            "jenniferlopez@gmail.com",
            "johnmutua@gmail.com",
            "laurelakinyi@gmail.com",
            "warrenotiende@gmail.com"
        )

        titleDesc = arrayOf(

            getString(R.string.alex),
            getString(R.string.ana),
            getString(R.string.charles),
            getString(R.string.christina),
            getString(R.string.james),
            getString(R.string.jane),
            getString(R.string.jennifer),
            getString(R.string.john),
            getString(R.string.laurel),
            getString(R.string.warren),


            )

        newArrayList = arrayListOf<UsersModel>()
        getUserdata()

    }

    private fun getUserdata() {
        for(i in titleImage.indices){
            val users = UsersModel(titleImage[i],titleName[i], titleEmail[i])
            newArrayList.add(users)
        }

        val usersAdapter = UsersAdapter(newArrayList,this)

//        binding.recyclerview.apply {
//            layoutManager = LinearLayoutManager(requireActivity())
//            setHasFixedSize(true)
//            adapter = usersAdapter
//        }

        binding.usersrecyclerview.layoutManager= LinearLayoutManager(requireActivity())
        binding.usersrecyclerview.setHasFixedSize(true)
        binding.usersrecyclerview.adapter=usersAdapter


    }

    override fun onItemClick(view: View, position: Int) {
       if (view.id==R.id.cvUserData){
           findNavController().navigate(R.id.action_mainFragment_to_secondFragment)
       }
    }
}