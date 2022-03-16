package com.maxwell.recyclerview

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Toast
import androidx.navigation.findNavController
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.setupWithNavController
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.google.android.material.bottomnavigation.BottomNavigationView
import com.google.android.material.floatingactionbutton.FloatingActionButton
import com.maxwell.recyclerview.adapter.UsersAdapter
import com.maxwell.recyclerview.databinding.ActivityMainBinding
import com.maxwell.recyclerview.model.UsersModel
import com.maxwell.recyclerview.ui.home.dashboard.TransferFragment
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_main.view.*

class MainActivity : AppCompatActivity(){

    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)


        //Added
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)


        val navController = findNavController(R.id.fragment)

        binding.bottomNavigationView.setupWithNavController(navController)
//        binding.bottomNavigationView.menu.getItem(2).isEnabled = false

        navController.addOnDestinationChangedListener { _, destination, _ ->

            if (destination.id == R.id.faqFragment || destination.id == R.id.locateUsFragment || destination.id == R.id.feedbackFragment || destination.id == R.id.callSupportFragment || destination.id == R.id.mainFragment) {
                binding.bottomAppBar.visibility = View.GONE

            } else {
                binding.bottomAppBar.visibility = View.VISIBLE

            }
        }

//        binding.fab.setOnClickListener {
//            findNavController(R.id.fragment).navigate(R.id.action_dashboardFragment_to_transferFragment)
//
//           // supportFragmentManager.beginTransaction().replace(R.id.fragment,TransferFragment()).addToBackStack(null).commit()
//        }
//
//        binding.bottomNavigationView.setOnNavigationItemSelectedListener {
//            item->
//            when(item.itemId){
//                R.id.dashboardFragment ->{
//                    findNavController(R.id.fragment).navigate(R.id.action_transferFragment_to_dashboardFragment)
//                    true
//                }
//                else -> false
//            }
//        }


    }





//        val navHostFragment = supportFragmentManager
//            .findFragmentById(R.id.fragmentContainerView) as NavHostFragment
//        val navController = navHostFragment.navController




    }














