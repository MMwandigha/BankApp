package com.maxwell.recyclerview.ui.auth.authfragments

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.text.InputFilter.LengthFilter
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.View.OnFocusChangeListener
import android.view.ViewGroup
import android.widget.Toast
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProviders
import androidx.navigation.findNavController
import com.maxwell.recyclerview.MainActivity
import com.maxwell.recyclerview.R
import com.maxwell.recyclerview.databinding.FragmentLoginBinding
import com.maxwell.recyclerview.ui.auth.AuthListener
import com.maxwell.recyclerview.ui.auth.AuthViewModel
import com.maxwell.recyclerview.util.toast


class LoginFragment : Fragment(), AuthListener {


    private lateinit var binding: FragmentLoginBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {


        // Inflate the layout for this fragment
        binding= FragmentLoginBinding.inflate(inflater, container, false)
        return binding.root

    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val viewModel = ViewModelProviders.of(this).get(AuthViewModel::class.java)
        binding.viewmodel=viewModel

        viewModel.authListener=this

        binding.txtNotRegistered.setOnClickListener{

            view.findNavController().navigate(R.id.action_loginFragment_to_registerFragment2)

        }

        binding.btnLogin.setOnClickListener {
            if (checkAllFields()){
                Log.e("TAG", "onViewCreated: ${binding.etxtPhoneNumber.text.toString()}" )
                startActivity(Intent(requireActivity(), MainActivity:: class.java))
            }
        }

        binding.etxtPhoneNumber.filters += LengthFilter(9)

        binding.etxtPhoneNumber.onFocusChangeListener = OnFocusChangeListener { _, hasFocus ->
            if (hasFocus) {
                binding.etxtPhoneNumber.hint = "710184980"
            } else {
                binding.etxtPhoneNumber.hint = ""
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

        } else if (loginPhone.length != 9) {
            binding.etxtPhoneNumber.error = "Phone Number should have 10 digits"

            return false
        }
            else{
            return true
        }
    }

    override fun onStarted() {
        requireActivity().toast("Login Success")
    }

    override fun onSuccess() {
        requireActivity().toast("Login Succesful")
    }

    override fun onFailure(message: String) {
        requireActivity().toast(message)
    }




}





//
