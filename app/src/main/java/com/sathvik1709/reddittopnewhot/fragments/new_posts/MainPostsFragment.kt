package com.sathvik1709.reddittopnewhot.fragments.new_posts

import android.content.Context
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.sathvik1709.reddittopnewhot.adapter.ItemPostAdapter
import com.sathvik1709.reddittopnewhot.base.BaseFragment
import com.sathvik1709.reddittopnewhot.dto.Child
import com.sathvik1709.reddittopnewhot.viewmodel.MainViewModel
import kotlinx.android.synthetic.main.fragment_posts.*



class MainPostsFragment : BaseFragment() {

    private lateinit var model: MainViewModel

    private lateinit var itemDecor: DividerItemDecoration
    private lateinit var viewAdapter: RecyclerView.Adapter<*>
    private lateinit var viewManager: RecyclerView.LayoutManager

    companion object {
        fun newInstance(): MainPostsFragment {
            return MainPostsFragment()
        }
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(com.sathvik1709.reddittopnewhot.R.layout.fragment_posts, container, false)
    }

    override fun onAttach(context: Context?) {
        super.onAttach(context)
        model = activity?.run {
            ViewModelProviders.of(this).get(MainViewModel::class.java)
        } ?: throw Exception("Invalid Activity")
    }

    fun getPosts(path: String) {
        model.getLiveData(path)?.observe(this, Observer {
            //sample.text = it?.data?.children?.get(0)?.data?.title
            makeList(it?.data?.children)
        })
        model.getResponse(path)
    }

    private fun makeList(children: List<Child>?) {
        viewManager = LinearLayoutManager(activity)
        viewAdapter = ItemPostAdapter(children)

        itemDecor = DividerItemDecoration(activity, DividerItemDecoration.VERTICAL)

        posts_recycler_view.apply {
            setHasFixedSize(true)
            addItemDecoration(itemDecor)
            layoutManager = viewManager
            adapter = viewAdapter
        }
    }

}