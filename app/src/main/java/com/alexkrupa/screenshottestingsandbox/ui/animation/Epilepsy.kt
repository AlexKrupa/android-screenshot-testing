package com.alexkrupa.screenshottestingsandbox.ui.animation

import androidx.compose.animation.core.*
import androidx.compose.animation.core.AnimationConstants.Infinite
import androidx.compose.animation.core.RepeatMode.Reverse
import androidx.compose.animation.transition
import androidx.compose.runtime.Composable

private val divisorKey = FloatPropKey()
private val definition = transitionDefinition<Int> {
    state(0) { this[divisorKey] = 8f }
    state(1) { this[divisorKey] = 64f }

    transition {
        divisorKey using repeatable(
            iterations = Infinite,
            repeatMode = Reverse,
            animation = tween(
                durationMillis = 2000,
                easing = CubicBezierEasing(0.85f, 0f, 0.15f, 1f)
            )
        )
    }
}

@Composable
fun Epilepsy(): Float = transition(
    definition = definition,
    initState = 0,
    toState = 1
)[divisorKey]