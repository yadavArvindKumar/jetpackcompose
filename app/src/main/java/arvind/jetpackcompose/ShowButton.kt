package arvind.jetpackcompose

import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.Composable

@Composable
fun ShowButton() {
    Button(
        onClick = { /* Do something! */ }
    ) {
        Text("Button")
    }
}
