package com.diakonov.myapplication.screens.cash

import android.annotation.SuppressLint
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.diakonov.myapplication.R
import com.diakonov.myapplication.binding
import com.diakonov.myapplication.databinding.ItemMoneyLayoutBinding
import com.diakonov.myapplication.model.cash.CashItem

class CashAdapter: RecyclerView.Adapter<CashAdapter.CashViewHolder>() {

    var listCash = emptyList<CashItem>()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CashViewHolder{
        val binding = ItemMoneyLayoutBinding
            .inflate(LayoutInflater.from(parent.context), parent, false)

        return CashViewHolder(binding)
    }

    override fun onBindViewHolder(holder: CashViewHolder, position: Int) {
        val cashItem : CashItem = listCash[position]
        holder.bind(cashItem)
    }

    override fun getItemCount(): Int {
        return listCash.size
    }

    @SuppressLint("NotifyDataSetChanged")
    fun setList(list: List<CashItem>){
        listCash = list
        notifyDataSetChanged()
    }

    class CashViewHolder(private val binding: ItemMoneyLayoutBinding)
        : RecyclerView.ViewHolder(binding.root){
            fun bind(cashItem: CashItem){
                binding.itemName.text = cashItem.ccy
                binding.itemBuy.text = cashItem.buy
                binding.itemSell.text = cashItem.sale
        }
    }
}