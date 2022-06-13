package com.reeta.fragmentproject.transferData

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.FragmentManager
import com.reeta.fragmentproject.R

class TransferDataActivity : AppCompatActivity(),ComminicationListner {

    lateinit var fragmentManager:FragmentManager
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_transfer_data)
        fragmentManager=supportFragmentManager
        launchFragment()
    }

    private fun launchFragment() {
        val transaction=fragmentManager.beginTransaction()
        val fragment=NameFragment()
     //   fragment.setCommunicationListner(this)
        transaction.replace(R.id.fragmentContainer,fragment,"fragmentStudent").commit()
    }

    override fun launchPerformanceFragment(bundle: Bundle) {
        val transaction=fragmentManager.beginTransaction()
        val ageFragment=AgeFragment()
        // for passing data from second fragment that data have bundle and arguments method pass bundle
        ageFragment.arguments = bundle
        transaction.replace(R.id.fragmentContainer,ageFragment,"AgeFragment").commit()
    }
}