package com.sathvik1709.reddittopnewhot.dto

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

class RedditResponse {
    @SerializedName("kind")
    @Expose
    var kind: String? = null
    @SerializedName("data")
    @Expose
    var data: Data? = null
}
