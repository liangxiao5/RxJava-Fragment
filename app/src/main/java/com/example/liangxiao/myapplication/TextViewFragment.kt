package com.example.liangxiao.myapplication

import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.textview_fragment.*

/**
 * Created by liangxiao on 2018/5/19.
 */
class TextViewFragment: Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.textview_fragment,container,false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val editFragment:EditFragment = fragmentManager.findFragmentById(R.id.editText_fragment) as EditFragment
        editFragment.observable?.subscribe({
            text.text = it
        })

    }
}