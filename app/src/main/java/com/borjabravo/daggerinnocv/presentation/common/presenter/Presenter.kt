package com.borjabravo.daggerinnocv.presentation.common.presenter

import com.borjabravo.daggerinnocv.presentation.common.view.BaseView

/**
 * Created by mrmar on 23/3/18.
 */

interface Presenter<in T : BaseView> {

    fun init(view: T)

}
