package com.ext.android_toast_manager


import android.app.Activity
import android.graphics.Color
import android.view.View
import com.google.android.material.snackbar.Snackbar

object SnackbarManager {

    fun show(
        activity: Activity,
        message: String,
        type: ToastType = ToastType.INFO,
        actionText: String? = null,
        onActionClick: (() -> Unit)? = null
    ) {

        val rootView: View =
            activity.findViewById(android.R.id.content)

        val snackbar = Snackbar.make(rootView, message, Snackbar.LENGTH_LONG)

        snackbar.setBackgroundTint(getColor(type))
        snackbar.setTextColor(Color.WHITE)

        if (actionText != null && onActionClick != null) {
            snackbar.setAction(actionText) {
                onActionClick()
            }
            snackbar.setActionTextColor(Color.YELLOW)
        }

        snackbar.show()
    }

    private fun getColor(type: ToastType): Int {
        return when (type) {
            ToastType.SUCCESS -> Color.parseColor("#4CAF50")
            ToastType.ERROR -> Color.parseColor("#F44336")
            ToastType.WARNING -> Color.parseColor("#FF9800")
            ToastType.INFO -> Color.parseColor("#2196F3")
        }
    }
}