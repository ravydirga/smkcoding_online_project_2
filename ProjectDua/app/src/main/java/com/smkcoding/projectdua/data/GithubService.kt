package com.smkcoding.projectdua.data

import com.smkcoding.projectdua.GithubUserItem
import retrofit2.Call
import retrofit2.http.GET

interface GithubService {

    @GET("users")
    fun getUsers():Call<List<GithubUserItem>>
}