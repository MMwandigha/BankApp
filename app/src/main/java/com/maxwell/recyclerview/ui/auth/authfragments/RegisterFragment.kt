package com.maxwell.recyclerview.ui.auth.authfragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
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

        return binding.root
        checkAllFields()

    }

    private fun checkAllFields(): Boolean {

        val registerName = binding.etxtUsername.text.toString()
        val registerEmail = binding.etxtEmail.text.toString()
        val registerPassword = binding.etxtPassword.text.toString()
        val registerConfirmPassword = binding.etxtConfirmPassword.text.toString()
        val registerPhone = binding.etxtPhoneNumber.text.toString()


        if (registerName.isEmpty()) {
            registerName.setError("This field is required")
            return false
        }

        if (registerEmail.isEmpty()) {
            registerEmail.setError("Email is required")
            return false
        }
        if (registerPassword.isEmpty()) {
            registerPassword.setError("Password is required")
            return false

        } else if (registerPassword.length < 8) {
            registerPassword.setError("Password must be minimum 8 characters")
            return false
        }

        if (registerPhone.length == 0) {
            registerPhone.setError("Phone Number is Required")
            return false

        } else if (registerPhone.length != 10) {
            registerPhone.setError("Phone Number should have 10 digits")

            return false
        }else{
            return true
        }
        }
    }






