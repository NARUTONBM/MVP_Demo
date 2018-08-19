package com.naruto.mvpdemo.base;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

/**
 * @author narut.
 * @Date 2018-08-19.
 * @Time 14:45.
 */
public abstract class BaseMVPActivity<T extends IPresenter> extends AppCompatActivity implements IView {

    protected T mPresenter;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(createView());

        mPresenter = createPresenter();
        if (null == mPresenter) {
            throw new IllegalStateException("Please call mPresenter in BaseMVPActivity(createPresenter) to create!");
        } else {
            mPresenter.attach(this);
        }

        viewCreate();
    }

    protected abstract int createView();

    protected abstract T createPresenter();

    protected abstract void viewCreate();

    @Override
    public void showLoading() {

    }

    @Override
    public void hideLoading() {

    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        if (null != mPresenter) {
            mPresenter.detach();
        }
    }
}
