@file:Suppress("FunctionName")

package com.alexkrupa.screenshottestingsandbox.ui.gradient

import android.content.Context
import android.graphics.RadialGradient
import android.graphics.Shader
import android.graphics.drawable.PaintDrawable
import android.graphics.drawable.ShapeDrawable
import android.graphics.drawable.shapes.RectShape
import android.view.View
import android.view.ViewGroup.LayoutParams
import android.view.ViewGroup.LayoutParams.MATCH_PARENT
import androidx.annotation.ColorInt
import androidx.annotation.FloatRange

fun Context.RadialGradientView(
    @ColorInt colors: IntArray,
    @FloatRange(from = 1.0) radiusDivisor: Float
) = View(this).apply {
    layoutParams = LayoutParams(MATCH_PARENT, MATCH_PARENT)
    background = RadialGradientDrawable(colors, radiusDivisor)
}

private fun RadialGradientDrawable(
    colors: IntArray,
    radiusDivisor: Float
) = PaintDrawable().apply {
    shape = RectShape()
    shaderFactory = RadialGradientShaderFactory(colors, radiusDivisor)
}

private class RadialGradientShaderFactory(
    private val colors: IntArray,
    private val radiusDivisor: Float
) : ShapeDrawable.ShaderFactory() {

    override fun resize(width: Int, height: Int): Shader = RadialGradient(
        width / 2f,
        height / 2f,
        minOf(width, height) / radiusDivisor,
        colors,
        null,
        Shader.TileMode.REPEAT
    )
}