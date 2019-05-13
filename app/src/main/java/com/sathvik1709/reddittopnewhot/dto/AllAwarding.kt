package com.sathvik1709.reddittopnewhot.dto

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

class AllAwarding {

    @SerializedName("is_enabled")
    @Expose
    var isEnabled: Boolean? = null
    @SerializedName("count")
    @Expose
    var count: Long? = null
    @SerializedName("subreddit_id")
    @Expose
    var subredditId: Any? = null
    @SerializedName("description")
    @Expose
    var description: String? = null
    @SerializedName("coin_reward")
    @Expose
    var coinReward: Long? = null
    @SerializedName("icon_width")
    @Expose
    var iconWidth: Long? = null
    @SerializedName("icon_url")
    @Expose
    var iconUrl: String? = null
    @SerializedName("days_of_premium")
    @Expose
    var daysOfPremium: Long? = null
    @SerializedName("icon_height")
    @Expose
    var iconHeight: Long? = null
    @SerializedName("resized_icons")
    @Expose
    var resizedIcons: List<ResizedIcon>? = null
    @SerializedName("days_of_drip_extension")
    @Expose
    var daysOfDripExtension: Long? = null
    @SerializedName("award_type")
    @Expose
    var awardType: String? = null
    @SerializedName("coin_price")
    @Expose
    var coinPrice: Long? = null
    @SerializedName("id")
    @Expose
    var id: String? = null
    @SerializedName("name")
    @Expose
    var name: String? = null

}
