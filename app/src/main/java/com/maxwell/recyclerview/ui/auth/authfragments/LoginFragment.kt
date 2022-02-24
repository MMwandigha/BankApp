package com.maxwell.recyclerview.ui.auth.authfragments

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.lifecycle.MediatorLiveData
import androidx.lifecycle.MutableLiveData
import androidx.navigation.findNavController
import com.maxwell.recyclerview.MainActivity
import com.maxwell.recyclerview.R
import com.maxwell.recyclerview.databinding.FragmentLoginBinding

class LoginFragment : Fragment() {


    private lateinit var binding: FragmentLoginBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {


        // Inflate the layout for this fragment
        binding= FragmentLoginBinding.inflate(inflater, container, false)


        return binding.root


//        loadFragment()

    }

//    private fun loadFragment(bi: RegisterFragment) {
//        val transaction = supportFragmentManager.beginTransaction()
//        transaction.replace(binding.txtNotRegistered, LoginFragment)
//        transaction.disallowAddToBackStack()
//        transaction.commit()
//    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.txtNotRegistered.setOnClickListener{

            view.findNavController().navigate(R.id.action_loginFragment_to_registerFragment2)

        }

        binding.btnLogin.setOnClickListener {
            if (checkAllFields()){
                startActivity(Intent(requireActivity(), MainActivity:: class.java))
            }


        }

    }

    private fun checkAllFields(): Boolean {

        val loginPassword = binding.etxtPassword.text.toString()
        val loginPhone = binding.etxtPhoneNumber.text.toString()


        if (loginPassword.isEmpty()) {
            binding.etxtPassword.error = "Password is required"
            return false
        } else if (loginPassword.length < 8) {
            binding.etxtPassword.error = "Password must be minimum 8 characters"
            return false
        }
        if (loginPhone.isEmpty()) {
            binding.etxtPhoneNumber.error = "Phone Number is Required"
            return false

        } else if (loginPhone.length != 10) {
            binding.etxtPhoneNumber.error = "Phone Number should have 10 digits"

            return false
        }
            else{
            return true
        }
    }


}





//