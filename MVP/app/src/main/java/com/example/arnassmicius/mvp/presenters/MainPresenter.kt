package com.example.arnassmicius.mvp.presenters

import com.example.arnassmicius.mvp.interfaces.MainContract
import java.util.*

class MainPresenter : BasePresenter<MainContract.View>(), MainContract.Presenter {

    private val helloTexts = arrayOf("BONJOUR", "HOLA", "HALLO", "MERHABA", "HELLO", "CIAO", "KONNICHIWA")

    override fun loadHelloText() {
        val random = Random()
        val hello = helloTexts[random.nextInt(helloTexts.size)]
        mView?.onTextLoaded(hello)
    }
}