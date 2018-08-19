package com.naruto.mvpdemo.presenter;

import com.naruto.mvpdemo.base.BasePresenter;
import com.naruto.mvpdemo.bean.BaseResponse;
import com.naruto.mvpdemo.model.DataModel;
import com.naruto.mvpdemo.view.DataView;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

/**
 * @author narut.
 * @Date 2018-08-19.
 * @Time 14:34.
 */
public class DataPresenter extends BasePresenter<DataView> {

    private DataModel mModel;

    public DataPresenter() {
        mModel = new DataModel();
    }

    public void getData(String appKey){
        mModel.getData(appKey, new Callback<BaseResponse>() {
            @Override
            public void onResponse(Call<BaseResponse> call, Response<BaseResponse> response) {
                mView.getDataSuccess(response.body().getResult().getList());
            }

            @Override
            public void onFailure(Call<BaseResponse> call, Throwable t) {
                mView.getDataFail(t.getMessage());
            }
        });
    }
}
