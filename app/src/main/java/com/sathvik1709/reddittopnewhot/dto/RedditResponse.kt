package com.sathvik1709.reddittopnewhot.dto


data class RedditResponse(
        val kind: String,
        val data: Data1
)

data class Data1(
        val after: String,
        val dist: Int,
        val modhash: String,
        val whitelist_status: String,
        val children: List<Children>
)

data class Children(
        val kind: String,
        val data: Data2
)

data class Data2(
        val subreddit_id: String,
        val send_replies: Boolean,
        val subreddit: String,
        val selftext: String,
        val user_reports: List<Any>,
        val is_reddit_media_domain: Boolean,
        val saved: Boolean,
        val id: String,
        val archived: Boolean,
        val clicked: Boolean,
        val no_follow: Boolean,
        val author: String,
        val num_crossposts: Int,
        val link_flair_text: String,
        val mod_reports: List<Any>,
        val can_mod_post: Boolean,
        val is_crosspostable: Boolean,
        val pinned: Boolean,
        val score: Int,
        val over_18: Boolean,
        val domain: String,
        val hidden: Boolean,
        val thumbnail: String,
        val edited: Boolean,
        val link_flair_css_class: String,
        val contest_mode: Boolean,
        val gilded: Int,
        val downs: Int,
        val brand_safe: Boolean,
        val secure_media_embed: SecureMediaEmbed,
        val media_embed: MediaEmbed,
        val stickied: Boolean,
        val visited: Boolean,
        val can_gild: Boolean,
        val parent_whitelist_status: String,
        val name: String,
        val spoiler: Boolean,
        val permalink: String,
        val subreddit_type: String,
        val locked: Boolean,
        val hide_score: Boolean,
        val created: Double,
        val url: String,
        val whitelist_status: String,
        val quarantine: Boolean,
        val subreddit_subscribers: Int,
        val created_utc: Double,
        val subreddit_name_prefixed: String,
        val ups: Int,
        val num_comments: Int,
        val is_self: Boolean,
        val title: String,
        val is_video: Boolean
)

class SecureMediaEmbed {}

class MediaEmbed {}