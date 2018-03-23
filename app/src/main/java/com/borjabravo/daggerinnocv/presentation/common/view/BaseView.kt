package com.borjabravo.daggerinnocv.presentation.common.view

import android.support.annotation.StringRes

interface BaseView {

    fun showMessage(@StringRes messageResId: Int)

    fun showMessage(message: String)

}