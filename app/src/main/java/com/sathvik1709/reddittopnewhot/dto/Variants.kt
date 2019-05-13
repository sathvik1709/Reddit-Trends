package com.sathvik1709.reddittopnewhot.dto


import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

class Variants {

    @SerializedName("gif")
    @Expose
    var gif: Gif? = null
    @SerializedName("mp4")
    @Expose
    var mp4: Mp4? = null

}






