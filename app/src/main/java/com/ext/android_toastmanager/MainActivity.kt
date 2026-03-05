package com.ext.android_toastmanager


import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.ext.android_toast_manager.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Toast Examples
        ToastManager.show(this, "Success Message", ToastType.SUCCESS)
        ToastManager.show(this, "Error Message", ToastType.ERROR)

        // Snackbar Example
        SnackbarManager.show(
            this,
            "This is Snackbar",
            ToastType.WARNING,
            "Retry"
        ) {
            ToastManager.show(this, "Retry Clicked", ToastType.INFO)
        }
    }
}