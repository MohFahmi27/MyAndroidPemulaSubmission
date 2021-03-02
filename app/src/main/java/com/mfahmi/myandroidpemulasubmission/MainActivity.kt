package com.mfahmi.myandroidpemulasubmission

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.mfahmi.myandroidpemulasubmission.LokasiHorror.LokasiHorrorAdapter
import com.mfahmi.myandroidpemulasubmission.LokasiHorror.LokasiHorrorData

class MainActivity : AppCompatActivity() {

    private lateinit var recyclerView: RecyclerView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        recyclerView = findViewById(R.id.rv_main)
        recyclerView.layoutManager = LinearLayoutManager(this)
        val lokasiHorrorData = LokasiHorrorData()
        recyclerView.adapter = LokasiHorrorAdapter(lokasiHorrorData.lokasiBerhantu)
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        super.onCreateOptionsMenu(menu)
        menuInflater.inflate(R.menu.menu, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when(item.itemId) {
            R.id.about_me -> {
                val intent = Intent(this, AboutActivity::class.java)
                startActivity(intent)
            }
        }
        return super.onOptionsItemSelected(item)
    }

}