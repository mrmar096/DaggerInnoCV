package com.borjabravo.daggerinnocv.presentation.main.presenter

import com.borjabravo.daggerinnocv.presentation.common.navigation.Navigator
import com.borjabravo.daggerinnocv.presentation.common.presenter.BasePresenter
import com.borjabravo.daggerinnocv.presentation.detail.DetailActivity
import com.borjabravo.daggerinnocv.presentation.main.view.MainView
import javax.inject.Inject

/**
 * Created by mrmar on 23/3/18.
 */
class MainPresenterImpl @Inject constructor(private val navigator: Navigator) : BasePresenter<MainView>(), MainPresenter {

    override fun goToDetailActivity() {
        navigator.startActivity(DetailActivity::class.java)
    }
}