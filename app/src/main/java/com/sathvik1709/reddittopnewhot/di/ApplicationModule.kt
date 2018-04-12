package com.sathvik1709.reddittopnewhot.di

import android.content.Context
import com.sathvik1709.reddittopnewhot.RedditApp
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module(includes = ([NetworkModule::class]))
class ApplicationModule {

    @Singleton
    @Provides
    fun provideApplicationContext(redditApplication: RedditApp) : Context = redditApplication.applicationContext

}