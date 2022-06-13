package com.reeta.fragmentproject

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.reeta.fragmentproject.backStackFragment.BackStackActivity
import com.reeta.fragmentproject.commitAllowStateMethod.CommitActivity
import com.reeta.fragmentproject.databinding.ActivityMainBinding
import com.reeta.fragmentproject.staticFragment.StaticActivity
import com.reeta.fragmentproject.transferData.TransferDataActivity
import com.reeta.fragmentproject.viewPager.ViewPagerLaungingActivity

class MainActivity : AppCompatActivity() {
    lateinit var binding:ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=DataBindingUtil.setContentView(this,R.layout.activity_main)
        binding.apply {
            btnStaticFragment.setOnClickListener {
                val intent=Intent(this@MainActivity,StaticActivity::class.java)
                startActivity(intent)
            }

            btnBackStackFragment.setOnClickListener {
                val intent=Intent(this@MainActivity,BackStackActivity::class.java)
                startActivity(intent)
            }

            btnCommitAllowStateMethod.setOnClickListener {
                val intent=Intent(this@MainActivity,CommitActivity::class.java)
                startActivity(intent)
            }

            btnTransferData.setOnClickListener {
                val intent=Intent(this@MainActivity,TransferDataActivity::class.java)
                startActivity(intent)
            }

            btnViewPager.setOnClickListener {
                val intent=Intent(this@MainActivity,ViewPagerLaungingActivity::class.java)
                startActivity(intent)
            }
        }
    }
}