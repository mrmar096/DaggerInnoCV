package com.borjabravo.daggerinnocv.infraestructure.di.view.fragment

import com.borjabravo.daggerinnocv.infraestructure.di.view.PerFragment
import com.borjabravo.daggerinnocv.presentation.detail.fragment.DetailFragment
import dagger.Module
import dagger.android.ContributesAndroidInjector

/**
 * Created by mrmar on 23/3/18.
 */

@Module
abstract class FragmentProviderModule{

    @PerFragment
    @ContributesAndroidInjector(modules = [FragmentModule::class])
    abstract fun provideDetailFragmentFactory(): DetailFragment
}