package com.example.viewmodelscopepractice

import androidx.lifecycle.ViewModel
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.Job
import kotlinx.coroutines.launch

class MainActivityViewModel: ViewModel() {
    private val myJob = Job()
    private val myScope= CoroutineScope(Dispatchers.IO+myJob)

    fun getUserData(){
        myScope.launch {

        }
    }

    override fun onCleared() {
        super.onCleared()
        myJob.cancel()
    }
}