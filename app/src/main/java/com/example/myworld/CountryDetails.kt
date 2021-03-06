package com.example.myworld

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_country_details.*

class CountryDetails : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_country_details)
        recyclerView2()
    }

    private fun recyclerView2() {
        val call = intent.getParcelableExtra<DataModel>("Nama Negara")
        call?.imgBig_received?.let { imgBig_received.setImageResource(it) }
        title_received.text = call?.title_received
        desc_received.text = call?.desc_received
        call?.imgFlag?.let { country_flag.setImageResource(it) }
        motto_received.text = call?.motto_received
        capitalCity_received.text = call?.capital_received
        language_received.text = call?.language_received
        government_received.text = call?.gov_received
        population_received.text = call?.population_received
        currency_received.text = call?.currency_received
    }
}