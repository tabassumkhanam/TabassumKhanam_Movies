package com.demo.tabassumkhanam_movies.di

import com.demo.tabassumkhanam_movies.ui.activity.MainActivity
import dagger.Module
import dagger.android.ContributesAndroidInjector

@Module
abstract class ActivityModule {

    @ContributesAndroidInjector(modules = [FragmentModule::class])
    abstract fun contributesMainActivity(): MainActivity

}