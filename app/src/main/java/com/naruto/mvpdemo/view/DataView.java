package com.naruto.mvpdemo.view;

import com.naruto.mvpdemo.base.IView;
import com.naruto.mvpdemo.bean.ArticleBean;

import java.util.List;

/**
 * @author narut.
 * @Date 2018-08-19.
 * @Time 14:30.
 */
public interface DataView extends IView {

    void getDataSuccess(List<ArticleBean> articleBeanList);

    void getDataFail(String errorMsg);
}
