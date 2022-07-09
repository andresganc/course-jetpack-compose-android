package com.nc.course_jetpack_compose_android

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.Button
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import com.nc.course_jetpack_compose_android.ui.theme.CoursejetpackcomposeandroidTheme

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
                    Texto("Andres")
                    ImageLogo()
                    Button01()
                }
            }
        }
    }
}

@Preview(showBackground = true, name = "Prueba Compose")
@Composable
fun DefaultPreview() {
    CoursejetpackcomposeandroidTheme {
        Texto("Andres")
        ImageLogo()
    }
}

@Composable
fun ImageLogo() {
    Image(
        painterResource(R.drawable.ic_launcher_foreground),
        contentDescription = "Imagen Android"
    )
}

@Composable
fun Button01() {
    Button(onClick = { /*TODO*/ }) {

    }
}

@Composable
fun Texto(name: String) {
    Text(text = "Hola $name!")
    //Text(text = "Newsoft Computer")
}

