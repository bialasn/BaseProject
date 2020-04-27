package com.bialasn.baseproject.network

import com.bialasn.baseproject.model.Post
import io.reactivex.Observable
import retrofit2.http.GET


interface PostApi {

    @GET("/posts")
    fun getPosts(): Observable<List<Post>>
}