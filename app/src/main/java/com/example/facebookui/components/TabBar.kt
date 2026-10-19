package com.example.facebookui.components

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Notifications
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.filled.Storefront
import androidx.compose.material.icons.filled.OndemandVideo
import androidx.compose.material3.Icon
import androidx.compose.material3.Tab
import androidx.compose.material3.TabRow
import androidx.compose.material3.TabRowDefaults
import androidx.compose.material3.TabRowDefaults.tabIndicatorOffset
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

// تعريف الألوان
val SelectedBlue = Color(0xFF1877F2) // لون أزرق مثل فيسبوك
val UnselectedGray = Color(0xFF65676B)

data class NavigationTabItem(
    val icon: ImageVector,
    val contentDescription: String
)
@Preview
@Composable
fun CustomTabBar() {
    var selectedTabIndex by remember { mutableIntStateOf(0) }
    val tabItems = listOf(
        NavigationTabItem(Icons.Default.Home, "Home"),
        NavigationTabItem(Icons.Default.OndemandVideo, "Video"),
        NavigationTabItem(Icons.Default.Storefront, "Marketplace"),
        NavigationTabItem(Icons.Default.Person, "Profile"),
        NavigationTabItem(Icons.Default.Notifications, "Notifications")
    )

    TabRow(
        selectedTabIndex = selectedTabIndex,
        containerColor = Color.White,
        contentColor = SelectedBlue,
        indicator = { tabPositions ->
            if (selectedTabIndex < tabPositions.size) {
                TabRowDefaults.SecondaryIndicator(
                    Modifier.tabIndicatorOffset(tabPositions[selectedTabIndex]),
                    height = 3.dp,
                    color = SelectedBlue
                )
            }
        },
        divider = {},
        modifier = Modifier.fillMaxWidth()
    ) {
        tabItems.forEachIndexed { index, item ->
            val isSelected = selectedTabIndex == index

            Tab(
                selected = isSelected,
                onClick = { selectedTabIndex = index },
                icon = {
                    Icon(
                        imageVector = item.icon,
                        contentDescription = item.contentDescription,
                        tint = if (isSelected) SelectedBlue else UnselectedGray,
                        modifier = Modifier.height(28.dp)
                    )
                }
            )
        }
    }
}