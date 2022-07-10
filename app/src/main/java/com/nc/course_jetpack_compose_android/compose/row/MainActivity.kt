package com.nc.course_jetpack_compose_android.compose.row

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import com.nc.course_jetpack_compose_android.R
import com.nc.course_jetpack_compose_android.compose.row.ui.theme.CoursejetpackcomposeandroidTheme

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
                    Card01()
                }
            }
        }
    }
}

@Composable
fun Card01() {
    Row() {
        Image(
            painter = painterResource(id = R.drawable.ic_launcher_foreground),
            contentDescription = "Image profile"
        )
        Column() {
            Text(text = "Name: Marco")
            Text(text = "Lastname: Giraldo Gomez")
            Text(text = "Age: 5")
            Text(text = "Date of Birth: 20 December 2017")
        }
    }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    CoursejetpackcomposeandroidTheme {
        Card01()
    }
}