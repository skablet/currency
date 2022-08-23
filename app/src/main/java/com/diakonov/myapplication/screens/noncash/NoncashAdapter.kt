package com.diakonov.myapplication.screens.noncash

import android.annotation.SuppressLint
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.diakonov.myapplication.databinding.ItemMoneyLayoutBinding
import com.diakonov.myapplication.model.noncash.NonCashItem

class NonCashAdapter: RecyclerView.Adapter<NonCashAdapter.NonCashViewHolder>() {

    var listNonCash = emptyList<NonCashItem>()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): NonCashViewHolder {
        val binding = ItemMoneyLayoutBinding
            .inflate(LayoutInflater.from(parent.context), parent, false)

        return NonCashViewHolder(binding)
    }

    override fun onBindViewHolder(holder: NonCashViewHolder, position: Int) {
        val nonCashItem : NonCashItem = listNonCash[position]
        holder.bind(nonCashItem)
    }

    override fun getItemCount(): Int {
        return listNonCash.size
    }

    @SuppressLint("NotifyDataSetChanged")
    fun setList(list: List<NonCashItem>){
        listNonCash = list
        notifyDataSetChanged()
    }

    class NonCashViewHolder(private val binding: ItemMoneyLayoutBinding)
        : RecyclerView.ViewHolder(binding.root){
        fun bind(nonCashItem: NonCashItem){
            binding.itemName.text = nonCashItem.ccy
            binding.itemBuy.text = nonCashItem.buy
            binding.itemSell.text = nonCashItem.sale
        }
    }
}