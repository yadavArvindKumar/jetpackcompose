package arvind.jetpackcompose

import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview

@Composable
fun ShowText() {
    Text(text = "Welcome to jetpack compose")
}

@Composable
@Preview
fun previewText() {
    ShowText()
}