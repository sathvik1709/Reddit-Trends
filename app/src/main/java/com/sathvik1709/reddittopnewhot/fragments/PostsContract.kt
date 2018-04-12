package com.sathvik1709.reddittopnewhot.fragments

import com.sathvik1709.reddittopnewhot.base.BasePresenter
import com.sathvik1709.reddittopnewhot.base.BaseView

interface PostsContract {

    interface View : BaseView<Presenter>{
        fun showProgressBar()
        fun hideProgressBar()
    }

    interface Presenter : BasePresenter {
        fun loadPosts()

    }

}