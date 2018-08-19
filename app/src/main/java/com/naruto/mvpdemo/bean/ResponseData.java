package com.naruto.mvpdemo.bean;

import java.util.ArrayList;
import java.util.List;

/**
 * @author narut.
 * @Date 2018-08-19.
 * @Time 14:21.
 */
public class ResponseData {

    private List<ArticleBean> list;

    public List<ArticleBean> getList() {
        if (list == null) {
            return new ArrayList<>();
        }
        return list;
    }

    public void setList(List<ArticleBean> list) {
        this.list = list;
    }

    @Override
    public String toString() {
        return "ResponseData{" +
                "list=" + list +
                '}';
    }
}
