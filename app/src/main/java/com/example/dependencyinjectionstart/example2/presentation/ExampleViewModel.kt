package com.example.dependencyinjectionstart.example2.presentation

import android.util.Log
import androidx.lifecycle.ViewModel
import com.example.dependencyinjectionstart.example2.domain.ExampleUseCase
import javax.inject.Inject

private const val TAG = "ExampleViewModel"

class ExampleViewModel @Inject constructor(
    private val useCase: ExampleUseCase,
    private val id: String,
): ViewModel() {

    fun method() {
        Log.d(TAG, "$this $id")
        useCase()
    }
}
