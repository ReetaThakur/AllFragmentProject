package com.reeta.fragmentproject.backStackFragment

import android.content.Context
import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.reeta.fragmentproject.R


class BFragment : Fragment(R.layout.fragment_b) {
    private val TAG="reeta"

    override fun onAttach(context: Context) {
        super.onAttach(context)
        setLog("Fragment B onAttach")
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setLog("Fragment B onCreate")
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        setLog("Fragment B onCreateView")
        return super.onCreateView(inflater, container, savedInstanceState)

    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        setLog("Fragment B onActivityCreated")
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        setLog("Fragment B onViewCreated")
    }

    override fun onStart() {
        super.onStart()
        setLog("Fragment B onStart")
    }

    override fun onResume() {
        super.onResume()
        setLog("Fragment B onResume")
    }

    override fun onPause() {
        super.onPause()
        setLog("Fragment B onPause")
    }

    override fun onStop() {
        super.onStop()
        setLog("Fragment B onStop")
    }

    override fun onDestroyView() {
        super.onDestroyView()
        setLog("Fragment B onDestroyView")
    }

    override fun onDestroy() {
        super.onDestroy()
        setLog("Fragment B onDestroy")
    }

    override fun onDetach() {
        super.onDetach()
        setLog("Fragment B onDetach")
    }

    fun setLog(log:String){
        Log.d(TAG,log)
    }
}