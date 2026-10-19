package com.example.facebookui.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AddCircle
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.facebookui.R

@Preview(showBackground = true)
@Composable
fun CreateStory(modifier: Modifier = Modifier) {
    Box(modifier.size(height = 178.dp , width = 112.dp).clip(
        shape = RoundedCornerShape(16.dp)
    )){
        Box(modifier) {
            Column(){
                Image(
                    painter = painterResource(
                        id = R.drawable.story1
                    ),
                    contentDescription = "story profile",
                    contentScale = ContentScale.Crop
                    , modifier = modifier.weight(3f)
                )
                Text("Create a\nStory",modifier.padding(horizontal = 16.dp, vertical = 6.dp).weight(1.5f).fillMaxWidth(), textAlign = TextAlign.Center)
            }
        }
        Box(modifier.offset(x = 44.dp , y = 107.dp).background(color = Color.White, shape = CircleShape)) {
            Icon(
                imageVector = Icons.Default.AddCircle,
                contentDescription = "create a story",
                tint = Color.Blue,
                modifier = modifier

            )
        }
    }
}