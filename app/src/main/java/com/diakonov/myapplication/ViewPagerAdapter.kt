package com.diakonov.myapplication

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.diakonov.myapplication.screens.cash.CashFragment
import com.diakonov.myapplication.screens.noncash.NoncashFragment

class ViewPagerAdapter(fragmentActivity: FragmentActivity): FragmentStateAdapter(fragmentActivity) {
    override fun getItemCount(): Int {
        return 2
    }

    override fun createFragment(position: Int): Fragment {
        return when(position){
            0 -> CashFragment()
            else -> NoncashFragment()
        }
    }

}