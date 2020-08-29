package com.alexkrupa.screenshottestingsandbox.ui.gradient

import androidx.compose.foundation.Box
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.WithConstraints
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RadialGradient
import androidx.compose.ui.graphics.TileMode.Repeated
import androidx.compose.ui.util.annotation.ColorInt
import androidx.compose.ui.util.annotation.FloatRange

@Composable
fun RadialGradient(
    @ColorInt colors: List<Color>,
    @FloatRange(from = 1.0) radiusDivisor: Float
) {
    WithConstraints {
        val width = constraints.maxWidth
        val height = constraints.maxHeight
        Box(
            modifier = Modifier
                .fillMaxSize()
                .background(
                    RadialGradient(
                        colors,
                        radius = minOf(width, height) / radiusDivisor,
                        centerX = width / 2f,
                        centerY = height / 2f,
                        tileMode = Repeated
                    )
                )
        )
    }
}