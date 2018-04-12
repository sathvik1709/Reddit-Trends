package com.sathvik1709.reddittopnewhot.base

import android.content.Context
import android.support.v4.app.Fragment
import com.sathvik1709.reddittopnewhot.dto.RedditResponse
import com.sathvik1709.reddittopnewhot.service.RedditService
import dagger.android.support.AndroidSupportInjection
import javax.inject.Inject

abstract class BaseFragment : Fragment() {

    @Inject
    lateinit var redditService : RedditService

    override fun onAttach(context: Context?) {
        AndroidSupportInjection.inject(this)
        super.onAttach(context)

    }

}