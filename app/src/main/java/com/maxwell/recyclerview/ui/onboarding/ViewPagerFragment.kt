package com.maxwell.recyclerview.ui.onboarding

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.maxwell.recyclerview.R
import com.maxwell.recyclerview.ui.onboarding.screens.FirstScreenFragment
import com.maxwell.recyclerview.ui.onboarding.screens.SecondScreenFragment
import com.maxwell.recyclerview.ui.onboarding.screens.ThirdScreenFragment
import kotlinx.android.synthetic.main.fragment_view_pager.view.*

class ViewPagerFragment : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_view_pager, container, false)

        val fragmentList = arrayListOf<Fragment>(
            FirstScreenFragment(),
            SecondScreenFragment(),
            ThirdScreenFragment()
        )

        val adapter = ViewPagerAdapter(
            fragmentList,
            requireActivity().supportFragmentManager,
            lifecycle
        )

        view.myViewpager.adapter = adapter
        return view
    }


}