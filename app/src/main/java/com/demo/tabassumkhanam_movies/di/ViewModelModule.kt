package com.demo.tabassumkhanam_movies.di

import androidx.lifecycle.ViewModelProvider
import dagger.Binds
import dagger.Module


@Module
abstract class ViewModelModule {


    @Binds
    internal abstract fun bindViewModelFactory(viewModelFactory: ViewModelFactory): ViewModelProvider.Factory
}