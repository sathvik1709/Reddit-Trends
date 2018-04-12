package com.sathvik1709.reddittopnewhot.di

import com.sathvik1709.reddittopnewhot.fragments.hot_posts.HotPostsFragment
import com.sathvik1709.reddittopnewhot.fragments.NewPostsFragment
import com.sathvik1709.reddittopnewhot.fragments.top_posts.TopPostsFragment
import dagger.Module
import dagger.android.ContributesAndroidInjector

@Module
abstract class FragmentBuilderModule {

    @ContributesAndroidInjector
    abstract fun bindTopPostsFragment(): TopPostsFragment

    @ContributesAndroidInjector
    abstract fun bindNewPostsFragment(): NewPostsFragment

    @ContributesAndroidInjector
    abstract fun bindHotPostsFragment(): HotPostsFragment

}