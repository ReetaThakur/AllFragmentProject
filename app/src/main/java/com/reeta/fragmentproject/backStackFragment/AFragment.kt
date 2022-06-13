package com.reeta.fragmentproject.backStackFragment

import android.content.Context
import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.reeta.fragmentproject.R


class AFragment : Fragment(R.layout.fragment_a) {
    private val TAG="reeta"

    override fun onAttach(context: Context) {
        super.onAttach(context)
        setLog("Fragment A onAttach")
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setLog("Fragment A onCreate")
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        setLog("Fragment A onCreateView")
        return super.onCreateView(inflater, container, savedInstanceState)

    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        setLog("Fragment A onActivityCreated")
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        setLog("Fragment A onViewCreated")
    }

    override fun onStart() {
        super.onStart()
        setLog("Fragment A onStart")
    }

    override fun onResume() {
        super.onResume()
        setLog("Fragment A onResume")
    }

    override fun onPause() {
        super.onPause()
        setLog("Fragment A onPause")
    }

    override fun onStop() {
        super.onStop()
        setLog("Fragment A onStop")
    }

    override fun onDestroyView() {
        super.onDestroyView()
        setLog("Fragment A onDestroyView")
    }

    override fun onDestroy() {
        super.onDestroy()
        setLog("Fragment A onDestroy")
    }

    override fun onDetach() {
        super.onDetach()
        setLog("Fragment A onDetach")
    }

    fun setLog(log:String){
        Log.d(TAG,log)
    }
}