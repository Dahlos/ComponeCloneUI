package com.example.componecloneui.instagram

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.componecloneui.R
import com.example.componecloneui.instagram.ui.theme.ComponeCloneUITheme

class HomeInstagramActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ComponeCloneUITheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    Greeting2("Android")
                }
            }
        }
    }
}

@Composable
fun Greeting2(name: String) {
    Text(text = "Hello $name!")
}

//@Preview(showBackground = true)
@Composable
fun DefaultPreview2() {
    ComponeCloneUITheme {
        Greeting2("Android")
    }
}

@Preview(showBackground = true)
@Composable
fun ToolbarApp() {
    Row(
        horizontalArrangement = Arrangement.SpaceAround, modifier = Modifier
            .fillMaxWidth()
    ) {
        Row(Modifier.weight(3.0f).align(Alignment.CenterVertically)) {
            Spacer(modifier = Modifier.width(10.dp))
            Image(
                painter = painterResource(R.drawable.instagram_logo),
                contentDescription = "Instagram Icon",
                modifier = Modifier
                    .width(100.dp)
            )
        }
        Row(
            Modifier
                .weight(1.0f)
                .align(Alignment.CenterVertically), horizontalArrangement = Arrangement.SpaceBetween) {
            5
            Image(
                painter = painterResource(R.drawable.ic_outline_add_box_24),
                contentDescription = "Instagram Icon",
                Modifier.align(Alignment.CenterVertically)
            )
            Image(
                painter = painterResource(R.drawable.ic_baseline_favorite_border_24),
                contentDescription = "Instagram Icon",
                Modifier.align(Alignment.CenterVertically)
            )
            Image(
                painter = painterResource(R.drawable.ic_facebook_messenger),
                contentDescription = "Instagram Icon",
                Modifier.align(Alignment.CenterVertically)
            )
            Spacer(modifier = Modifier.width(10.dp))
        }
    }
}