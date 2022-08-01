package com.example.dependencyinjectionstart.example2.data.datasource

import android.util.Log
import javax.inject.Inject

private const val TAG = "TestRemoteDataSrc"

class TestRemoteDataSourceImpl @Inject constructor(

) : ExampleRemoteDataSource {
    override fun method() {
        Log.d(TAG, "test")
    }
}