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
import com.maxwell.recyclerview.MainActivity
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
        PasswordFocusListener()
        PhoneFocusListener()

    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.btnLogin.setOnClickListener{

            startActivity(Intent(requireActivity(), MainActivity::class.java))

        }



    }

    private fun submitForm(){
        val validPassword =binding.passwordContainer.helperText == null
        val validPhone =binding.phoneContainer.helperText == null

        if(validPhone && validPassword)
            resetForm()
        else
            invalidForm()

    }

    private fun invalidForm(){
        var message = ""
        if(binding.phoneContainer.helperText == null)
            message += "\n\n"
    }

    //Password

    private fun PasswordFocusListener(){
        binding.etxtPassword.setOnFocusChangeListener{ _, focused ->
            if(!focused){
                binding.txtPassword.helperText = validPassword()
            }

        }
    }

    private fun validPassword():String?{
        val passwordText = binding.etxtPassword.text.toString()
        if(passwordText.length <8){
            return "Minimum 8 character Password"
        }
        if(passwordText.matches(".*[A-Z].*".toRegex())) {
            return "Must Contain 1 upper-case Character"
        }
        if(passwordText.matches(".*[a-z].*".toRegex())) {
            return "Must Contain 1 lower-case Character"
        }
        if(passwordText.matches(".*[@#\$%^&+=].*".toRegex())){
            return "Must Contain 1 special character (@#\$%^&+=)"
        }
        return null
    }

    //Phone

    private fun PhoneFocusListener(){
        binding.etxtPhoneNumber.setOnFocusChangeListener{ _, focused ->
            if(!focused){
                binding.phoneContainer.helperText = validPhone()
            }

        }
    }

    private fun validPhone():String?{
        val phoneText = binding.etxtPhoneNumber.text.toString()
        if(!phoneText.matches(".*[0-9].*".toRegex())){
            return "Must be all digits"
        }
        if(phoneText.length != 10){
            return "Must be 10 digits"
        }
        return null

    }


}





//
