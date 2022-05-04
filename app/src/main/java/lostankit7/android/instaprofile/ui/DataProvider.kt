package lostankit7.android.instaprofile.ui

import androidx.compose.ui.res.painterResource
import lostankit7.android.instaprofile.R
import lostankit7.android.instaprofile.ui.compose.entity.ImageWithText

object DataProvider {
    val profileTabPost get() = listOf(
        R.drawable.kmm,
        R.drawable.intermediate_dev,
        R.drawable.master_logical_thinking,
        R.drawable.bad_habits,
        R.drawable.multiple_languages,
        R.drawable.learn_coding_fast,
    )

    val profileTab
        get() = listOf(
            ImageWithText(R.drawable.ic_grid, "Posts"),
            ImageWithText(R.drawable.ic_reels, "Reels"),
            ImageWithText(R.drawable.ic_igtv, "IGTV"),
            ImageWithText(R.drawable.profile, "Profile")
        )

    val highlights
        get() = listOf(
            ImageWithText(R.drawable.youtube, "Youtube"),
            ImageWithText(R.drawable.qa, "Q&A"),
            ImageWithText(R.drawable.discord, "Discord"),
            ImageWithText(R.drawable.telegram, "Telegram"),
        )
}