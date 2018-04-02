package com.example.arnassmicius.mvp.views

import android.os.Bundle
import android.support.annotation.LayoutRes
import android.support.v7.app.AppCompatActivity

abstract class BaseActivity : AppCompatActivity(), BaseView {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(getContentResource())
        init(savedInstanceState)
    }

    // Layout resources to be inflated
    @LayoutRes
    protected abstract fun getContentResource(): Int

    protected abstract fun init(state: Bundle?)
}