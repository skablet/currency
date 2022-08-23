package com.diakonov.myapplication.screens.cash

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.diakonov.myapplication.data.repository.Repository
import com.diakonov.myapplication.model.cash.Cash
import kotlinx.coroutines.launch
import retrofit2.Response

class CashViewModel: ViewModel() {

    var repo = Repository()
    val moneyList: MutableLiveData<Response<Cash>> = MutableLiveData()

    fun getCashMoney(){
        viewModelScope.launch {
            moneyList.value = repo.getCash()
        }
    }


}