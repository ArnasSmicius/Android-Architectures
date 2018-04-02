package com.example.arnassmicius.mvp.presenters

import com.example.arnassmicius.mvp.views.BaseView

open class BasePresenter<V : BaseView> : BaseMvpPresenter<V> {

    var mView: V? = null
        private set

    override fun attach(view: V) {
        mView = view
    }

    override fun detach() {
        mView = null
    }

    override fun isAttached(): Boolean {
        return mView != null
    }
}