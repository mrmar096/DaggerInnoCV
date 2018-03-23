package com.borjabravo.daggerinnocv.infraestructure.di.view.activity

import com.borjabravo.daggerinnocv.presentation.common.navigation.Navigator
import com.borjabravo.daggerinnocv.presentation.common.navigation.NavigatorImpl
import dagger.Module
import dagger.Provides
import dagger.Reusable

/**
 * Created by mrmar on 23/3/18.
 */
@Module
open class BaseActivityModule {
    @Provides
    @Reusable
    fun providesNavigator(navigatorImpl: NavigatorImpl) : Navigator = navigatorImpl
}