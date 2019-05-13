package com.sathvik1709.reddittopnewhot.dto

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

class Gif {

    @SerializedName("source")
    @Expose
    var source: Source? = null
    @SerializedName("resolutions")
    @Expose
    var resolutions: List<Resolution_>? = null

}