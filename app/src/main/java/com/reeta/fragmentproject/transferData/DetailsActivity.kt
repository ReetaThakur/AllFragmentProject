package com.reeta.fragmentproject.transferData

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.reeta.fragmentproject.R
import com.reeta.fragmentproject.databinding.ActivityDetailsBinding

class DetailsActivity : AppCompatActivity() {
    lateinit var binding:ActivityDetailsBinding
    lateinit var model: Model
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=DataBindingUtil.setContentView(this,R.layout.activity_details)
        model= intent.getSerializableExtra("modelClass") as Model
        binding.apply {

            tvName.text=model.name
            tvAge.text= model.age.toString()
        }
    }
}