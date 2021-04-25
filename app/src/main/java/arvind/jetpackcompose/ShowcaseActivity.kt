package arvind.jetpackcompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.core.view.WindowCompat

class ShowcaseActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        WindowCompat.setDecorFitsSystemWindows(window, false)
        setContent {
            activityContent()
        }
    }

    @Composable
    private fun activityContent() {
        ShowcaseTheme {
            Column(Modifier.fillMaxSize()) {
                ShowText()
                ShowButton()
                CardDemo()
                AlertDialogSample()
                CircularProgressIndicatorSample()
                CheckBoxDemo()
                DropdownDemo()
                ExtendedFloatingActionButtonDemo()
                RadioButtonSample()
                MySliderDemo()
                SnackbarDemo()
                SwitchDemo()
                TextFieldDemo()
                /** layout example **/
                /** layout example **/
                /** layout example **/
                /** layout example **/
                BoxExample()
                ColumnExample()
            }
        }
    }

    @Composable
    @Preview
    fun previewActivity() {
        activityContent()
    }
}