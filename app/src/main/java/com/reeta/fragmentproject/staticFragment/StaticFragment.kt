package com.reeta.fragmentproject.staticFragment

import android.content.Context
import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.reeta.fragmentproject.R

class StaticFragment : Fragment(R.layout.fragment_static) {

    private val TAG="reeta"

    override fun onAttach(context: Context) {
        super.onAttach(context)
        setLog("Fragment onAttach")
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setLog("Fragment onCreate")
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        setLog("Fragment onCreateView")
        return super.onCreateView(inflater, container, savedInstanceState)

    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        setLog("Fragment onActivityCreated")
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        setLog("Fragment onViewCreated")
    }

    override fun onStart() {
        super.onStart()
        setLog("Fragment onStart")
    }

    override fun onResume() {
        super.onResume()
        setLog("Fragment onResume")
    }

    override fun onPause() {
        super.onPause()
        setLog("Fragment onPause")
    }

    override fun onStop() {
        super.onStop()
        setLog("Fragment onStop")
    }

    override fun onDestroyView() {
        super.onDestroyView()
        setLog("Fragment onDestroyView")
    }

    override fun onDestroy() {
        super.onDestroy()
        setLog("Fragment onDestroy")
    }

    override fun onDetach() {
        super.onDetach()
        setLog("Fragment onDetach")
    }

    fun setLog(log:String){
        Log.d(TAG,log)
    }
}

