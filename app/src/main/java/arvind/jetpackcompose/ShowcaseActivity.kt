package arvind.jetpackcompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview

class ShowcaseActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
//        WindowCompat.setDecorFitsSystemWindows(window, false)
        setContent {
            activityContent()
        }
    }

    @Composable
    private fun activityContent() {
        ShowcaseTheme {
            LazyColumn(Modifier.fillMaxSize()) {
                item {
                    ShowText()
                }
                item {
                    CardDemo()
                }
                item {
                    AlertDialogSample()
                }
                item {
                    CircularProgressIndicatorSample()
                }
                item {
                    CheckBoxDemo()
                }
                item {
                    DropdownDemo()
                }

                item {
                    ExtendedFloatingActionButtonDemo()

                }
                item {
                    RadioButtonSample()
                }

                item {
                    MySliderDemo()
                }
                item {
                    SnackbarDemo()
                }
                item {
                    SwitchDemo()
                }
                item {
                    TextFieldDemo()
                }
                item {
                    BoxExample()
                }
                /** layout example **/
                item {
                    ColumnExample()
                }
            }
        }
    }

    @Composable
    @Preview
    fun previewActivity() {
        activityContent()
    }
}