package arvind.jetpackcompose

import androidx.compose.foundation.ScrollState
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.material.FloatingActionButton
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp


@Composable
fun BoxExample() {
    Box(Modifier.fillMaxSize()) {
        Text("This text is drawn first", modifier = Modifier.align(Alignment.TopCenter))
        Box(
            Modifier
                .align(Alignment.TopCenter)
                .fillMaxHeight()
                .width(
                    50.dp
                )
                .background(Color.Blue)
        )
        Text("This text is drawn last", modifier = Modifier.align(Alignment.Center))
        FloatingActionButton(
            modifier = Modifier
                .align(Alignment.BottomEnd)
                .padding(12.dp),
            onClick = {}
        ) {
            Text("+")
        }
    }
}

@Composable
fun ColumnExample() {
    Column {
        Text("Hello World!")
        Text("Hello World!2")
    }
}

@Composable
fun ConstraintLayoutDemo() {
    /* ConstraintLayout(constraintSet = ConstraintSet {

         // This block contains all the constraints related to children
         tag("TextViewA").apply {
             right constrainTo parent.right
             left constrainTo parent.left
             top constrainTo parent.top
             bottom constrainTo parent.bottom
         }
         tag("TextViewB").apply {
             right constrainTo tag("TextViewA").left
             top constrainTo tag("TextViewA").top
         }
         tag("TextViewC").apply {
             left constrainTo tag("TextViewA").right
             top constrainTo tag("TextViewA").top
         }
         tag("TextViewD").apply {
             right constrainTo parent.right
             left constrainTo parent.left
             bottom constrainTo tag("TextViewA").top
         }
         tag("TextViewE").apply {
             right constrainTo parent.right
             left constrainTo parent.left
             top constrainTo tag("TextViewA").bottom
         }

     },modifier = Modifier.fillMaxSize()) {

         // This block contains the children
         Text(text = "A", modifier = Modifier.tag("TextViewA")
             .padding(10.dp),
             style = TextStyle(fontSize = 20.sp))
         Text(text = "B", modifier = Modifier.tag("TextViewB")
             .padding(10.dp)
             , style = TextStyle(fontSize = 20.sp))
         Text(text = "C", modifier = Modifier.tag("TextViewC")
             .padding(10.dp)
             , style = TextStyle(fontSize = 20.sp))
         Text(text = "D", modifier = Modifier.tag("TextViewD")
             , style = TextStyle(fontSize = 20.sp))
         Text(text = "E", modifier = Modifier.tag("TextViewE")
             , style = TextStyle(fontSize = 20.sp))

     }*/
}
