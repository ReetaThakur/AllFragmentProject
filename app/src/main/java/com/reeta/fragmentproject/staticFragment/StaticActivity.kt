package com.reeta.fragmentproject.staticFragment

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.reeta.fragmentproject.R

class StaticActivity : AppCompatActivity() {

    private val TAG="reeta"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_static)
        setLog("Activity onCreate")
    }

    override fun onStart() {
        super.onStart()
        setLog("Activity onStart")
    }

    override fun onResume() {
        super.onResume()
        setLog("Activity onResume")
    }

    override fun onPause() {
        super.onPause()
        setLog("Activity onPause")
    }

    override fun onStop() {
        super.onStop()
        setLog("Activity onStop")
    }

    override fun onRestart() {
        super.onRestart()
        setLog("Activity onRestart")
    }

    override fun onDestroy() {
        super.onDestroy()
        setLog("Activity onDestroy")
    }

    fun setLog(log:String){
        Log.d(TAG,log)
    }
}