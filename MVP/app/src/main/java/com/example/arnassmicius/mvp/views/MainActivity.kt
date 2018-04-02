package com.example.arnassmicius.mvp.views

import android.os.Bundle
import android.view.View
import com.example.arnassmicius.mvp.R
import com.example.arnassmicius.mvp.interfaces.MainContract
import com.example.arnassmicius.mvp.presenters.MainPresenter
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : BaseActivity(), MainContract.View, View.OnClickListener {

    private var mPresenter: MainPresenter? = null

    override fun getContentResource(): Int {
        return R.layout.activity_main
    }

    override fun init(state: Bundle?) {
        tvHello.setOnClickListener(this)
        mPresenter = MainPresenter()
        mPresenter?.attach(this)
        mPresenter?.loadHelloText()
    }

    override fun onDestroy() {
        super.onDestroy()
        mPresenter?.detach()
    }

    override fun onTextLoaded(text: String) {
        tvHello.text = text
    }

    override fun onClick(v: View?) {
        mPresenter?.loadHelloText()
    }
}
