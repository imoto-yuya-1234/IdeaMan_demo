package com.example.yuya.ideaman_demo

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.design.widget.FloatingActionButton

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val AddListButton: FloatingActionButton? = findViewById(R.id.fab_add_list)
        AddListButton?.setOnClickListener { displayDialog() }
    }

    private fun displayDialog() {
        AddListDialog.newInstance().show(fragmentManager, "dialog")
    }
}
