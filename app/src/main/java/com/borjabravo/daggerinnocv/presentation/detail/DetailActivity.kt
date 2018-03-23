package com.borjabravo.daggerinnocv.presentation.detail

import android.os.Bundle
import com.borjabravo.daggerinnocv.R
import com.borjabravo.daggerinnocv.presentation.common.BaseActivity
import com.borjabravo.daggerinnocv.presentation.detail.fragment.DetailFragment
import javax.inject.Inject

class DetailActivity : BaseActivity(){
    @Inject
    lateinit var fragment: DetailFragment

    override fun initializeView() {
        initFragmentContainer(R.id.fragment_container,fragment)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)
    }
}
