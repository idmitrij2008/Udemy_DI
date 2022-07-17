package com.example.dependencyinjectionstart.example1

import dagger.Component

@Component
interface NewComponent {

    fun inject(activity: Activity)

//    fun getKeyboard(): Keyboard
//
//    fun getMouse(): Mouse
//
//    fun getMonitor(): Monitor

}