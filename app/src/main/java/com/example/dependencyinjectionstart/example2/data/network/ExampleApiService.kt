package com.example.dependencyinjectionstart.example2.data.network

import android.content.Context
import android.util.Log
import com.example.dependencyinjectionstart.R
import com.example.dependencyinjectionstart.example2.di.ApplicationScope
import javax.inject.Inject
import javax.inject.Singleton

@ApplicationScope
class ExampleApiService @Inject constructor(
    private val context: Context,
    private val currentTime: Long
) {

    fun method() {
        Log.d(LOG_TAG, "ExampleApiService ${context.getString(R.string.app_name)} $currentTime $this")
    }

    companion object {

        private const val LOG_TAG = "EXAMPLE_TEST"
    }
}
