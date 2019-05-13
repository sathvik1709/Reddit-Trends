package com.sathvik1709.reddittopnewhot.dto


import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

class Preview {

    @SerializedName("images")
    @Expose
    var images: List<Image>? = null
    @SerializedName("reddit_video_preview")
    @Expose
    var redditVideoPreview: RedditVideoPreview? = null
    @SerializedName("enabled")
    @Expose
    var enabled: Boolean? = null

}

fun Preview.getMediaUrl(){
    
}
