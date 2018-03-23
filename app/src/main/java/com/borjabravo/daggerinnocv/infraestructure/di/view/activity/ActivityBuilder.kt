package com.borjabravo.daggerinnocv.infraestructure.di.view.activity

import com.borjabravo.daggerinnocv.infraestructure.di.view.PerActivity
import com.borjabravo.daggerinnocv.infraestructure.di.view.fragment.FragmentProviderModule
import com.borjabravo.daggerinnocv.presentation.detail.DetailActivity
import com.borjabravo.daggerinnocv.presentation.detail.DetailModule
import com.borjabravo.daggerinnocv.presentation.main.MainActivity
import com.borjabravo.daggerinnocv.presentation.main.MainModule
import dagger.Module
import dagger.android.ContributesAndroidInjector

/**
 * Created by mrmar on 23/3/18.
 */
@Module()
abstract class ActivityBuilder {

    @PerActivity
    @ContributesAndroidInjector(modules = [MainModule::class])
    abstract fun mainActivityInjector(): MainActivity

    @PerActivity
    @ContributesAndroidInjector(modules = [DetailModule::class,FragmentProviderModule::class])
    abstract fun detailActivityInjector(): DetailActivity

}