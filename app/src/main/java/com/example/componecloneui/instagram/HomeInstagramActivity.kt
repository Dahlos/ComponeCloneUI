package com.example.componecloneui.instagram

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.componecloneui.R
import com.example.componecloneui.instagram.ui.theme.ComponeCloneUITheme

class HomeInstagramActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ComponeCloneUITheme {
                // A surface container using the 'background' color from the theme
                Scaffold(
                    modifier = Modifier.fillMaxSize(),
                    bottomBar = { BottomBar() },
                    topBar = { ToolbarApp() }
                ) {
                    Column() {
                        StoriesBar()
                        Spacer(modifier = Modifier.height(12.dp))
                        LazyColumn {
                            item { ContainerPublications() }
                            item { ContainerPublications() }
                            item { ContainerPublications() }
                            item { ContainerPublications() }
                            item { ContainerPublications() }
                        }
                    }
                }
            }
        }
    }
}


//@Preview(showBackground = true)
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

//@Preview(showBackground = true)
@Composable
fun StoriesBar() {
    Row(
        horizontalArrangement = Arrangement.SpaceAround,
        verticalAlignment = Alignment.CenterVertically,
        modifier = Modifier
            .fillMaxWidth()
    ) {
        AddStoryUser()
        StoryUserAvatar()
        StoryUserAvatar()
        StoryUserAvatar()
        StoryUserAvatar()
    }
}

//@Preview(showBackground = true)
@Composable
fun ContainerPublications() {
    Column(
        modifier = Modifier
            .fillMaxWidth()
    ) {
        HeaderPublication()
        ContentPublication()
        Spacer(modifier = Modifier.height(16.dp))
    }
}

//@Preview(showBackground = true)
@Composable
fun HeaderPublication() {
    Row(
        verticalAlignment = Alignment.CenterVertically,
        modifier = Modifier
            .fillMaxWidth()
    ) {
        Row(horizontalArrangement = Arrangement.Start, modifier = Modifier.weight(3f)) {
            Spacer(modifier = Modifier.width(8.dp))
            Image(
                painter = painterResource(R.drawable.spiderman_profile),
                contentDescription = "Instagram Icon",
                Modifier
                    .padding(top = 2.dp, bottom = 2.dp)
                    .size(28.dp)
                    .clip(CircleShape),
                contentScale = ContentScale.Crop,
            )
            Spacer(modifier = Modifier.width(8.dp))
            Column() {
                Text(text = "NVIDIA", fontSize = 12.sp, fontWeight = FontWeight.Bold)
                Text(text = "New York", fontSize = 10.sp)
            }
        }
        Row(horizontalArrangement = Arrangement.End, modifier = Modifier.weight(1f)) {
            Image(
                painter = painterResource(R.drawable.ic_baseline_more_vert_24),
                contentDescription = "Instagram Icon",
                Modifier.align(Alignment.CenterVertically),
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
fun ContentPublication() {
    Column() {
        Image(
            painter = painterResource(R.drawable.nvidia_post),
            contentDescription = "Instagram Icon",
            Modifier.clip(RectangleShape)
        )
        Row(
            Modifier.padding(top = 4.dp, bottom = 4.dp)
        ) {
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .weight(4.0f),
//                horizontalArrangement = Arrangement.SpaceBetween
            ) {
                Spacer(modifier = Modifier.width(10.dp))
                Image(
                    painter = painterResource(R.drawable.ic_baseline_favorite_border_24),
                    contentDescription = "Home",
                )
                Spacer(modifier = Modifier.width(10.dp))
                Image(
                    painter = painterResource(R.drawable.ic_baseline_chat_bubble_outline_24),
                    contentDescription = "Search",
                )
                Spacer(modifier = Modifier.width(10.dp))
                Image(
                    painter = painterResource(R.drawable.ic_baseline_send_24),
                    contentDescription = "Instagram Icon",
                )
            }
            Image(
                modifier = Modifier.weight(1.0f),
                painter = painterResource(R.drawable.ic_outline_bookmark_border_24),
                contentDescription = "Instagram Icon",
            )
        }
    }
}

@Composable
fun AddStoryUser() {
    Box() {
        Image(
            painter = painterResource(R.drawable.spiderman_profile),
            contentDescription = "Instagram Icon",
            Modifier
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
fun StoryUserAvatar() {
    Image(
        painter = painterResource(R.drawable.batman_profile),
        contentDescription = "Instagram Icon",
        Modifier
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


//@Preview(showBackground = true)
@Composable
fun BottomBar() {
    BottomNavigation(
        backgroundColor = colorResource(id = R.color.white),
        contentColor = Color.Black
    ) {
        Row(
            horizontalArrangement = Arrangement.SpaceAround, modifier = Modifier
                .fillMaxWidth()
                .align(Alignment.CenterVertically)
        ) {
            Image(
                painter = painterResource(R.drawable.ic_baseline_home_24),
                contentDescription = "Home",
                Modifier.align(Alignment.CenterVertically)
            )
            Image(
                painter = painterResource(R.drawable.ic_baseline_search_24),
                contentDescription = "Search",
                Modifier.align(Alignment.CenterVertically)
            )
            Image(
                painter = painterResource(R.drawable.ic_instagram_reels),
                contentDescription = "Instagram Icon",
                Modifier.align(Alignment.CenterVertically)
            )
            Image(
                painter = painterResource(R.drawable.ic_baseline_shopping_basket_24),
                contentDescription = "Instagram Icon",
                Modifier.align(Alignment.CenterVertically)
            )
            Image(
                painter = painterResource(R.drawable.spiderman_profile),
                contentDescription = "Instagram Icon",
                Modifier
                    .padding(top = 2.dp, bottom = 2.dp)
                    .size(28.dp)
                    .clip(CircleShape),   // clip to the circle shape
                contentScale = ContentScale.Crop, // crop the image if it's not a square
            )
        }
    }
}