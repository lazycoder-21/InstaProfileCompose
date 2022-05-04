package lostankit7.android.instaprofile.ui.compose.profile

import androidx.compose.foundation.layout.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import lostankit7.android.instaprofile.R
import lostankit7.android.instaprofile.ui.compose.entity.StoryHighlight

@Composable
fun ProfileScreen() {
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
            highlights = listOf(
                StoryHighlight(painterResource(id = R.drawable.youtube), "Youtube"),
                StoryHighlight(painterResource(id = R.drawable.qa), "Q&A"),
                StoryHighlight(painterResource(id = R.drawable.discord), "Discord"),
                StoryHighlight(painterResource(id = R.drawable.telegram), "Telegram"),
            ), modifier = Modifier
                .fillMaxWidth()
                .padding(20.dp)
        )
    }
}