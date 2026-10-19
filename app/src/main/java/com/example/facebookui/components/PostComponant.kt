package com.example.facebookui.components

import android.graphics.drawable.Icon
import android.widget.Space
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.Message
import androidx.compose.material.icons.automirrored.outlined.InsertComment
import androidx.compose.material.icons.automirrored.outlined.Send
import androidx.compose.material.icons.filled.AddComment
import androidx.compose.material.icons.filled.FavoriteBorder
import androidx.compose.material.icons.filled.Message
import androidx.compose.material.icons.filled.MoreHoriz
import androidx.compose.material.icons.outlined.Bookmark
import androidx.compose.material.icons.outlined.BookmarkBorder
import androidx.compose.material.icons.outlined.ModeComment
import androidx.compose.material.icons.outlined.Send
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.facebookui.R
import java.util.function.IntConsumer

//@Preview(showBackground = true)
@Composable
fun Post (modifier: Modifier = Modifier
          ,name: String = "Ahmed",time : String = "8h",postID : Int = R.drawable.route_profile ) {
    Column() {
        Row(Modifier.fillMaxWidth().height(60.dp).padding(horizontal = 16.dp), verticalAlignment = Alignment.CenterVertically) {
            Image(
                painter = painterResource(
                    id = R.drawable.route_profile
                ),
                contentDescription = "profile photo"
                ,modifier = Modifier.size(
                    width = 53.dp,
                    height = 53.dp
                ).clip(
                    shape = CircleShape
                )
            )
            Spacer(Modifier.size(5.dp))
            Column(verticalArrangement = Arrangement.SpaceAround, modifier = Modifier.weight(1f).fillMaxHeight()) {
                Text(name)
                Text(time)
            }
            Icon(
                contentDescription = "more",
                imageVector = Icons.Default.MoreHoriz,
                tint = Color.Black
            )
        }
        Image(
            modifier = Modifier.padding(vertical = 4.dp).height(271.dp).fillMaxWidth(),
            painter = painterResource(
                id = postID
            ),
            contentDescription = "post",
            contentScale = ContentScale.FillWidth
        )
        Row(modifier = Modifier.padding(horizontal =12.dp )) {
            Icon(
                modifier = Modifier.padding(4.dp),
                imageVector = Icons.Default.FavoriteBorder,
                contentDescription = "Like Icon"
            )
            Icon(
                modifier = Modifier.padding(4.dp),
                imageVector = Icons.Outlined.ModeComment,
                contentDescription = "Like Icon"
            )
            Icon(
                modifier = Modifier.padding(4.dp),
                imageVector = Icons.AutoMirrored.Outlined.Send,
                contentDescription = "Like Icon"
            )
            Spacer(modifier = Modifier.weight(1f))
            Icon(
                modifier = Modifier.padding(4.dp),
                imageVector = Icons.Outlined.BookmarkBorder,
                contentDescription = "Like Icon"
            )
        }
    }
}