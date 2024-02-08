package com.example.daggerhiilt

import com.example.daggerhiilt.modules.AlertUser
import com.example.daggerhiilt.modules.Noise
import javax.inject.Inject
import javax.inject.Named

//Constructor Injection
class House @Inject constructor(
    private val alertSystem: AlertSystem,
    //@Named("lockAlert")
    @Noise private val alertUser: AlertUser
) {

    fun alert() {
        alertSystem.startAlerting()
    }

    fun userAlert() {
        alertUser.startUserAlerting()
    }
}