package com.example.arnassmicius.mvp.interfaces

import com.example.arnassmicius.mvp.presenters.BaseMvpPresenter
import com.example.arnassmicius.mvp.views.BaseView

interface MainContract {

    // User actions. Presenter will implement
    interface Presenter : BaseMvpPresenter<View> {
        fun loadHelloText()
    }

    // Action callbacks. Activity/Fragment will implement
    interface View : BaseView {
        fun onTextLoaded(text: String)
    }
}