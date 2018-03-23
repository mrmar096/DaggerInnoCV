package com.borjabravo.daggerinnocv.infraestructure.di.application

import com.borjabravo.daggerinnocv.App
import com.borjabravo.daggerinnocv.infraestructure.di.view.activity.ActivityBuilder
import dagger.Component
import dagger.android.AndroidInjector
import dagger.android.support.AndroidSupportInjectionModule
import javax.inject.Singleton

/**
 * Created by mrmar on 23/3/18.
 */
@Singleton
@Component(modules = [AppModule::class, AndroidSupportInjectionModule::class,ActivityBuilder::class])
interface AppComponent : AndroidInjector<App>