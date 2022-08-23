package com.diakonov.myapplication.model.noncash

data class NonCashItem(
    val base_ccy: String,
    val buy: String,
    val ccy: String,
    val sale: String
)