package com.borjabravo.daggerinnocv.presentation.detail

import android.app.Activity
import com.borjabravo.daggerinnocv.infraestructure.di.view.activity.ActivityModule
import dagger.Binds
import dagger.Module
import dagger.Reusable

/**
 * Created by mrmar on 23/3/18.
 */
@Module(includes = [ActivityModule::class])
abstract class DetailModule {
    @Binds
    @Reusable
    abstract fun providesActivity(detailActivity: DetailActivity) : Activity
}