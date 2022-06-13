package com.reeta.fragmentproject.backStackFragment

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentTransaction
import com.reeta.fragmentproject.R
import com.reeta.fragmentproject.databinding.ActivityBackStackBinding

class BackStackActivity : AppCompatActivity() {

    lateinit var binding:ActivityBackStackBinding
    lateinit var fragmentManager:FragmentManager
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityBackStackBinding.inflate(layoutInflater)
        setContentView(binding.root)
        fragmentManager=supportFragmentManager
        binding.apply {

            btnAddA.setOnClickListener {
                val transcation=fragmentManager.beginTransaction()
                val aFragment=AFragment()
                transcation.add(R.id.frmContainer,aFragment,"FragmentA").addToBackStack("fragA").commit()
            }

            btnRemoveA.setOnClickListener {
               val fragmentA=fragmentManager.findFragmentByTag("FragmentA")
                if (fragmentA!=null){
                   val transaction: FragmentTransaction=fragmentManager.beginTransaction()
                    transaction.remove(fragmentA).addToBackStack("fragA").commit()
                }
            }

            btnReplaceAWithoutBackstack.setOnClickListener {
                val transcation=fragmentManager.beginTransaction()
                val bFragment=BFragment()
                transcation.replace(R.id.frmContainer,bFragment,"FragmentB").commit()
            }

            btnReplceAWithBWithBackstack.setOnClickListener {
                val transcation=fragmentManager.beginTransaction()
                val bFragment=BFragment()
                transcation.replace(R.id.frmContainer,bFragment,"FragmentB").addToBackStack("FragB").commit()
            }

            btnAddB.setOnClickListener {
                val transcation=fragmentManager.beginTransaction()
                val bFragment=BFragment()
                transcation.add(R.id.frmContainer,bFragment,"FragmentB").commit()
            }

            btnRemoveB.setOnClickListener {
              val fragmentB=fragmentManager.findFragmentByTag("FragmentB")
                if (fragmentB!=null){
                    val transaction=fragmentManager.beginTransaction()
                    transaction.remove(fragmentB).commit()
                }

            }

            btnReplaceBWithA.setOnClickListener {
                val transcation=fragmentManager.beginTransaction()
                val aFragment=AFragment()
                transcation.replace(R.id.frmContainer,aFragment,"FragmentA").commit()
            }

        }

    }


}