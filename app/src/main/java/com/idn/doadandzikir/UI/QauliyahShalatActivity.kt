package com.idn.doadandzikir.UI

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.idn.doadandzikir.Adapter.DoadanDzikirAdapter
import com.idn.doadandzikir.Model.DataDoaDzikir
import com.idn.doadandzikir.R
import com.idn.doadandzikir.databinding.ActivityQauliyahShalat2Binding
import java.io.DataInput

class QauliyahShalatActivity : AppCompatActivity() {

    private var _binding : ActivityQauliyahShalat2Binding? = null
    private val binding get() = _binding as ActivityQauliyahShalat2Binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        _binding = ActivityQauliyahShalat2Binding.inflate(layoutInflater)
        setContentView(binding.root)

        val mAdapter = DoadanDzikirAdapter()
        mAdapter.setData(DataDoaDzikir.listDataQauliyah)
        binding.rvQauliyahShalat.adapter = mAdapter
        binding.rvQauliyahShalat.layoutManager = LinearLayoutManager(this)
    }

    override fun onSupportNavigateUp(): Boolean {
        onBackPressedDispatcher.onBackPressed()
        finish()
        return super.onSupportNavigateUp()
    }

    override fun onDestroy() {
        super.onDestroy()
        _binding = null
    }

}