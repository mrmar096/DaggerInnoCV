package com.borjabravo.daggerinnocv.presentation.main.presenter

import com.borjabravo.daggerinnocv.presentation.common.presenter.Presenter
import com.borjabravo.daggerinnocv.presentation.main.view.MainView

/**
 * Created by mrmar on 23/3/18.
 */
interface MainPresenter : Presenter<MainView>{
    fun goToDetailActivity()

}