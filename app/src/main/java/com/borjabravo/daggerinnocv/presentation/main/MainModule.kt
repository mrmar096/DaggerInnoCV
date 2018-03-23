package com.borjabravo.daggerinnocv.presentation.main

import android.app.Activity
import com.borjabravo.daggerinnocv.infraestructure.di.view.activity.ActivityModule
import dagger.Binds
import dagger.Module
import dagger.Reusable

/**
 * Created by mrmar on 23/3/18.
 */
@Module(includes = [ActivityModule::class])
abstract class MainModule{
    @Binds
    @Reusable
    abstract fun providesActivity(mainActivity: MainActivity) : Activity
}