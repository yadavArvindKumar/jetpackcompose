package arvind.jetpackcompose

import androidx.compose.material.MaterialTheme
import androidx.compose.runtime.Composable

@Composable
fun ShowcaseTheme(
    content: @Composable () -> Unit
) {
    MaterialTheme(
        colors = ShowcaseColors,
        typography = ShowcaseTypography,
        shapes = ShowcaseShapes,
        content = content
    )
}

