package com.alexkrupa.screenshottestingsandbox.ui

import androidx.annotation.ColorInt
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.util.annotation.IntRange

@ColorInt
fun rainbow(@IntRange(from = 1, to = 360) colorCount: Int = 360): IntArray {
    val step = 360 / colorCount
    return IntArray(colorCount) {
        android.graphics.Color.HSVToColor(
            floatArrayOf(step * it.toFloat(), 1.0f, 1.0f)
        )
    }
}

fun @receiver:ColorInt IntArray.asCompose(): List<Color> = map(::Color)