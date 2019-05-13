package com.sathvik1709.reddittopnewhot.dto

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

class Data {

    @SerializedName("modhash")
    @Expose
    var modhash: String? = null
    @SerializedName("dist")
    @Expose
    var dist: Long? = null
    @SerializedName("children")
    @Expose
    var children: List<Child>? = null
    @SerializedName("after")
    @Expose
    var after: String? = null
    @SerializedName("before")
    @Expose
    var before: Any? = null

}
