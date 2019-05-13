package com.sathvik1709.reddittopnewhot.activities


import android.os.Bundle
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProviders
import com.google.android.material.bottomnavigation.BottomNavigationView
import com.sathvik1709.reddittopnewhot.R
import com.sathvik1709.reddittopnewhot.base.BaseActivity
import com.sathvik1709.reddittopnewhot.fragments.new_posts.MainPostsFragment
import com.sathvik1709.reddittopnewhot.viewmodel.MainViewModel
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : BaseActivity() {

    lateinit var sharedViewModel : ViewModel

    private val mOnNavigationItemSelectedListener = BottomNavigationView.OnNavigationItemSelectedListener { item ->
        when (item.itemId) {
            R.id.navigation_top -> {
                putFragment("top")
                return@OnNavigationItemSelectedListener true
            }
            R.id.navigation_hot -> {
                putFragment("hot")
                return@OnNavigationItemSelectedListener true
            }
            R.id.navigation_new -> {
                putFragment("new")
                return@OnNavigationItemSelectedListener true
            }
        }
        false
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        sharedViewModel = ViewModelProviders.of(this).get(MainViewModel::class.java)

        supportFragmentManager.beginTransaction().add(R.id.container, MainPostsFragment.newInstance(), MainPostsFragment::class.java.name).commit()
        supportFragmentManager.executePendingTransactions()

        navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener)
        navigation.selectedItemId = R.id.navigation_top
    }

    private fun putFragment(path: String){
        (supportFragmentManager.findFragmentByTag(MainPostsFragment::class.java.name) as MainPostsFragment).getPosts(path)
    }
}
