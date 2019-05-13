package com.sathvik1709.reddittopnewhot.service

import com.sathvik1709.reddittopnewhot.dto.RedditResponse
import io.reactivex.Single
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query

interface RedditService {

    @GET("{postType}.json")
    fun getPosts(@Path("postType") user: String, @Query("limit") limit : String = "25") : Single<RedditResponse>

}