package com.reeta.fragmentproject.transferData

import android.content.Context
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import com.reeta.fragmentproject.R
import com.reeta.fragmentproject.databinding.FragmentStudentPersonalDetailsBinding

class NameFragment : Fragment(R.layout.fragment_student_personal_details) {

    lateinit var fragmentBinding: FragmentStudentPersonalDetailsBinding

    lateinit var listner: ComminicationListner

    override fun onAttach(context: Context) {
        super.onAttach(context)
        listner=context as ComminicationListner
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        fragmentBinding=DataBindingUtil.inflate(inflater,R.layout.fragment_student_personal_details,container,false)
        return fragmentBinding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        fragmentBinding.apply {
            btnNext.setOnClickListener {
                var name=edtName.text.toString()
                var bundle=Bundle()
                bundle.putString("name",name)
                if (listner!=null){
                    listner.launchPerformanceFragment(bundle)
                }
            }
        }
    }


//    fun setCommunicationListner(listner: ComminicationListner){
//        this.listner=listner
//    }


}