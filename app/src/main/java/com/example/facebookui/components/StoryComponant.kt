package com.example.facebookui.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.facebookui.R

@Preview(showBackground = true)
@Composable
fun Story(modifier: Modifier = Modifier) {
    Box(modifier.size(height = 178.dp, width = 112.dp).clip(
        RoundedCornerShape(16.dp)
    )){
        Box(modifier) {
            Image(
                painter = painterResource(
                    id = R.drawable.story1
                ),
                contentDescription = "story profile",
                contentScale = ContentScale.Crop
            )
        }
        Box(modifier) {
            Image(
                painter = painterResource(
                    id = R.drawable.story1
                ),
                contentDescription = "story profile",
                contentScale = ContentScale.Crop,
                modifier = modifier.padding(4.dp).clip(CircleShape).size(height = 40.dp, width = 40.dp)
                    .border(
                    width = 2.dp,
                    color = Color.Blue,
                    shape = CircleShape,
                )

            )
        }
    }
}