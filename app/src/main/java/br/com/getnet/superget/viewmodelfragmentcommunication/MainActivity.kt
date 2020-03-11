package br.com.getnet.superget.viewmodelfragmentcommunication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.viewModels
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(R.layout.activity_main) {

    private val pageViewModel: PageViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val viewPagerAdapter = ViewPagerAdapter(supportFragmentManager, pageViewModel)
        view_pager.adapter = viewPagerAdapter
        tabs.setupWithViewPager(view_pager)

    }
}
