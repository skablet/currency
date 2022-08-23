package com.diakonov.myapplication.screens.root

import android.content.Context
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.FragmentActivity
import com.diakonov.myapplication.R
import com.diakonov.myapplication.ViewPagerAdapter
import com.diakonov.myapplication.databinding.FragmentRootBinding
import com.google.android.material.tabs.TabLayoutMediator


class RootFragment : Fragment() {

    private var ctx: Context ?= null

    override fun onAttach(context: Context) {
        super.onAttach(context)
        ctx = context
    }


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View? {
        val bindingRootFragment = FragmentRootBinding.inflate(inflater)

        bindingRootFragment.viewPager.adapter = ViewPagerAdapter(ctx as FragmentActivity)
        bindingRootFragment.tabLayout.tabIconTint = null
        TabLayoutMediator(bindingRootFragment.tabLayout, bindingRootFragment.viewPager){
            tab, pos ->
            when(pos){
                0 -> {
                    tab.setIcon(R.drawable.ic_baseline_attach_money_24)
                }
                1 -> {
                    tab.setIcon(R.drawable.ic_baseline_money_off_24)
                }
            }
        }.attach()

        return bindingRootFragment.root
    }
}