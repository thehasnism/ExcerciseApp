package com.hasnicodes.excercise

import android.app.Activity
import android.content.Context
import android.os.Build
import android.view.View
import android.view.WindowManager
import androidx.appcompat.app.AppCompatDelegate
import java.text.SimpleDateFormat
import java.time.LocalTime
import java.time.format.DateTimeFormatter
import java.util.Date
import java.util.Locale


fun getCurrentTime(): String {
    val format = SimpleDateFormat("HH:mm", Locale.ENGLISH)
    return format.format(Date())
}

fun getCurrentDay(): String {
    val format = SimpleDateFormat("EEEE", Locale.ENGLISH)
    return format.format(Date())
}


fun getCurrentDateDetail(): String {
    val format = SimpleDateFormat("dd MMMM yyyy", Locale.ENGLISH)
    return format.format(Date())
}

fun enableDarkMode(isDark: Boolean) {
    if (isDark)
        AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_YES)
    else
        AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO)

}
