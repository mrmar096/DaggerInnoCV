package com.borjabravo.daggerinnocv

import com.borjabravo.daggerinnocv.infraestructure.di.application.DaggerAppComponent
import dagger.android.AndroidInjector
import dagger.android.DaggerApplication

/**
 * Created by mrmar on 23/3/18.
 */
class App : DaggerApplication() {
    override fun applicationInjector(): AndroidInjector<out DaggerApplication> = DaggerAppComponent.create()

}