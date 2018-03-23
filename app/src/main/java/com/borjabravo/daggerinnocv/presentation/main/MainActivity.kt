package com.borjabravo.daggerinnocv.presentation.main

import android.os.Bundle
import com.borjabravo.daggerinnocv.R
import com.borjabravo.daggerinnocv.presentation.common.BaseActivity
import com.borjabravo.daggerinnocv.presentation.main.presenter.MainPresenter
import com.borjabravo.daggerinnocv.presentation.main.view.MainView
import kotlinx.android.synthetic.main.activity_main.*
import javax.inject.Inject

class MainActivity : BaseActivity(), MainView {

    override fun initializeView() {
        presenter.init(this)
    }

    @Inject
    lateinit var presenter: MainPresenter


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        detail_activity.setOnClickListener { presenter.goToDetailActivity() }
    }

}
