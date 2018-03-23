package com.borjabravo.daggerinnocv.presentation.detail.fragment.presenter

import com.borjabravo.daggerinnocv.presentation.common.navigation.Navigator
import com.borjabravo.daggerinnocv.presentation.common.presenter.BasePresenter
import com.borjabravo.daggerinnocv.presentation.detail.fragment.view.DetailView
import javax.inject.Inject

/**
 * Created by mrmar on 23/3/18.
 */

class DetailPresenterImpl @Inject constructor(private val navigator: Navigator) : BasePresenter<DetailView>(), DetailPresenter