package com.nc.course_jetpack_compose_android.compose.row

import android.content.res.Configuration
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
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
            contentDescription = "Image profile",
            modifier = Modifier.padding(10.dp)
                .size(80.dp)
                .clip(CircleShape)
                .background(Color.Cyan)
        )
        Column(modifier = Modifier.padding(15.dp)) {
            Text(
                text = "MARCUS",
                color = MaterialTheme.colors.primary,
                style = MaterialTheme.typography.h6
            )

        }
    }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreviewRow() {
    CoursejetpackcomposeandroidTheme {
        Card01()
    }
}