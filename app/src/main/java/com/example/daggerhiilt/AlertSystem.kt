package com.example.daggerhiilt

import android.util.Log
import javax.inject.Inject

class AlertSystem @Inject constructor(){
    fun startAlerting(){
        Log.d("TAG", "Alerting")
    }
}