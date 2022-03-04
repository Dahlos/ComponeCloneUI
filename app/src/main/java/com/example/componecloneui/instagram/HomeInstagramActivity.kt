package com.example.componecloneui.instagram

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.FloatingActionButton
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
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
                    Column() {
                        ToolbarApp()
                        StoriesBar()
                    }
                }
            }
        }
    }
}


@Preview(showBackground = true)
@Composable
fun ToolbarApp() {
    Row(
        horizontalArrangement = Arrangement.SpaceAround, modifier = Modifier
            .fillMaxWidth()
    ) {
        Row(
            Modifier
                .weight(3.0f)
                .align(Alignment.CenterVertically)
        ) {
            Spacer(modifier = Modifier.width(10.dp))
            Image(
                painter = painterResource(R.drawable.instagram_logo),
                contentDescription = "Instagram Icon",
                modifier = Modifier
                    .width(100.dp)
            )
        }
        ButtonsToolbar(
            Modifier
                .weight(1.0f)
                .align(Alignment.CenterVertically)
        )
    }
}

@Preview(showBackground = true)
@Composable
fun StoriesBar() {
    Row(
        horizontalArrangement = Arrangement.SpaceAround, modifier = Modifier
            .fillMaxWidth()
    ) {
        AddStoryUser(Modifier.align(Alignment.CenterVertically))
        StoryUserAvatar(Modifier.align(Alignment.CenterVertically))
        StoryUserAvatar(Modifier.align(Alignment.CenterVertically))
        StoryUserAvatar(Modifier.align(Alignment.CenterVertically))
        StoryUserAvatar(Modifier.align(Alignment.CenterVertically))
    }
}

@Composable
fun AddStoryUser(modifier: Modifier) {
    Box() {
        Image(
            painter = painterResource(R.drawable.spiderman_profile),
            contentDescription = "Instagram Icon",
            modifier
                .padding(top = 2.dp, bottom = 2.dp)
                .size(58.dp)
                .clip(CircleShape)   // clip to the circle shape
                .border(2.dp, Color.Black, CircleShape)
                .border(4.dp, Color.White, CircleShape),
            contentScale = ContentScale.Crop, // crop the image if it's not a square
        )
        FloatingActionButton(
            modifier = Modifier
                .align(Alignment.BottomEnd)
                .size(16.dp),
            backgroundColor = Color.Blue,
            onClick = {}
        ) {
            Image(
                painter = painterResource(R.drawable.ic_round_add_24),
                contentDescription = "Add Story"
            )
        }
    }
}

@Composable
fun StoryUserAvatar(modifier: Modifier) {
    Image(
        painter = painterResource(R.drawable.batman_profile),
        contentDescription = "Instagram Icon",
        modifier
            .padding(top = 2.dp, bottom = 2.dp)
            .size(58.dp)
            .clip(CircleShape)   // clip to the circle shape
            .border(2.dp, Color.Black, CircleShape)
            .border(4.dp, Color.White, CircleShape),
        contentScale = ContentScale.Crop, // crop the image if it's not a square
    )
}


@Composable
fun ButtonsToolbar(modifier: Modifier) {
    Row(
        modifier = modifier, horizontalArrangement = Arrangement.SpaceEvenly
    ) {
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
    }
}