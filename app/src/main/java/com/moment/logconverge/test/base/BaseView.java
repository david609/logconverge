package com.moment.logconverge.test.base;

/**
 * Created by moment on 2017/11/23.
 */

public interface BaseView<T> {
    // 规定View必须要实现setPresenter方法，则View中保持对Presenter的引用。
    void setPresenter(T presenter);
}
