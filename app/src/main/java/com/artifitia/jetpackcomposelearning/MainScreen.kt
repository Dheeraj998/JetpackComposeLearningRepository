package com.artifitia.jetpackcomposelearning

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Notifications
import androidx.compose.material.icons.filled.Settings
import androidx.compose.material3.Icon
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import com.artifitia.jetpackcomposelearning.pages.HomeScreen
import com.artifitia.jetpackcomposelearning.pages.NotificationScreen
import com.artifitia.jetpackcomposelearning.pages.SettingsScreen

@Composable
fun MainScreen(modifier: Modifier = Modifier) {
    val navItemList = listOf(
        NavItem("Home", Icons.Default.Home),
        NavItem("Notifications", Icons.Default.Notifications),
        NavItem("Settings", Icons.Default.Settings),
        )
    var selectedIndex by remember {
        mutableIntStateOf(0)
    }
    Scaffold(modifier = Modifier.fillMaxSize(),
        bottomBar = {
            NavigationBar {
                navItemList.forEachIndexed { index, navItem ->
                    NavigationBarItem(
                        selected = selectedIndex==index,
                        onClick = {
                            selectedIndex=index
                        },
                        icon = {
                            Icon(imageVector = navItem.icon , contentDescription = "icon")
                        },
                        label = {
                            Text(text = navItem.label)
                        }
                    )
                }
            }

        }) { innerPadding ->
        ContentScreen(Modifier.padding(innerPadding),selectedIndex)
    }
}

@Composable
fun ContentScreen(modifier: Modifier = Modifier,selectedIndex:Int) {
  when(selectedIndex){
      0-> HomeScreen()
      1-> NotificationScreen()
      2-> SettingsScreen()


  }
}