package com.sathvik1709.reddittopnewhot.di

import com.sathvik1709.reddittopnewhot.RedditApp
import dagger.BindsInstance
import dagger.Component
import dagger.android.support.AndroidSupportInjectionModule
import javax.inject.Singleton

@Singleton
@Component(modules = [
    AndroidSupportInjectionModule::class,
    ApplicationModule::class,
    ActivityBuilderModule::class,
    FragmentBuilderModule::class
])
interface ApplicationComponent {

    @Component.Builder
    interface Builder {
        @BindsInstance fun application(redditApp: RedditApp) : Builder
        fun build() :ApplicationComponent
    }
    fun inject(app : RedditApp)

}
