package com.maxwell.recyclerview.ui.auth.authfragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.navigation.findNavController
import com.maxwell.recyclerview.R
import com.maxwell.recyclerview.databinding.FragmentRegisterBinding


class RegisterFragment : Fragment() {


    private lateinit var binding: FragmentRegisterBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment


        binding = FragmentRegisterBinding.inflate(inflater, container, false)
        checkAllFields()
        return binding.root



    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.txtAlreadyRegistered.setOnClickListener {
            if (checkAllFields()) {

                view.findNavController().navigate(R.id.action_registerFragment_to_loginFragment)
            }
        }

        binding.btnRegister.setOnClickListener {
            if (checkAllFields()) {
                view.findNavController().navigate(R.id.action_registerFragment_to_loginFragment)
            }

        }


    }

    private fun checkAllFields(): Boolean {

        val registerName = binding.etxtUsername.text.toString()
        val registerEmail = binding.etxtEmail.text.toString()
        val registerPassword = binding.etxtPassword.text.toString()
        val registerConfirmPassword = binding.etxtConfirmPassword.text.toString()
        val registerPhone = binding.etxtPhoneNumber.text.toString()


        if (registerName.isEmpty()) {
            binding.etxtUsername.error = "This field is required"
            return false
        }

        if (registerEmail.isEmpty()) {
            binding.etxtEmail.error = "Email is required"
            return false
        }
        if (registerPassword.isEmpty()) {
            binding.etxtPassword.error = "Password is required"
            return false
        } else if (registerPassword.length < 8) {
            binding.etxtPassword.error = "Password must be minimum 8 characters"
            return false
        }

        if (registerConfirmPassword.isEmpty()) {
            binding.etxtConfirmPassword.error = "Tis field is required"
            return false

        } else if (registerConfirmPassword != registerPassword){
            binding.etxtConfirmPassword.error = "This password does not match"
        }

        if (registerPhone.isEmpty()) {
            binding.etxtPhoneNumber.error = "Phone Number is Required"
            return false

        } else if (registerPhone.length != 10) {
            binding.etxtPhoneNumber.error = "Phone Number should have 10 digits"

            return false
        }else{
            return true
        }
        }
    }






