package com.reeta.fragmentproject.viewPager

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.viewpager2.widget.ViewPager2
import com.google.android.material.tabs.TabLayout
import com.google.android.material.tabs.TabLayoutMediator
import com.google.android.material.tabs.TabLayoutMediator.TabConfigurationStrategy
import com.reeta.fragmentproject.R

class ViewPagerLaungingActivity : AppCompatActivity() {

    lateinit var tab:TabLayout
    lateinit var viewPager2: ViewPager2
    var place:String=""
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_view_pager_launging)
        tab=findViewById(R.id.tabAll)
        viewPager2=findViewById(R.id.viewPager)
        setAdapter()
    }

    private fun setAdapter() {
        val pagerAdapter=PagerAdapter(supportFragmentManager,lifecycle)
        viewPager2.adapter=pagerAdapter
        TabLayoutMediator(tab, viewPager2) { tab, position ->
            tab.text="Fragment-$position"
        }.attach()
    }

    fun setDataPlace(place:String){
        this.place=place
    }

    fun getDataPlace():String{
        return place
    }
}