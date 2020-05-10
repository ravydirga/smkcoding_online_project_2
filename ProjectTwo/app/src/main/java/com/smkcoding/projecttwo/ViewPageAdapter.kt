package com.smkcoding.projecttwo

import android.content.Context
import android.net.Uri
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.FragmentActivity
import androidx.fragment.app.FragmentStatePagerAdapter
import androidx.viewpager2.adapter.FragmentStateAdapter


class ViewPageAdapter(fragmentActivity: FragmentActivity) :
    FragmentStateAdapter(fragmentActivity) {

    private val JUMLAH_MENU = 3

    override fun createFragment(position: Int): Fragment {
     when(position){
         0 -> {return MyFriendsFragment()}
         1 -> {return GithubFragment()}
         2 -> {return ProfilFragment()}
         else -> {
             return GithubFragment()
         }
     }
    }

    override fun getItemCount(): Int {
        return JUMLAH_MENU
    }
}
