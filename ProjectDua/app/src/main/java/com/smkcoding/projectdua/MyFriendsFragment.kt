package com.smkcoding.projectdua

import android.content.Context
import android.net.Uri
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.LinearLayout
import androidx.annotation.Nullable
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.*
import kotlinx.android.synthetic.main.fragment_my_friends.*


class MyFriendsFragment : Fragment() {

    lateinit var listTeman:ArrayList<MyFriend>
    private fun simulasiDataTeman(){
        listTeman = ArrayList()
        listTeman.add(MyFriend(
            "Fakhry","Laki-laki","Fakhry@smkcoding.id","085850127232","Malang"
        ))
        listTeman.add(MyFriend(
            "Ahmad","Laki-laki","Ahmad@smkcoding.id","085850127232","Malang"
        ))
    }

    private fun tampilTeman(){
        rv_listMyFriend.layoutManager=LinearLayoutManager(activity)
        rv_listMyFriend.adapter=MyFriendAdapter(activity!!,listTeman)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_my_friends, container, false)
    }

    private fun initView(){
        simulasiDataTeman()
        tampilTeman()
    }

    override fun onViewCreated(view: View, @Nullable savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initView()
    }

    override fun onDestroy() {
        super.onDestroy()
        this.clearFindViewByIdCache()
    }
}
