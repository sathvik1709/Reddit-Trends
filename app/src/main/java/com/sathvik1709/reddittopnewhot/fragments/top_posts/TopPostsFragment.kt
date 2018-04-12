package com.sathvik1709.reddittopnewhot.fragments.top_posts

import android.os.Bundle
import android.util.Log

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.sathvik1709.reddittopnewhot.R
import com.sathvik1709.reddittopnewhot.base.BaseFragment
import com.sathvik1709.reddittopnewhot.dto.RedditResponse
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.disposables.Disposable
import io.reactivex.schedulers.Schedulers
import kotlinx.android.synthetic.main.fragment_top_posts.*


class TopPostsFragment : BaseFragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_top_posts,
                container, false);
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val subscribe: Disposable = this.redditService.getTopPosts("10")
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(
                        { t: RedditResponse? -> sample.text = t.toString()},
                        { error: Throwable? -> Log.d("error", error.toString()) }
                )


    }

}