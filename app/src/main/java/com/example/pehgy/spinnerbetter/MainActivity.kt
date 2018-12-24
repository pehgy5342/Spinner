package com.example.pehgy.spinnerbetter

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.Spinner

class MainActivity : AppCompatActivity(), AdapterView.OnItemSelectedListener {
    override fun onNothingSelected(parent: AdapterView<*>?) {
    }

    override fun onItemSelected(parent: AdapterView<*>?, view: View?, position: Int, id: Long) {
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val spinner: Spinner = findViewById(R.id.ColorSpinner)
        spinner.onItemSelectedListener = this
        //創建一個ArrayAdapter裡面引用values中的array.xml以及默認的spinner layout
        ArrayAdapter.createFromResource(this, R.array.color, android.R.layout.simple_spinner_item)
            .also { adapter ->

                adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
                spinner.adapter = adapter
            }


    }
}
