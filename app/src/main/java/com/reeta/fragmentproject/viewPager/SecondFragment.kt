package com.reeta.fragmentproject.viewPager

import android.content.Context
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import com.reeta.fragmentproject.R
import com.reeta.fragmentproject.databinding.FragmentSecondBinding

class SecondFragment : Fragment(R.layout.fragment_second) {

    lateinit var binding:FragmentSecondBinding
    lateinit var activity: ViewPagerLaungingActivity

    override fun onAttach(context: Context) {
        super.onAttach(context)
        activity= context as ViewPagerLaungingActivity
    }
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding=DataBindingUtil.inflate(inflater,R.layout.fragment_second,container,false)
        return binding.root
    }


    override fun onResume() {
        super.onResume()
        binding.tvGetName.text=activity.getDataPlace()
    }

}