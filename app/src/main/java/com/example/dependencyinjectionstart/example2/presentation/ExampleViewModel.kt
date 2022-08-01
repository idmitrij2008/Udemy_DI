package com.example.dependencyinjectionstart.example2.presentation

import android.util.Log
import androidx.lifecycle.ViewModel
import com.example.dependencyinjectionstart.example2.di.IdQualifier
import com.example.dependencyinjectionstart.example2.di.NameQualifier
import com.example.dependencyinjectionstart.example2.domain.ExampleUseCase
import javax.inject.Inject

private const val TAG = "ExampleViewModel"

class ExampleViewModel @Inject constructor(
    private val useCase: ExampleUseCase,
    @IdQualifier private val id: String,
    @NameQualifier private val name: String,
) : ViewModel() {

    fun method() {
        Log.d(TAG, "$this $id, name = $name")
        useCase()
    }
}
