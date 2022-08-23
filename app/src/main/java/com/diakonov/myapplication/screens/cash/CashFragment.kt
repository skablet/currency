package com.diakonov.myapplication.screens.cash

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.diakonov.myapplication.R
import com.diakonov.myapplication.databinding.FragmentCashBinding
import com.diakonov.myapplication.databinding.FragmentNoncashBinding


class CashFragment : Fragment() {

    lateinit var recyclerView: RecyclerView
    lateinit var adapter: CashAdapter

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View? {

        val viewModel = ViewModelProvider(this).get(CashViewModel::class.java)
        val bindingCashFragment = FragmentCashBinding.inflate(inflater)

        recyclerView = bindingCashFragment.rvCash

        adapter = CashAdapter()
        recyclerView.adapter = adapter

        viewModel.getCashMoney()
        viewModel.moneyList.observe(viewLifecycleOwner) { list ->
            list.body()?.let { adapter.setList(it)}}

        return bindingCashFragment.root
    }
}