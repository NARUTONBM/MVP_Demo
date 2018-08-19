package com.naruto.mvpdemo.model;

import com.naruto.mvpdemo.bean.BaseResponse;
import com.naruto.mvpdemo.net.RetrofitHelper;

import retrofit2.Call;
import retrofit2.Callback;

/**
 * @author narut.
 * @Date 2018-08-19.
 * @Time 12:01.
 */
public class DataModel {

    private DataApi mDataApi;

    public DataModel() {
        mDataApi = RetrofitHelper.createApi(DataApi.class);
    }

    public void getData(String appKey, Callback<BaseResponse> callback) {
        Call<BaseResponse> responseCall = mDataApi.getData(appKey);
        //发起请求
        responseCall.enqueue(callback);
    }
}
