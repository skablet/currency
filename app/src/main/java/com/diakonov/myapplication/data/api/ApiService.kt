package com.diakonov.myapplication.data.api

import com.diakonov.myapplication.model.cash.Cash
import com.diakonov.myapplication.model.cash.CashItem
import com.diakonov.myapplication.model.noncash.NonCash
import retrofit2.Response
import retrofit2.http.GET

interface ApiService {

    @GET( "p24api/pubinfo?json&exchange&coursid=5")
    suspend fun getCashCcy(): Response<Cash>

    @GET( "p24api/pubinfo?exchange&json&coursid=11")
    suspend fun getNonCashCcy(): Response<NonCash>
}