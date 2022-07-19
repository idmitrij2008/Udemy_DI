package com.example.dependencyinjectionstart.example2.di

import android.content.Context
import com.example.dependencyinjectionstart.example2.presentation.MainActivity
import dagger.BindsInstance
import dagger.Component

@Component(
    modules = [
        DataModule::class,
        DomainModule::class,
    ]
)
interface ApplicationComponent {

    @Component.Builder
    interface ApplicationComponentBuilder {

        @BindsInstance
        fun context(context: Context): ApplicationComponentBuilder

        @BindsInstance
        fun currentTime(currentTime: Long): ApplicationComponentBuilder

        fun build(): ApplicationComponent
    }

    fun inject(activity: MainActivity)
}