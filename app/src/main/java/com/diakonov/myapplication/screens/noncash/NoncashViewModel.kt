package com.diakonov.myapplication.screens.noncash

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.diakonov.myapplication.data.repository.Repository
import com.diakonov.myapplication.model.noncash.NonCash
import kotlinx.coroutines.launch
import retrofit2.Response

class NoncashViewModel: ViewModel() {

    var repo = Repository()
    val moneyList: MutableLiveData<Response<NonCash>> = MutableLiveData()

    fun getNonCashMoney(){
        viewModelScope.launch {
            moneyList.value = repo.getNonCash()
        }
    }

}