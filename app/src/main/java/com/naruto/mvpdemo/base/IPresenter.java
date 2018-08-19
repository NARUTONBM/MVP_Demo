package com.naruto.mvpdemo.base;

/**
 * @author narut.
 * @Date 2018-08-19.
 * @Time 14:45.
 */
public interface IPresenter<V extends IView> {

    void attach(V view);

    void detach();
}
