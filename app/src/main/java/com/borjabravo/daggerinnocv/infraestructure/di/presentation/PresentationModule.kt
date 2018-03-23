package com.borjabravo.daggerinnocv.infraestructure.di.presentation

import com.borjabravo.daggerinnocv.presentation.detail.fragment.presenter.DetailPresenter
import com.borjabravo.daggerinnocv.presentation.detail.fragment.presenter.DetailPresenterImpl
import com.borjabravo.daggerinnocv.presentation.main.presenter.MainPresenter
import com.borjabravo.daggerinnocv.presentation.main.presenter.MainPresenterImpl
import dagger.Binds
import dagger.Module
import dagger.Reusable

/**
 * Created by mrmar on 23/3/18.
 */
@Module()
abstract class PresentationModule {

    @Binds
    @Reusable
    abstract fun bindMainPresenter(mainPresenterImpl: MainPresenterImpl) : MainPresenter

    @Binds
    @Reusable
    abstract fun bindDetailPresenter(detailPresenterImpl: DetailPresenterImpl) : DetailPresenter

}