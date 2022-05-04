package lostankit7.android.instaprofile

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import lostankit7.android.instaprofile.ui.compose.profile.ProfileScreen
import lostankit7.android.instaprofile.ui.theme.InstaProfileTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            InstaProfileTheme {
                Surface(color = MaterialTheme.colors.background) {
                    ProfileScreen()
                }
            }
        }
    }
}
