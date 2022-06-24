package com.iproov.depscheck

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.iproov.sdk.IProov

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        IProov.launch(this, "", "")
    }
}