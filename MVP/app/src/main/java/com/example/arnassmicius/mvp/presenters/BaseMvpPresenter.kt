package com.example.arnassmicius.mvp.presenters

import com.example.arnassmicius.mvp.views.BaseView

interface BaseMvpPresenter<in V : BaseView> {

    // Called when View attached to presenter
    fun attach(view: V)

    // Called when View is detached from presenter
    fun detach()

    // Return true if View is attached to presenter
    fun isAttached(): Boolean
}