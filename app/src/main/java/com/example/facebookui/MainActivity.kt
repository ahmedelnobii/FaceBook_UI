package com.example.facebookui

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.heightIn
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.material3.DividerDefaults
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.facebookui.components.CreateStory
import com.example.facebookui.components.CustomTabBar
import com.example.facebookui.components.FacebookTopBar
import com.example.facebookui.components.Post
import com.example.facebookui.components.Story
import com.example.facebookui.ui.theme.FaceBookUITheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            FaceBookUITheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                        FaceBookUI(modifier = Modifier.padding(innerPadding))
                }
            }
        }
    }
}
@Composable
fun FaceBookUI(modifier: Modifier = Modifier) {
    Column(modifier.background(color = Color.White)) {
        FacebookTopBar()
        LazyColumn()
        {
            item {
                CustomTabBar()
                Spacer(Modifier.height(4.dp))
                LazyRow(
                    modifier = Modifier.height(180.dp)
                ) {
                    item {
                        Spacer(modifier = Modifier.padding(horizontal = 8.dp))
                        CreateStory()
                    }
                    items(10) {
                        Spacer(modifier = Modifier.padding(horizontal = 8.dp))
                        Story()

                    }
                }
                Spacer(modifier = Modifier.height(8.dp))
                HorizontalDivider(Modifier, 1.3.dp, Color.LightGray )
            }
            items(10){
                Spacer(modifier = Modifier.padding(vertical = 8.dp))
                Post()


            }
        }
    }
}
