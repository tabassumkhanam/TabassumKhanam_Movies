package com.demo.tabassumkhanam_movies

import com.demo.tabassumkhanam_movies.di.DaggerAppComponent
import dagger.android.AndroidInjector
import dagger.android.DaggerApplication

class MoviesApp: DaggerApplication() {
    override fun applicationInjector(): AndroidInjector<out DaggerApplication> {
        return DaggerAppComponent.builder().application(this).build()
    }
}