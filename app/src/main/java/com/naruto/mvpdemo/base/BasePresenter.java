package com.naruto.mvpdemo.base;

/**
 * @author narut.
 * @Date 2018-08-19.
 * @Time 15:23.
 */
public class BasePresenter<V extends IView> implements IPresenter<V> {

    protected V mView;

    @Override
    public void attach(V view) {
        mView = view;
    }

    @Override
    public void detach() {
        mView = null;
    }
}
