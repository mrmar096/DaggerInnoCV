package com.borjabravo.daggerinnocv.presentation.common

import android.os.Bundle
import android.support.v4.app.Fragment
import android.widget.Toast
import com.borjabravo.daggerinnocv.presentation.common.view.BaseView
import dagger.android.support.DaggerAppCompatActivity

/**
 * Created by mrmar on 23/3/18.
 */
abstract class BaseActivity : DaggerAppCompatActivity(), BaseView{

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        initializeView()
    }

    override fun showMessage(messageResId: Int) {
        showMessage(getString(messageResId))
    }

    override fun showMessage(message: String) {
        Toast.makeText(this,message,Toast.LENGTH_LONG).show()
    }

    protected abstract fun initializeView()

    protected fun initFragmentContainer(containerId: Int, fragment: Fragment) {
        val transaction = supportFragmentManager.beginTransaction()
        transaction.replace(containerId, fragment)
        transaction.commit()
    }

}