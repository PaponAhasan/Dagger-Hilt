package com.example.daggerhiilt.modules

import android.content.Context
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ActivityComponent
import dagger.hilt.android.qualifiers.ApplicationContext
import javax.inject.Named
import javax.inject.Qualifier

//Hilt Modules
@Module
//@InstallIn(SingletonComponent::class)
@InstallIn(ActivityComponent::class)
object AlertModule {

    @Provides
    //@Named("noiseAlert")
    @Noise
    fun provideNoiseAlertSystem(@ApplicationContext context: Context) : AlertUser {
        return NoiseAlertSystem(context)
    }

    @Provides
    //@Named("lockAlert")
    @Lock
    fun provideLockAlertSystem(@ApplicationContext context: Context) : AlertUser {
        return LockAlertSystem(context)
    }
}

@Qualifier
@Target(
    AnnotationTarget.FUNCTION,
    AnnotationTarget.PROPERTY_GETTER,
    AnnotationTarget.PROPERTY_SETTER,
    AnnotationTarget.VALUE_PARAMETER,
    AnnotationTarget.FIELD
)
annotation class Lock

@Qualifier
@Target(
    AnnotationTarget.FUNCTION,
    AnnotationTarget.PROPERTY_GETTER,
    AnnotationTarget.PROPERTY_SETTER,
    AnnotationTarget.VALUE_PARAMETER,
    AnnotationTarget.FIELD
)
annotation class Noise