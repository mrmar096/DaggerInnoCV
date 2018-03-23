package com.borjabravo.daggerinnocv.presentation.common

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.borjabravo.daggerinnocv.presentation.common.view.BaseView
import dagger.android.support.DaggerFragment

/**
 * Created by mrmar on 23/3/18.
 */
abstract class BaseFragment : DaggerFragment(), BaseView{

    abstract val fragmentLayout : Int

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        initializeView()
    }

    override fun onCreateView(inflater: LayoutInflater?, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater?.inflate(fragmentLayout,container,false)
    }

    protected abstract fun initializeView()

    override fun showMessage(message: String) {
        (activity as BaseActivity).showMessage(message)
    }

    override fun showMessage(messageResId: Int) {
        (activity as BaseActivity).showMessage(messageResId)
    }

}