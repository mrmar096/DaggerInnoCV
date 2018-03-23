package com.borjabravo.daggerinnocv.presentation.common.presenter

import com.borjabravo.daggerinnocv.presentation.common.view.BaseView

/**
 * Created by mrmar on 23/3/18.
 */
abstract class BasePresenter<VIEW: BaseView> : Presenter<VIEW> {

    protected lateinit var view: VIEW

    override fun init(view: VIEW) {
        this.view = view
    }
}