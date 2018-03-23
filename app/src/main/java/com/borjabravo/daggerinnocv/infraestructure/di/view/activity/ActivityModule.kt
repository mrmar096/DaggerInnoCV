package com.borjabravo.daggerinnocv.infraestructure.di.view.activity

import com.borjabravo.daggerinnocv.infraestructure.di.presentation.PresentationModule
import com.borjabravo.daggerinnocv.presentation.detail.fragment.DetailFragment
import dagger.Module
import dagger.Provides
import dagger.Reusable


/**
 * Created by mrmar on 23/3/18.
 */
@Module(includes = [PresentationModule::class])
open class ActivityModule : BaseActivityModule(){

    @Provides
    @Reusable
    fun providesDetailFragment(): DetailFragment = DetailFragment()
}