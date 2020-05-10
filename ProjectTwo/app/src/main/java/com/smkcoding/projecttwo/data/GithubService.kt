package com.smkcoding.projecttwo.data


import com.smkcoding.projecttwo.GithubUserItem
import retrofit2.Call
import retrofit2.http.GET

interface GithubService{

    @GET("users")
    fun getUsers():Call<List<GithubUserItem>>
}