package com.aleangelozi.smartmaterialspinnerkotlin

import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.chivorn.smartmaterialspinner.SmartMaterialSpinner

class MainActivity : AppCompatActivity() {

    private lateinit var spProvince : SmartMaterialSpinner<String>
    private lateinit var provinceList : MutableList<String>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        initSpinner()
    }

    private fun initSpinner() {
        spProvince = findViewById(R.id.spinner1)
        provinceList = ArrayList()

        provinceList.add("Americana")
        provinceList.add("Álvares Machado")
        provinceList.add("Campinas")
        provinceList.add("Cáceres")
        provinceList.add("Santos")
        provinceList.add("São Paulo")

        spProvince.item = provinceList

        spProvince.onItemSelectedListener = object : AdapterView.OnItemSelectedListener {
            override fun onItemSelected(
                parent: AdapterView<*>?,
                view: View?,
                position: Int,
                id: Long
            ) {
                val text = findViewById<TextView>(R.id.textView)
                text.text = provinceList[position]

            }
            override fun onNothingSelected(adapterView: AdapterView<*>) {}
        }
    }
}