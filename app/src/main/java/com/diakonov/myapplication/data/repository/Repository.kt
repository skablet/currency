package com.diakonov.myapplication.data.repository

import com.diakonov.myapplication.data.api.RetrofitInstance
import com.diakonov.myapplication.model.cash.Cash
import com.diakonov.myapplication.model.cash.CashItem
import com.diakonov.myapplication.model.noncash.NonCash
import retrofit2.Response

class Repository {

    suspend fun getCash(): Response<Cash>{
        return RetrofitInstance.api.getCashCcy()
    }
    suspend fun getNonCash(): Response<NonCash>{
        return RetrofitInstance.api.getNonCashCcy()
    }

}