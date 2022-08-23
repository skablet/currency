package com.diakonov.myapplication.screens.noncash

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.RecyclerView
import com.diakonov.myapplication.R
import com.diakonov.myapplication.databinding.FragmentCashBinding
import com.diakonov.myapplication.databinding.FragmentNoncashBinding
import com.diakonov.myapplication.databinding.FragmentRootBinding
import com.diakonov.myapplication.screens.cash.CashAdapter

class NoncashFragment : Fragment() {

    lateinit var recyclerView: RecyclerView
    lateinit var adapter: NonCashAdapter

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val viewModel = ViewModelProvider(this).get(NoncashViewModel::class.java)
        val bindingNoncashFragment = FragmentNoncashBinding.inflate(inflater)

        recyclerView = bindingNoncashFragment.rvNoncash
        adapter = NonCashAdapter()
        recyclerView.adapter = adapter

        viewModel.getNonCashMoney()
        viewModel.moneyList.observe(viewLifecycleOwner) { list ->
            list.body()?.let { adapter.setList(it)}}

        return bindingNoncashFragment.root
    }
}
