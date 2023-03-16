package com.setjy.workoutapp.ui.theme

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material.MaterialTheme
import androidx.compose.material.darkColors
import androidx.compose.material.lightColors
import androidx.compose.runtime.Composable

private val lightColorPalette =
    lightColors(background = LightGrayBackground, surface = LightGray, onSurface = VeryLightGray)

private val darkColorPalette = darkColors()

@Composable
fun WorkoutAppTheme(darkTheme: Boolean = isSystemInDarkTheme(), content: @Composable () -> Unit) {
    val colors = if (darkTheme) {
        darkColorPalette
    } else {
        lightColorPalette
    }
    MaterialTheme(
        colors = colors,
        typography = Typography,
        shapes = shapes,
        content = content
    )
}