package com.example.liangxiao.myapplication

import android.support.v7.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        supportFragmentManager.beginTransaction()
                .add(R.id.textView_fragment,TextViewFragment(),TextViewFragment.TAG)
                .add(R.id.editText_fragment,EditFragment(),EditFragment.TAG)
                .commit()
    }
}
