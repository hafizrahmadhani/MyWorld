package com.example.myworld

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import androidx.appcompat.app.ActionBar
import androidx.appcompat.widget.Toolbar
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        RecyclerView()
    }

    private fun RecyclerView() {
        rv_country.apply {
            val countryAdapter = ListCountryAdapter(CountryData.listData)
            adapter = countryAdapter
            layoutManager = LinearLayoutManager(context, RecyclerView.VERTICAL, false)
            countryAdapter.setOnItemClickCallback(object : ListCountryAdapter.OnItemClickCallback{
                override fun onItemClicked(data: DataModel) {
                    val intent = Intent(this@MainActivity, CountryDetails::class.java)
                    intent.putExtra("Nama Negara", data)
                    startActivity(intent)
                }
            })
        }
    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        menuInflater.inflate(R.menu.menu_about, menu)
        return super.onCreateOptionsMenu(menu)
    }
    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        setMode(item.itemId)
        return super.onOptionsItemSelected(item)
    }
    private fun setMode(selectedMode: Int) {
        when (selectedMode) {
            R.id.account -> {
                val aboutIntent = Intent(this@MainActivity, About::class.java)
                this@MainActivity.startActivity(aboutIntent)
            }
            R.id.exit -> this.finishAffinity()
        }
    }

}