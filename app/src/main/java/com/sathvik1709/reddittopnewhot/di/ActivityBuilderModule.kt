package com.sathvik1709.reddittopnewhot.di

import com.sathvik1709.reddittopnewhot.activities.MainActivity
import dagger.Module
import dagger.android.ContributesAndroidInjector

@Module
abstract class ActivityBuilderModule {

    @ContributesAndroidInjector
    abstract fun bindMainActivity(): MainActivity

}
