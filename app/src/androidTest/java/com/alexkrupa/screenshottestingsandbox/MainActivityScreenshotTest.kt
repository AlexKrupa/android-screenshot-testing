package com.alexkrupa.screenshottestingsandbox

import androidx.test.rule.ActivityTestRule
import com.facebook.testing.screenshot.Screenshot
import com.karumi.shot.ScreenshotTest
import org.junit.Test

class MainActivityScreenshotTest : ScreenshotTest {

    private val rule = ActivityTestRule(MainActivity::class.java)

    @Test
    fun mainActivity() {
        isCompose = false
        val activity = rule.launchActivity(null)

        Screenshot.snapActivity(activity).record()
    }
}
