package com.naruto.mvpdemo.model;

import com.naruto.mvpdemo.bean.BaseResponse;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

/**
 * @author narut.
 * @Date 2018-08-19.
 * @Time 14:19.
 */
interface DataApi {

    @GET("/weixin/query")
    Call<BaseResponse> getData(@Query("key") String appKey);
}
