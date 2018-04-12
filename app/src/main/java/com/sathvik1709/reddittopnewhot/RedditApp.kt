package com.sathvik1709.reddittopnewhot

import android.app.Activity
import android.app.Application
import android.app.Fragment
import com.sathvik1709.reddittopnewhot.di.ApplicationComponent
import com.sathvik1709.reddittopnewhot.di.DaggerApplicationComponent
import dagger.android.AndroidInjector
import dagger.android.DispatchingAndroidInjector
import dagger.android.HasActivityInjector
import dagger.android.HasFragmentInjector
import javax.inject.Inject

class RedditApp : Application() , HasActivityInjector {

    @Inject
    lateinit var androidActivityInjector : DispatchingAndroidInjector<Activity>

    lateinit var applicationComponent : ApplicationComponent

    override fun onCreate() {
        super.onCreate()
        DaggerApplicationComponent.builder().application(this).build().inject(this)

    }

    override fun activityInjector(): AndroidInjector<Activity> = androidActivityInjector!!

}