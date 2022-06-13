package com.reeta.fragmentproject.transferData

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import com.reeta.fragmentproject.R
import com.reeta.fragmentproject.databinding.FragmentAgeBinding


class AgeFragment : Fragment(R.layout.fragment_age) {

    lateinit var ageBinding:FragmentAgeBinding
    private var name=""


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        if (arguments !=null){
            name= arguments?.getString("name").toString()

        }
    }
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        ageBinding=DataBindingUtil.inflate(inflater,R.layout.fragment_age,container,false)
        return ageBinding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        ageBinding.apply {
            btnNextActivity.setOnClickListener {
                var age=edtAge.text.toString().toInt()
                val intent=Intent(context,DetailsActivity::class.java)
                val model=Model(name,age)
                intent.putExtra("modelClass",model)
                startActivity(intent)
            }
        }
    }

}