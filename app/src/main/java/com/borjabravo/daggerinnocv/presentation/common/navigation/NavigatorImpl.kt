package com.borjabravo.daggerinnocv.presentation.common.navigation

import android.app.Activity
import android.content.Intent
import javax.inject.Inject

/**
 * Created by mrmar on 23/3/18.
 */
class NavigatorImpl @Inject constructor(private val activity: Activity) : Navigator {
    override fun startActivity(clazz: Class<*>) {
        activity.startActivity(Intent(activity,clazz))
    }
}