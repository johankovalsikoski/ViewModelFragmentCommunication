package br.com.getnet.superget.viewmodelfragmentcommunication

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter

class ViewPagerAdapter(fragmentManager: FragmentManager, private val pageViewModel: PageViewModel) : FragmentPagerAdapter(fragmentManager) {

    override fun getItem(position: Int): Fragment
        = when(position) {
        0-> FirstFragment(pageViewModel = pageViewModel)
        else -> SecondFragment(pageViewModel = pageViewModel)
    }

    override fun getCount(): Int = 2

    override fun getPageTitle(position: Int): CharSequence?
        = when(position) {
        0-> "Salvar"
        else -> "Ler"
    }

}