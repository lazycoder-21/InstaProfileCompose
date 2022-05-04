package lostankit7.android.instaprofile.ui.compose.profile

import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.layout.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import lostankit7.android.instaprofile.ui.DataProvider

@ExperimentalFoundationApi
@Composable
fun ProfileScreen() {
    var selectedPostTabIndex by remember {
        mutableStateOf(0)
    }
    Column(
        modifier = Modifier.fillMaxSize()
    ) {
        Spacer(modifier = Modifier.height(20.dp))
        ProfileScreenTopBar(name = "lazyCoder21", modifier = Modifier.padding(10.dp))
        Spacer(modifier = Modifier.height(4.dp))
        ProfileSection()
        Spacer(modifier = Modifier.height(25.dp))
        ButtonSection()
        Spacer(modifier = Modifier.height(25.dp))
        HighLightSection(
            highlights = DataProvider.highlights, modifier = Modifier
                .fillMaxWidth()
                .padding(20.dp)
        )
        Spacer(modifier = Modifier.height(10.dp))
        ProfilePostTabView(tabs = DataProvider.profileTab) {
            selectedPostTabIndex = it
        }
        when (selectedPostTabIndex) {
            0 -> {
                ProfileTabPostSection(posts = DataProvider.profileTabPost,
                    modifier = Modifier.fillMaxWidth())
            }
        }
    }
}