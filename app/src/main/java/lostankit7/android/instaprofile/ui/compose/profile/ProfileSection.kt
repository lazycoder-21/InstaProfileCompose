package lostankit7.android.instaprofile.ui.compose.profile

import androidx.compose.foundation.layout.*
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import lostankit7.android.instaprofile.R
import lostankit7.android.instaprofile.ui.compose.common.RoundImage

@Composable
fun ProfileSection(
    modifier: Modifier = Modifier,
) {
    Column(modifier = modifier.fillMaxWidth()) {
        Row(
            verticalAlignment = Alignment.CenterVertically,
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 20.dp)
        ) {
            RoundImage(
                image = painterResource(id = R.drawable.me),
                modifier = Modifier
                    .size(80.dp)
                    .weight(3f)
            )
            Spacer(modifier = Modifier.width(16.dp))
            StatsSection(modifier = Modifier.weight(7f))
        }
        ProfileDescription(
            displayName = "Android Developer",
            description = "Interested in Android , Kotlin , DS Algo",
            url = "lazyCoder21.medium.com",
            followedBy = listOf("droid", "Ankit"),
            otherCount = 20
        )
    }
}

@Composable
fun ProfileDescription(
    displayName: String,
    description: String,
    url: String,
    followedBy: List<String>,
    otherCount: Int,
) {
    val letterSpacing = .5.sp
    val lineHeight = 20.sp

    Column(
        modifier = Modifier
            .fillMaxWidth()
            .padding(horizontal = 20.dp)
    ) {
        Text(
            text = displayName,
            fontWeight = FontWeight.Bold,
            letterSpacing = letterSpacing,
            lineHeight = lineHeight
        )
        Text(
            text = description,
            letterSpacing = letterSpacing,
            lineHeight = lineHeight
        )
        Text(
            text = url,
            letterSpacing = letterSpacing,
            color = Color(0xFF3D3D91),
            lineHeight = lineHeight
        )
        if (followedBy.isNotEmpty()) {
            Text(text = buildAnnotatedString {
                val boldStyle = SpanStyle(color = Color.Black, fontWeight = FontWeight.Bold)
                append("Followed by ")
                followedBy.forEachIndexed { index, name ->
                    pushStyle(boldStyle)
                    append(name)
                    pop()
                    if (index < followedBy.size - 1)
                        append(",")
                }
                if (otherCount > 2) {
                    append(" and ")
                    pushStyle(boldStyle)
                    append("$otherCount others")
                }
            }, letterSpacing = letterSpacing, lineHeight = lineHeight)
        }
    }
}

@Composable
fun StatsSection(
    modifier: Modifier = Modifier,
) {
    Row(
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.SpaceAround,
        modifier = modifier
    ) {
        ProfileStat(numberText = "999", title = "Posts")
        ProfileStat(numberText = "100K", title = "Followers")
        ProfileStat(numberText = "100", title = "Following")
    }
}

@Composable
fun ProfileStat(
    numberText: String,
    title: String,
    modifier: Modifier = Modifier,
) {
    Column(
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = modifier
    ) {
        Text(text = numberText, fontWeight = FontWeight.Bold, fontSize = 20.sp)
        Spacer(modifier = Modifier.height(4.dp))
        Text(text = title)
    }
}