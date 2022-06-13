package com.reeta.fragmentproject.viewPager

import android.content.Context
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import com.reeta.fragmentproject.R
import com.reeta.fragmentproject.databinding.FragmentFirstBinding


class FirstFragment : Fragment(R.layout.fragment_first) {

    lateinit var binding:FragmentFirstBinding
    lateinit var viewPagerLaungingActivity: ViewPagerLaungingActivity

    override fun onAttach(context: Context) {
        super.onAttach(context)
        viewPagerLaungingActivity= context as ViewPagerLaungingActivity

    }
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding=DataBindingUtil.inflate(inflater,R.layout.fragment_first,container,false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.apply {
             btnGoNext.setOnClickListener {
                 var place=edtPlace.text.toString()
                 if (viewPagerLaungingActivity!=null){
                     viewPagerLaungingActivity.setDataPlace(place)
                 }
             }
        }
    }

}