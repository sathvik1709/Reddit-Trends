package com.sathvik1709.reddittopnewhot.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.sathvik1709.reddittopnewhot.dto.RedditResponse
import com.sathvik1709.reddittopnewhot.repo.Repository
import io.reactivex.functions.Consumer

class MainViewModel : ViewModel() {

    val map = hashMapOf<String, MutableLiveData<RedditResponse>>()

    fun getLiveData(path: String): MutableLiveData<RedditResponse>? {
        val value = map.getOrDefault(path, MutableLiveData())
        if (!map.containsKey(path)) {
            map[path] = value
        }
        return map[path]
    }

    fun getResponse(path: String) {
        if(map[path]?.value == null){
            Repository.getPosts(path, Consumer {
                map[path]?.value = it
            })
        }
    }

}