package com.alexkrupa.screenshottestingsandbox

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.setContent
import androidx.ui.tooling.preview.Preview
import com.alexkrupa.screenshottestingsandbox.ui.animation.Epilepsy
import com.alexkrupa.screenshottestingsandbox.ui.asCompose
import com.alexkrupa.screenshottestingsandbox.ui.gradient.RadialGradient
import com.alexkrupa.screenshottestingsandbox.ui.gradient.RadialGradientView
import com.alexkrupa.screenshottestingsandbox.ui.rainbow

var isCompose = true

private const val RADIUS_DIVISOR = 8f

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        if (isCompose) {
            setContent {
                RadialGradient(
                    colors = rainbow().asCompose(),
                    radiusDivisor = RADIUS_DIVISOR
                )
            }
        } else {
            setContentView(
                RadialGradientView(
                    colors = rainbow(),
                    radiusDivisor = RADIUS_DIVISOR
                )
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    RadialGradient(
        listOf(
            Color.Red,
            Color.Yellow,
            Color.Green,
            Color.Blue,
            Color.Cyan,
            Color.White,
        ),
        RADIUS_DIVISOR
    )
}