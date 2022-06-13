package com.reeta.fragmentproject.commitAllowStateMethod

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import com.reeta.fragmentproject.R

class CommitActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_commit)
    }

    override fun onResume() {
        super.onResume()
        Handler().postDelayed(Runnable{
            supportFragmentManager.beginTransaction().add(R.id.frmConstrains,LoginFragment())
                .commitAllowingStateLoss()
                                      },3000)
    }

}