package com.example.daggerhiilt.modules

import android.content.Context
import android.util.Log
import com.example.daggerhiilt.R

class NoiseAlertSystem(
    private val context: Context
): AlertUser {
    override fun startUserAlerting() {
        Log.d("TAG", context.getString(R.string.noise))
    }
}