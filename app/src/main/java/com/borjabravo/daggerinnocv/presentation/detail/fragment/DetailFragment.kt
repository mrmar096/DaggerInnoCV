package com.borjabravo.daggerinnocv.presentation.detail.fragment

import com.borjabravo.daggerinnocv.R
import com.borjabravo.daggerinnocv.presentation.common.BaseFragment
import com.borjabravo.daggerinnocv.presentation.detail.fragment.presenter.DetailPresenter
import com.borjabravo.daggerinnocv.presentation.detail.fragment.view.DetailView
import javax.inject.Inject

/**
 * Created by mrmar on 23/3/18.
 */
class DetailFragment : BaseFragment(), DetailView {

    override val fragmentLayout: Int = R.layout.fragment_detail

    @Inject
    lateinit var presenter:DetailPresenter

    override fun initializeView() {
        presenter.init(this)
        showMessage("Hello World¡")
    }
}