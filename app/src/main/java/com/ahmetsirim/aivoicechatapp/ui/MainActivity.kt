package com.ahmetsirim.aivoicechatapp.ui

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import com.ahmetsirim.designsystem.theme.AiVoiceChatAppTheme
import com.ahmetsirim.navigation.AiVoiceChatNavHost
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            AiVoiceChatAppTheme {
                AiVoiceChatNavHost()
            }
        }
    }
}
