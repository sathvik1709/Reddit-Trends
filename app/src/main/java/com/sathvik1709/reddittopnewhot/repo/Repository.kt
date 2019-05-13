package com.sathvik1709.reddittopnewhot.repo

import com.sathvik1709.reddittopnewhot.dto.RedditResponse
import com.sathvik1709.reddittopnewhot.service.NetworkProvider
import com.sathvik1709.reddittopnewhot.service.RedditService
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.functions.Consumer
import io.reactivex.schedulers.Schedulers


object Repository {

    private val redditService: RedditService? = NetworkProvider.getRedditService()

    fun getPosts(path: String, successConsumer: Consumer<RedditResponse>){
        redditService?.getPosts(path)
                ?.observeOn(AndroidSchedulers.mainThread())
                ?.subscribeOn(Schedulers.io())
                ?.subscribe(successConsumer, Consumer {

                })
    }

}