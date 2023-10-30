package com.idn.doadandzikir

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.view.Gravity
import android.widget.ImageView
import android.widget.LinearLayout
import androidx.core.content.ContextCompat
import androidx.core.splashscreen.SplashScreen.Companion.installSplashScreen
import androidx.viewpager2.widget.ViewPager2
import com.idn.doadandzikir.Adapter.ArtikelAdapter
import com.idn.doadandzikir.Model.Artikel
import com.idn.doadandzikir.UI.HarianDzikirDoa
import com.idn.doadandzikir.UI.PagiPetangDzikirActivity
import com.idn.doadandzikir.UI.QauliyahShalatActivity
import com.idn.doadandzikir.UI.SetiapSaatDzikir
import com.idn.doadandzikir.UI.detail.DetailArtikelActivity
import com.idn.doadandzikir.Utills.OnItemCallBack

class MainActivity : AppCompatActivity() {
    private var keep = true
    private var runner = Runnable {keep = false}

    private val listArtikel : ArrayList<Artikel> = arrayListOf()

    private val slidingCallback = object : ViewPager2.OnPageChangeCallback(){
        override fun onPageSelected(position: Int) {
            super.onPageSelected(position)
            for (i in 0 until listArtikel.size){
                sliderIndicator[i]?.setImageDrawable(
                    ContextCompat.getDrawable(applicationContext, R.drawable.dot_inactive)
                )
            }

            sliderIndicator[position]?.setImageDrawable(
                ContextCompat.getDrawable(applicationContext, R.drawable.dot_active)
            )

        }
    }

    private lateinit var vpArtikel : ViewPager2
    private lateinit var sliderIndicator : Array<ImageView?>

    //private val listArtikel : ArrayList<Artikel>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        installSplashScreen()
            .setKeepOnScreenCondition { keep }
        Handler().postDelayed(runner, 3000)

        setContentView(R.layout.activity_main)

        initData()
        initView()
        setupViewPager()

    }

    private fun setupViewPager() {
        val llSliderDots : LinearLayout = findViewById(R.id.ll_slider_dots)
        sliderIndicator = arrayOfNulls(listArtikel.size)

        for (i in 0 until listArtikel.size){
            sliderIndicator[i] = ImageView(this)
            sliderIndicator[1]?.setImageDrawable(
                ContextCompat.getDrawable(
                    applicationContext,R.drawable.dot_inactive
                )
            )

            val param = LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.WRAP_CONTENT,
                LinearLayout.LayoutParams.WRAP_CONTENT
            )

            param.setMargins(9,0,8,0)
            param.gravity = Gravity.CENTER_VERTICAL
            llSliderDots.addView(sliderIndicator[i], param)

        }

        sliderIndicator[0]?.setImageDrawable(
            ContextCompat.getDrawable(
                applicationContext, R.drawable.dot_active
            )
        )

    }

    private fun initData(){
        val titleArtikel = resources.getStringArray(R.array.arr_title_artikel)
        val descArtikel = resources.getStringArray(R.array.arr_desc_artikel)
        val imageArtikel = resources.obtainTypedArray(R.array.arr_img_artikel)

        for (i in titleArtikel.indices){
            val data = Artikel(
                imageArtikel.getResourceId(i,0),
                titleArtikel[i],
                descArtikel[i]
            )
            listArtikel.add(data)
        }
        imageArtikel.recycle()
    }

    private fun initView() {
        val llDzikirDoaShlat: LinearLayout = findViewById(R.id.ll_dzikir_doa_shalat)
        llDzikirDoaShlat.setOnClickListener{
            startActivity(Intent(this, QauliyahShalatActivity::class.java))
        }

        val llDzikirSetiapSaat = findViewById<LinearLayout>(R.id.ll_dzikir_setiap_saat)
        llDzikirSetiapSaat.setOnClickListener {
            startActivity(Intent(this, SetiapSaatDzikir::class.java))
        }

        val llDzikirDoaHarian: LinearLayout = findViewById(R.id.ll_dzikir_doa_harian)
        llDzikirDoaHarian.setOnClickListener {
            startActivity(Intent(this, HarianDzikirDoa::class.java))
        }

        val llDzikirPagiPetang: LinearLayout = findViewById(R.id.ll_dzikir_pagi_petang)
        llDzikirPagiPetang.setOnClickListener {
            startActivity(Intent(this, PagiPetangDzikirActivity::class.java))
        }

        vpArtikel = findViewById(R.id.vp_artikel)
        val mAdapter = ArtikelAdapter()
        mAdapter.setData(listArtikel)
        vpArtikel.adapter = mAdapter

        vpArtikel.registerOnPageChangeCallback(slidingCallback)

        mAdapter.setOnItemClickCallback(object : OnItemCallBack{
            override fun onItemClicked(Item: Artikel) {
                val intent = Intent(this@MainActivity, DetailArtikelActivity::class.java)
                intent.putExtra("data", Item)
                startActivity(intent)
            }
        })

    }

}
