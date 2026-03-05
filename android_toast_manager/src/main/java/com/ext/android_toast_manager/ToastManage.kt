package com.ext.android_toast_manager

import android.app.Activity
import android.graphics.Color
import android.graphics.drawable.GradientDrawable
import android.view.Gravity
import android.view.LayoutInflater
import android.widget.TextView
import android.widget.Toast

object ToastManager {

    fun show(activity: Activity, message: String, type: ToastType = ToastType.INFO) {

        val inflater = LayoutInflater.from(activity)
        val layout = inflater.inflate(R.layout.toast_layout, null)

        val text = layout.findViewById<TextView>(R.id.toastText)
        text.text = message

        val background = text.background as GradientDrawable
        background.setColor(getColor(type))

        val toast = Toast(activity)
        toast.duration = Toast.LENGTH_SHORT
        toast.view = layout
        toast.setGravity(Gravity.BOTTOM, 0, 150)
        toast.show()
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