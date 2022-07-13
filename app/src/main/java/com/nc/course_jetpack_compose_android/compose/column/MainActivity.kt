package com.nc.course_jetpack_compose_android.compose.column

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import com.nc.course_jetpack_compose_android.compose.column.ui.theme.CoursejetpackcomposeandroidTheme
import com.nc.course_jetpack_compose_android.compose.text.ColumnText

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            CoursejetpackcomposeandroidTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    ColumnMain()
                }
            }
        }
    }
}

@Composable
fun ColumnMain() {
    Column(
        modifier = Modifier.fillMaxSize(),
        // verticalArrangement = Arrangement.Top,
        // verticalArrangement = Arrangement.Center,
        // verticalArrangement = Arrangement.Bottom,
        verticalArrangement = Arrangement.SpaceAround,
        // verticalArrangement = Arrangement.SpaceBetween,
        // verticalArrangement = Arrangement.SpaceEvenly,

        // horizontalAlignment = Alignment.Start,
        // horizontalAlignment = Alignment.End,
        horizontalAlignment = Alignment.CenterHorizontally
    )
    {
        ColumnText1()
    }

    Column(
        modifier = Modifier.fillMaxSize(),
        // verticalArrangement = Arrangement.Top,
        // verticalArrangement = Arrangement.Center,
        // verticalArrangement = Arrangement.Bottom,
        verticalArrangement = Arrangement.SpaceAround,
        // verticalArrangement = Arrangement.SpaceBetween,
        // verticalArrangement = Arrangement.SpaceEvenly,

        // horizontalAlignment = Alignment.Start,
        // horizontalAlignment = Alignment.End,
        horizontalAlignment = Alignment.CenterHorizontally
    )
    {
        ColumnText2()
    }
}

@Composable
fun ColumnText1() {
    Column(
        modifier = Modifier.fillMaxHeight(),
        // verticalArrangement = Arrangement.Top,
        // verticalArrangement = Arrangement.Center,
        // verticalArrangement = Arrangement.Bottom,
        verticalArrangement = Arrangement.SpaceAround,
        // verticalArrangement = Arrangement.SpaceBetween,
        // verticalArrangement = Arrangement.SpaceEvenly,

        horizontalAlignment = Alignment.Start,
        // horizontalAlignment = Alignment.End,
        // horizontalAlignment = Alignment.CenterHorizontally
    )
    {
        Company1()
        Company2(
            name = "Web",
            modifier = Modifier
                .background(Color.Red)
        )
        Company3(
            name = "SoftApp",
            modifier = Modifier
                .background(Color.Yellow)
        )
    }
}

@Composable
fun ColumnText2() {
    Column(
        modifier = Modifier.fillMaxHeight(),
        // verticalArrangement = Arrangement.Top,
        // verticalArrangement = Arrangement.Center,
        // verticalArrangement = Arrangement.Bottom,
        verticalArrangement = Arrangement.SpaceAround,
        // verticalArrangement = Arrangement.SpaceBetween,
        // verticalArrangement = Arrangement.SpaceEvenly,

        // horizontalAlignment = Alignment.Start,
        horizontalAlignment = Alignment.End,
        // horizontalAlignment = Alignment.CenterHorizontally
    )
    {
        Company2(
            name = "Web",
            modifier = Modifier
                .background(Color.Green)

        )
        Company3(
            name = "SoftApp",
            modifier = Modifier
                .background(Color.Cyan)
        )
    }
}

@Composable
fun Company1() {
    Text(text = "Newsoft Computer")
}

@Composable
fun Company2(name: String, modifier: Modifier) {
    Text(text = "NC $name")
}

@Composable
fun Company3(name: String, modifier: Modifier) {
    Text(text = "NC $name")
}

@Preview(showBackground = true)
@Composable
fun DefaultPreviewColumn() {
    CoursejetpackcomposeandroidTheme {
        ColumnMain()
    }
}