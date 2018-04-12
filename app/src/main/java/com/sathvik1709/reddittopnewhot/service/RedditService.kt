package com.sathvik1709.reddittopnewhot.service

import com.sathvik1709.reddittopnewhot.dto.RedditResponse
import io.reactivex.Observable
import retrofit2.http.GET
import retrofit2.http.Query

interface RedditService {

    @GET("top.json")
    fun getTopPosts(@Query("limit") limit : String) : Observable<RedditResponse>

}